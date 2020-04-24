package ru.job4j.oop.tracker;

public class ExitAction implements UserAction {

    @Override
    public String name() {
        return "=== Exit the Program ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
