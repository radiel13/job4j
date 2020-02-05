package ru.job4j.oop.inheritance;

public class Doctor extends Profession {

    private int numOfPacientsPerDay;

    public void ressurect() {

    }
    public Diagnose heal(Pacient pacient) {
        return new Diagnose(pacient);
    }

}
