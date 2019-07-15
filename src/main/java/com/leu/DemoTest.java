package com.leu;

import com.leu.service.SysUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoTest {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //SysUserDao sysUserDao = (SysUserDao) applicationContext.getBean("sysUserDao");
        SysUserService sysUserService = (SysUserService) applicationContext.getBean("sysUserService");
        System.out.println(sysUserService.selectByName("123"));
    }
}
