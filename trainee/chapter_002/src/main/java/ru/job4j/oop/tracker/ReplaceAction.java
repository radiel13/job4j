package ru.job4j.oop.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Type an id: ");
        System.out.println("=== Replace the item ====");
        String name = input.askStr("Enter a name: ");
        Item item = new Item(name);

        if (tracker.replace(id, item)) {
            System.out.println("You have successfully replaced an item.");
        } else {
            System.out.println("Uops! Something went wrong. (here's the tip: check the id you, trash. Try again! Sorry, had a bad day. Don't cry, sweety.");
        }
        return true;
    }
}
