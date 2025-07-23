package com.cuishuhao.scaffold.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GlobalResponse<T> {

    public static final String SUCCESS_CODE = "0000_0000";

    private String code;

    private String message;

    private T data;

    private GlobalResponse(String success, String message, T data) {
        this.code = success;
        this.message = message;
        this.data = data;
    }

    public static <T> GlobalResponse<T> success(String message, T data) {
        return new GlobalResponse<>(SUCCESS_CODE, message, data);
    }

    public static <T> GlobalResponse<T> success(T data) {
        return success(null, data);
    }

    public static <T> GlobalResponse<T> failed(String code, String message, T data) {
        return new GlobalResponse<>(code, message, data);
    }

    public static <T> GlobalResponse<T> failed(String code, String message) {
        return failed(code, message, null);
    }

}