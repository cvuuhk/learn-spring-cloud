package com.cuishuhao.scaffold.exception;

// 通用异常
public class GlobalException extends RuntimeException {

    protected String code;

    protected String message;

    public GlobalException(String message) {
        super(message);
    }
}