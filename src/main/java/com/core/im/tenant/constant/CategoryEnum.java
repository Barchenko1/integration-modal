package com.core.im.tenant.constant;

public enum CategoryEnum {
    LAPTOPS_AND_COMPUTERS("Laptops and computers"),
    SMARTPHONES_TV_AND_ELECTRONICS("Smartphones, TV and electronics"),
    GOODS_FOR_GAMERS("Goods for gamers"),
    APPLIANCES("Appliances"),
    HOUSEHOLD_PRODUCTS("Household products"),
    TOOLS_AND_AUTO_PRODUCTS("Tools and auto products"),
    PLUMBING_AND_REPAIR("Plumbing and repair"),
    COTTAGE_GARDEN_AND_VEGETABLE_GARDEN("Cottage, garden and vegetable garden"),
    SPORTS_AND_HOBBIES("Sports and hobbies"),
    CLOTHES_SHOES_AND_JEWELRY("Clothes, shoes and jewelry"),
    BEAUTY_AND_HEALTH("beauty and health"),
    CHILDREN_GOODS("Children's goods"),
    PET_SUPPLIES("Pet supplies"),
    OFFICE_SCHOOL_BOOKS("office, school, books"),
    ALCOHOLIC_DRINKS_AND_PRODUCTS("Alcoholic drinks and products"),
    TO_OUR_DEFENDERS("To our defenders"),
    IN_ANY_WEATHER_UP_TO_MINUS40PERCENTS("In any weather up to -40%");

    private final String value;

    CategoryEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
