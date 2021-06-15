package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length(); i++) {
            left = left.substring(0, left.indexOf(' '));
            double d = Double.parseDouble(left);
            right = right.substring(0, right.indexOf(' '));
            double f = Double.parseDouble(right);

            if (d != f) {
                return Double.compare(d, f);
            }

        }
        return 0;
    }

}