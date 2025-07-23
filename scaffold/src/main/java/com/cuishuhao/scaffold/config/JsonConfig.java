package com.cuishuhao.scaffold.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JsonConfig {

    @Bean
    @Primary
    public ObjectMapper defaultObjectMapper() {
        return JsonMapper.builder()
                .disable(MapperFeature.ALLOW_COERCION_OF_SCALARS) // 严格类型匹配：不允许自动进行类型转换
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES) // 忽略未知字段
                .build();
    }

    @Bean
    // todo: 日志专用，自动根据注解对敏感数据脱敏
    public ObjectMapper sensitiveObjectMapper() {
        return JsonMapper.builder().build();
    }
}