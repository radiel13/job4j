package ru.job4j.oop.tracker;

<<<<<<< HEAD
public class CreateAction implements UserAction {
=======
public class CreateAction implements UserAction{
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
    @Override
    public String name() {
        return "=== Create a new Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
