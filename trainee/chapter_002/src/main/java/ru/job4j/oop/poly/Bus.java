package ru.job4j.oop.poly;

public class Bus implements Transport {

    private int fuel;

    @Override
    public void run() {
        System.out.println("Bus has run 10 km.");
    }

    @Override
    public void passengers() {
        System.out.println("There are some passengers on the bus.");
    }

    @Override
    public double fillUp(int fuel) {
        this.fuel = this.fuel + fuel;
        System.out.println("Bus has " + this.fuel + " gas.");
        return this.fuel;
    }

    public static void main(String[] args) {
        System.out.println("Bus has started.");
        Bus bus = new Bus();
        bus.fillUp(100);
        bus.passengers();
        bus.run();
    }
}
