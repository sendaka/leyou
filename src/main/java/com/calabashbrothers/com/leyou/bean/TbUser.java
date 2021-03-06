package com.calabashbrothers.com.leyou.bean;

import com.calabashbrothers.common.entity.BaseEntity;

import java.util.Date;

public class TbUser extends BaseEntity {

    private String username;

    private String password;

    private String phone;

    private Date created;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}