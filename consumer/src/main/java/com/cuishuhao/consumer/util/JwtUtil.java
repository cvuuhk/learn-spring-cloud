package com.cuishuhao.consumer.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class JwtUtil {

    // todo: 从配置中心读取 key
    private static final String SECRET_KEY = "cuishuhao_key";

    public void generateAccessToken(String username) {
        Instant now = Instant.now();
        Instant expiredAt = now.plus(2L, ChronoUnit.HOURS);

        Claims claims = Jwts.claims().add("username", username).add("expiredAt", expiredAt.getEpochSecond()).build();
    }

}