package ru.job4j.oop.tracker;

public class Animal {


    public Animal(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Animal animal2 = new Animal("Animal2");
        Predator p = new Predator("Predator");
        Tiger t = new Tiger("Tigra");
    }
}
