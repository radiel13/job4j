package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 11", 20),
                new Attachment("image 33", 120),
                new Attachment("image 22", 23)
        };
      /*  Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };*/
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);
        Comparator<Attachment> cmpSize = (left, right) -> left.getName().length() - right.getName().length();
        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        Comparator<Attachment> cmpDescSize = (left, right) -> right.getName().compareTo(left.getName());

        Arrays.sort(atts, cmpSize);
        for (Attachment s : atts) {
            System.out.println(s);
        }

        Arrays.sort(atts, cmpText);
        for (Attachment s : atts) {
            System.out.println(s);
        }

        Arrays.sort(atts, cmpDescSize);
        for (Attachment s : atts) {
            System.out.println(s);
        }

    }

}