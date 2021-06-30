package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        int size = Math.min(s1.length, s2.length);
        if (!s1[0].equals(s2[0])) {
            return s2[0].compareTo(s1[0]);
        }

        return o1.compareTo(o2);
    }
}