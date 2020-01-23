package ru.job4j.calculate;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        double tmp = add(second, third);
        return add(first, tmp);
    }

    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void multiple(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public void main(String[] args) {
        add(2, 3, 3);
        subtract(15.4, 11.2);
        multiple(4, 5);
        div(10, 2);
    }
}
