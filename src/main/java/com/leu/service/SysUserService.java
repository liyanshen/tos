package com.leu.service;

import com.leu.domain.SysUser;

public interface SysUserService {
    SysUser select();

    SysUser selectByName(String sysUserName);
}
