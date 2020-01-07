package ru.job4j.condition;

public class Fit {
    public static double manWeight(double height){

        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height){

        return (height - 110) * 1.15;
    }

    public static void main(String[] args){
        double man = manWeight(176);
        System.out.println("Man 176 cm = " + man);
        double women = womanWeight(169);
        System.out.println("Woman 169 cm = " + women);
    }
}
