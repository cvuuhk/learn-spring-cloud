package com.cuishuhao.consumer.dto;

public class LoginRsp {

    private String accessToken;

    private String refreshToken;

    private Long expireAt;

    public String getAccessToken() {
        return accessToken;
    }

    public LoginRsp setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public LoginRsp setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public Long getExpireAt() {
        return expireAt;
    }

    public LoginRsp setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
}