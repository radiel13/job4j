package ru.job4j.pojo;
import java.util.Date;


public class Police {
    public static void main(String[] args){
        License license = new License();
        license.setOwner("Paul");
        license.setModel("bmw");
        license.setCode("xx001x");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode() + " , date -  " + license.getCreated());

    }
}
