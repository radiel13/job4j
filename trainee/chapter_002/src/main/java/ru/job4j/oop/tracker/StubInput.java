package ru.job4j.oop.tracker;

public class StubInput implements Input {

    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
<<<<<<< HEAD

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
=======
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
}
