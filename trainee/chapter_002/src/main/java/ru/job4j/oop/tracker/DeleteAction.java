package ru.job4j.oop.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Type an ID of the item to delete: ");
        if (tracker.delete(id)) {
            System.out.println("You have successfully deleted an item.");
        } else {
            System.out.println("Uops! Something went wrong. It doesn't want to be erased... Try again!");
        }
        return true;
    }
}
