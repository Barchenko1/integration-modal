package com.core.im.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainEnumUtil {
    public static void main(String[] args) {
        List<String> categoryList = Arrays.asList(
                "Laptops and computers",
                "Smartphones, TV and electronics",
                "Goods for gamers",
                "Appliances",
                "Household products",
                "Tools and auto products",
                "Plumbing and repair",
                "Cottage, garden and vegetable garden",
                "Sports and hobbies",
                "Clothes, shoes and jewelry",
                "beauty and health",
                "Children's goods",
                "Pet supplies",
                "office, school, books",
                "Alcoholic drinks and products",
                "To our defenders",
                "In any weather up to -40%"
        );
        List<String> subCategoryList = Arrays.asList(
                "Laptopy",
                "Komputery, nettopy, komputery All-In-One Komputery, nettopy, komputery All-In-One",
                "Monitory Monitory",
                "Tablety Tablety",
                "Sprzęt biurowy Sprzęt biurowy",
                "Urządzenia sieciowe Urządzenia sieciowe",
                "Akcesoria elektroniczne Akcesoria elektroniczne",
                "Tablety graficzne Tablety graficzne"
        );
        createOneValueEnum(subCategoryList);
    }

    private static void createOneValueEnum(List<String> stringList) {
        List<String> enumNames = stringList.stream()
                .map(s -> s.replaceAll(" ", "_").toUpperCase())
                .map(s -> s.replaceAll("'S", ""))
                .map(s -> s.replaceAll("-", "MINUS"))
                .map(s -> s.replaceAll("/+", "PLUS"))
                .map(s -> s.replace("%", "PERCENTS"))
                .map(s -> s.replaceAll(",_", "_"))
                .toList();
        int n = enumNames.size();
        List<String> resultEnum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultEnum.add(enumNames.get(i) + "(\"" + stringList.get(i) + "\"),");
            if (i == n - 1) {
                String temp = resultEnum.get(i).replace(",", ";");
                resultEnum.remove(i);
                resultEnum.add(temp);
            }
        }
        resultEnum.forEach(System.out::println);
    }
}
