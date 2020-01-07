package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        double first = Math.pow((x2-x1), 2);
        double second = Math.pow((y2-y1), 2);
        return Math.sqrt(first+second);
    }

    public static void main(String[] args) {
        double result = distance(2, 10, 5, 2);
        System.out.println("result(2,10) to (5,2) is " + result);
    }
}
