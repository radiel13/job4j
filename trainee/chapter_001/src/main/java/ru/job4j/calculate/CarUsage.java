package ru.job4j.calculate;

public class CarUsage {
    public static void main(String[] args){
        Car audi = new Car();
        boolean driving = audi.canDrive();
        String carSays = driving? "I can drive" : "I can't drive:";
        System.out.println(carSays);
        System.out.println("Can you drive? - " + driving);
        System.out.println("lets go");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("r u okay now? - " + driving);
        System.out.println("LETs finnaly go man");
        System.out.println("Man its like 2400 miles away r u crazy, shit man wtf");
        System.out.println("come on its gonna be fine just relax");
        System.out.println("k sure man, lets go");
        int distance = 10;
        audi.drive(distance);
        audi.gasInfo();
        System.out.println("oh fuck nvm we done");
    }
}
