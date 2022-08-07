package com.core.im.constant;

public enum RatingEnum {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int rate;

    RatingEnum(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
