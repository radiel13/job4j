package ru.job4j.oop.poly;

public class Bus implements Transport {

    private int fuel;

    @Override
    public void run() {
        System.out.println("Bus has run 10 km.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("There are " + number + " passengers on the bus.");
    }

    @Override
    public double fillUp(int fuel) {
        this.fuel = this.fuel + fuel;
        double price =  fuel*2;
        System.out.println("Bus has " + this.fuel + " gas.");
        System.out.println("Cost = " + price + "$");
        return price;
    }

    public static void main(String[] args) {
        System.out.println("Bus has started.");
        Bus bus = new Bus();
        bus.fillUp(100);
        bus.passengers(2);
        bus.run();
        System.out.println();
       }
}
