package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        int a = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            a = data[index];
            data[index] = data[i];
            data[i] = a;


        }
        return data;
    }
}
