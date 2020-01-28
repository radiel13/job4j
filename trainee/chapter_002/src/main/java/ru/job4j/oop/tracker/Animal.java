package ru.job4j.oop.tracker;

public class Animal {

    String name;

    public Animal(String name) {
        super();
        this.name = name;
    }

    public static void main(String[] args) {

        Animal animal2 = new Animal("Animal2");
        Predator p = new Predator("Predator");
        Tiger t = new Tiger("Tigra");
        Animal a = new Tiger("dsad");

        System.out.println(p.name);
    }
}
