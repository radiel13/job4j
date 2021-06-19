package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int y = 0;
        while (y < rsl.length) {
            if (j >= right.length) {
                rsl[y] = left[i];
                i++;
                y++;
                continue;
            } else if (i >= left.length) {
                rsl[y] = right[j];
                j++;
                y++;
                continue;
            }

            if (i < left.length && left[i] <= right[j]) {
                rsl[y] = left[i];
                i++;

            } else if (i < left.length && left[i] >= right[j]) {
                rsl[y] = right[j];
                j++;
            }
            y++;
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
//rsl[y] = left[i] > right[j]?left[i]:right[i];
//y++;
/*

            if(right.length == 0){
                for(int k = 0; k < left.length; k++){
                    rsl[y] = left[k];
                    y++;
                }
                break;
            }*/

/*
                if(left.length == 0){
                    for(int k = 0; k < right.length; k++){
                        rsl[y] = right[k];
                        y++;
                    }
                    break;
                }*/