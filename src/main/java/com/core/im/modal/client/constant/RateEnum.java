package com.core.im.modal.client.constant;

public enum RateEnum {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    RateEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
