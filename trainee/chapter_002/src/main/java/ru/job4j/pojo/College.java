package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        s.setFullname("Paul");
        s.setGroup("A1");
        s.setMatriculation(new Date());
        System.out.println("Name is " + s.getFullname() + ", " + "group = " + s.getGroup());
    }
}
