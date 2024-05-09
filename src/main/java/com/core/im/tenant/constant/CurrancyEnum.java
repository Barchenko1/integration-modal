package com.core.im.tenant.constant;

public enum CurrancyEnum {
    USD("usd", "$"),
    EURO("euro", "€"),
    PLN("pln", "zł");

    private final String name;
    private final String symbol;

    CurrancyEnum(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
