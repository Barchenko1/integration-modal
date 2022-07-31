package com.core.im.constant;

public enum ColorOptionEnum {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    YELLOW("yellow"),
    PINK("pink"),
    BLACK("black"),
    BROWN("brown"),
    WHITE("white");


    private final String description;

    ColorOptionEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
