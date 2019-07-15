package com.leu.dao;

import com.leu.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {
    SysUser select();

    SysUser selectByName(String sysUserName);
}
