package com.cuishuhao.scaffold.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GlobalResponse<T> {

    public static final String SUCCESS_CODE = "0000_0000";

    private String code;

    private String message;

    private T data;

    public GlobalResponse(String success, T data) {
        this.code = success;
        this.data = data;
    }

    public static <T> GlobalResponse<T> success() {
        return new GlobalResponse<>();
    }

    public static <T> GlobalResponse<T> success(T data) {
        return new GlobalResponse<>(SUCCESS_CODE, data);
    }
}