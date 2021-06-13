package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        HashSet<String> names = new HashSet<String>();
        names.add("Petr");
        names.add("Ivan");
        for (String name : names) {
            System.out.println(name);
        }

        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
