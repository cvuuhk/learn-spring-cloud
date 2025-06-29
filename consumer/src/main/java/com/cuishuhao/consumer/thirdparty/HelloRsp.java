package com.cuishuhao.consumer.thirdparty;

public class HelloRsp {

    public String key;

    public String value;

    public HelloRsp() {
    }

    public HelloRsp(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public HelloRsp setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public HelloRsp setValue(String value) {
        this.value = value;
        return this;
    }
}