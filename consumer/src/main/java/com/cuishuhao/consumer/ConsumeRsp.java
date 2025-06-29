package com.cuishuhao.consumer;

public class ConsumeRsp {
    String id;
    String keyFromProducer;
    String valueFromProducer;

    public ConsumeRsp() {
    }

    public ConsumeRsp(String id, String keyFromProducer, String valueFromProducer) {
        this.id = id;
        this.keyFromProducer = keyFromProducer;
        this.valueFromProducer = valueFromProducer;
    }

    public String getId() {
        return id;
    }

    public ConsumeRsp setId(String id) {
        this.id = id;
        return this;
    }

    public String getKeyFromProducer() {
        return keyFromProducer;
    }

    public ConsumeRsp setKeyFromProducer(String keyFromProducer) {
        this.keyFromProducer = keyFromProducer;
        return this;
    }

    public String getValueFromProducer() {
        return valueFromProducer;
    }

    public ConsumeRsp setValueFromProducer(String valueFromProducer) {
        this.valueFromProducer = valueFromProducer;
        return this;
    }
}