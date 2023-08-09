package com.core.im.constant;

public enum BrandEnum {
    APPLE("Apple"), LENOVO("Lenovo");

    BrandEnum(String value) {
        this.value = value;
    }

    private final String value;

    public String getValue() {
        return value;
    }
}
