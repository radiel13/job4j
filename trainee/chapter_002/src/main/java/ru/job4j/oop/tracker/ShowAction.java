package ru.job4j.oop.tracker;

import java.util.List;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== List of Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("List of items:");
        List<Item> list = tracker.findAll();
        int q = 1;
        for (Item i : list) {
            System.out.println(q + ". " + i.getId() + ", " + i.getName());
            q++;
        }
        return true;
    }
}
