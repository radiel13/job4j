package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        int l = Integer.parseInt(left.substring(0, left.indexOf('.')));
        int r = Integer.parseInt(right.substring(0, right.indexOf('.')));

        if (r != l) {
            return Integer.compare(l, r);
        }
        return 0;
    }
}