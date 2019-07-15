package com.leu.controller;

import com.leu.domain.SysUser;
import com.leu.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {
    private final Logger log = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String sysUserName = request.getParameter("sysUserName");
        String sysUserPassword =  request.getParameter("sysUserPassword");
        log.info("sysUserName="+sysUserName + "and sysUserPassword=" + sysUserPassword);
        System.out.println("sysUserName="+sysUserName);
        System.out.println("sysUserPassword="+sysUserPassword);
        response.setCharacterEncoding("UTF-8");
        SysUser sysUser = sysUserService.selectByName(sysUserName);
        if(sysUser != null){
            System.out.println(sysUser.toString());
            if (sysUser.getSysUserPassword().equals(sysUserPassword)){
                log.info("login success");
                if (sysUser.getSysUserType() == 0){
                    response.getWriter().write("0");
                }else{
                    response.getWriter().write("1");
                }

            }else{
                log.info("password is wrong");
                response.getWriter().write("密码错误");
            }
        }else{
            log.info("the user named " + sysUserName + "not exist");
            response.getWriter().write("用户不存在");
        }
        response.getWriter().close();
    }
}
