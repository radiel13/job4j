package ru.job4j.calculate;

public class Car {
    private double volume;

    public void drive(int kilometer){
        this.volume = this.volume - kilometer;
        boolean canDrive = this.volume > 0;
        if(canDrive) {
            System.out.println("Beep! Let's go!");
        } else {
            System.out.println("Fck this shiet, I stay.");
        }
    }

    public void fill(int gas){
        this.volume = this.volume + 10 * gas;
    }

    public boolean canDrive(){
        boolean result = this.volume > 0;
        if(result){
            System.out.println("Beep! Let's go!");
        }
        return result;
    }

    public void gasInfo(){
        System.out.println("I can drive " + this.volume + " kilometers.");
    }
}
