package ru.job4j.lambda;

import java.util.*;

public class LambdaUsage {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 11", 20),
                new Attachment("image 33", 120),
                new Attachment("image 22", 23)
        };

        Comparator<Attachment> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.getName() + " : " + left.getName());
            return right.getName().compareTo(left.getName());
        };

        Arrays.sort(atts, cmpDescSize);

        for (Attachment s : atts) {
            System.out.println(s);
        }

    }
}

