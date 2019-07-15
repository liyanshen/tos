package com.leu.service.impl;

import com.leu.dao.SysUserDao;
import com.leu.domain.SysUser;
import com.leu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser select() {
        return this.sysUserDao.select();
    }

    @Override
    public SysUser selectByName(String sysUserName) {
        return this.sysUserDao.selectByName(sysUserName);
    }
}
