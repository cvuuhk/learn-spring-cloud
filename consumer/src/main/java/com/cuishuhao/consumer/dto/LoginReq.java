package com.cuishuhao.consumer.dto;

public class LoginReq {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public LoginReq setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginReq setPassword(String password) {
        this.password = password;
        return this;
    }
}