package ru.job4j.oop.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find Item by Name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String findName = input.askStr("OKAY LETS FIND SOME STUFF! TYPE A NAME: ");
        Item[] findItems = tracker.findByName(findName);
        for (Item i : findItems) {
            System.out.println(i.getId() + ", " + i.getName());
        }
        return true;
    }
}
