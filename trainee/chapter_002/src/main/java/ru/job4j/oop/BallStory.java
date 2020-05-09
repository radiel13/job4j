package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare zayac = new Hare();

        ball.tryEat(ball);
        zayac.tryEat(ball);
        wolf.tryEay(ball);
        fox.tryEat(ball);
    }
}
