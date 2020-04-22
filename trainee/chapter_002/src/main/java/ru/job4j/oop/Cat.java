package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public static void main(String[] args) {
        System.out.println("There is gav's food");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There is black's food");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }
}
