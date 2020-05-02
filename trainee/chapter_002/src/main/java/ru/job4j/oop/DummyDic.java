package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String word = "what";
        System.out.println("Неизвестное слово " + dic.engToRus(word));

    }

    public String engToRus(String eng) {
        return eng;
    }
}