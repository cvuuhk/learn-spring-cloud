package com.cuishuhao.scaffold.util;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;

public class SnowFlakeUtil {

    private static final DefaultIdentifierGenerator GENERATOR = DefaultIdentifierGenerator.getInstance();

    public Long nextId() {
        return GENERATOR.nextId(null);
    }
}