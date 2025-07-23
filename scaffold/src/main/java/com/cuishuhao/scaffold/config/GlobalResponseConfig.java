package com.cuishuhao.scaffold.config;

import com.cuishuhao.scaffold.dto.GlobalResponse;
import com.cuishuhao.scaffold.exception.BusinessException;
import com.cuishuhao.scaffold.exception.ExceptionConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestControllerAdvice
public class GlobalResponseConfig implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof GlobalResponse<?>) {
            return body;
        }

        return GlobalResponse.success(body);
    }

    @ExceptionHandler(BindException.class)
    public GlobalResponse<Object> handleBusinessException(BindException e) {
        String message = Optional.of(e)
                .map(BindException::getBindingResult)
                .map(Errors::getAllErrors)
                .map(List::getFirst)
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("参数错误");
        return GlobalResponse.failed(ExceptionConstant.INVALID_PARAMETER, message);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public GlobalResponse<Object> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        if (e.getCause()==null) {
            return GlobalResponse.failed(ExceptionConstant.INVALID_PARAMETER, "请求体缺失");
        }
        return GlobalResponse.failed(ExceptionConstant.INVALID_PARAMETER, "请求体数据格式错误");
    }

    @ExceptionHandler(BusinessException.class)
    public GlobalResponse<Object> handleBusinessException(BusinessException e) {
        logger.info(e.toString(), e);
        return GlobalResponse.failed(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    public GlobalResponse<Object> handleUnknownException(Throwable e) {
        logger.error("未知错误", e);
        return GlobalResponse.failed(ExceptionConstant.UNKNOW, "未知错误");
    }
}