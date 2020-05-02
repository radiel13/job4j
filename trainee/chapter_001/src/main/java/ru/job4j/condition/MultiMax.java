package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        boolean condition = first > second;
        if (condition) {
            condition = first > third;
            result = condition ? first : third;
        } else {
            condition = second > third;
            result = condition ? second : third;
        }
        return result;
    }
}

/*package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition = first > second;
        int result = condition ? first : second;
        boolean condition2 = result > third;
        int result2 = condition2 ? result : third;
        return result2;
    }
}
*/