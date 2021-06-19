package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        boolean condition = max(second, third) > first;
        int result = condition ? max(second, third) : first;
        return result;
    }

    public static int max(int first, int second, int third, int forth) {
        boolean condition = max(first, second, third) > forth;
        int result = condition ? max(first, second, third) : forth;
        return result;
    }

}

