package com.leu.domain;

public class SysUser {
    public int sysUserId;

    public String sysUserName;

    public String sysUserPassword;

    public int sysUserType;

    public SysUser(int sysUserId, String sysUserName, String sysUserPassword, int sysUserType) {
        this.sysUserId = sysUserId;
        this.sysUserName = sysUserName;
        this.sysUserPassword = sysUserPassword;
        this.sysUserType = sysUserType;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sysUserId=" + sysUserId +
                ", sysUserName='" + sysUserName + '\'' +
                ", sysUserPassword='" + sysUserPassword + '\'' +
                ", sysUserType=" + sysUserType +
                '}';
    }

    public int getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(int sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public String getSysUserPassword() {
        return sysUserPassword;
    }

    public void setSysUserPassword(String sysUserPassword) {
        this.sysUserPassword = sysUserPassword;
    }

    public int getSysUserType() {
        return sysUserType;
    }

    public void setSysUserType(int sysUserType) {
        this.sysUserType = sysUserType;
    }
}
