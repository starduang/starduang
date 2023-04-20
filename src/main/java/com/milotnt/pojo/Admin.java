package com.milotnt.pojo;

/**
 * @author 陈星
 * @date 2022/8/10
 */
public class Admin {

    private Integer adminAccount;
    private String adminPassword;

    public Integer getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(Integer adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminAccount=" + adminAccount +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}