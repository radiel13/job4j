package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LinearFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        double num;
        for (int i = start; i < end; i++) {
            num = func.apply((double) (i));
            rsl.add(num);
        }
        return rsl;
    }
}
