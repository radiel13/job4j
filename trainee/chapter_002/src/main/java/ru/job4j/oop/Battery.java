package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public static void main(String[] args) {
        Battery energizer = new Battery(50);
        Battery duracel = new Battery(20);
        System.out.println("value 1: " + energizer.load + " value 2: " + duracel.load);
        energizer.exchange(duracel);
        System.out.println("value 1: " + energizer.load + " value 2: " + duracel.load);
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
}
