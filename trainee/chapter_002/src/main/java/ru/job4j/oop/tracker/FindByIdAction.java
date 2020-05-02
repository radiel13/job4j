package ru.job4j.oop.tracker;

public class FindByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find Item by ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("OKAY LETS FIND SOME STUFF! TYPE AN ID: ");
        Item item = tracker.findById(id);
        System.out.println(item.getName());
        return true;
    }
}
