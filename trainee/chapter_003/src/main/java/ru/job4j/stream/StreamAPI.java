package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = -5; i < 5; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List<Integer> newNumbers = numbers.stream()
                .filter(integer -> integer >= 0)
                .collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}
