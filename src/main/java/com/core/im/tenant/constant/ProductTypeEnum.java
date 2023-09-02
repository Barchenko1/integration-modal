package com.core.im.tenant.constant;

public enum ProductTypeEnum {
    CLAUSE("Clause"),
    TECHNICS("Technics");

    ProductTypeEnum(String value) {
        this.value = value;
    }

    private final String value;

    public String getValue() {
        return value;
    }
}
