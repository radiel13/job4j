package ru.job4j.oop.inheritance;


public class Diagnose {

    public Diagnose(Pacient pacien) {

    }

    public static void main(String[] args) {
        Pacient p = new Pacient();
        Diagnose d = new Diagnose(p);

        p.setIllness("headache");
        d.diagnose(p);
        d.heal(p);
    }

    public void diagnose(Pacient pacient) {
        System.out.println("Our pacient has a " + pacient.getIllness());
    }

    public void heal(Pacient pacient) {
        System.out.println("Our pacient has been healed!");
    }
}
