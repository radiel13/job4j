package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length(); i++) {
            left = left.substring(0, left.indexOf('.'));
            right = right.substring(0, right.indexOf('.'));

            if (Integer.parseInt(left) != Integer.parseInt(right)) {
                return Integer.compare(Integer.parseInt(left), Integer.parseInt(right));
            }


        }
        return 0;
    }

}