package com.core.im.modal.client.constant;

public enum RoleEnum {
    ROLE_USER("User"),
    ROLE_ADMIN("Admin");

    private final String value;

    RoleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
