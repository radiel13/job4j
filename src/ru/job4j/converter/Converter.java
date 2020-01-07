package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles = " + euro + " euro.");
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles = " + dollar + "  dollar.");
        int ruble = euroToRuble(5);
        System.out.println("5 euro = " + ruble + " rubles.");
        ruble = dollarToRuble(7);
        System.out.println("7 dollars = " + ruble + " rubles.");


    }
}
