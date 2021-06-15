package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length(); i++) {
            left = left.substring(0, left.indexOf('.'));
            int d = Integer.parseInt(left);
            right = right.substring(0, right.indexOf('.'));
            int f = Integer.parseInt(right);

            if (d != f) {
                return Integer.compare(d, f);
            }

        }
        return 0;
    }

}