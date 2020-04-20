package ru.job4j.oop.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem(Tracker tracker) {
        System.out.println("List of items:");
        Item[] list = tracker.findAll();
        int q = 1;
        for (Item i : list) {
            System.out.println(q + ". " + i.getId() + ", " + i.getName());
            q++;
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        String id = input.askStr("Type an id: ");
        System.out.println("=== Replace the item ====");
        String name = input.askStr("Enter a name: ");
        Item item = new Item(name);

        if (tracker.replace(id, item)) {
            System.out.println("You have successfully replaced an item.");
        } else {
            System.out.println("Uops! Something went wrong. (here's the tip: check the id you, trash. Try again! Sorry, had a bad day. Don't cry, sweety.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Type an ID of the item to delete: ");
        if (tracker.delete(id)) {
            System.out.println("You have successfully deleted an item.");
        } else {
            System.out.println("Uops! Something went wrong. It doesn't want to be erased... Try again!");
        }
    }

    public static void findItemId(Input input, Tracker tracker) {
        String id = input.askStr("OKAY LETS FIND SOME STUFF! TYPE AN ID: ");
        Item item = tracker.findById(id);
        System.out.println(item.getName());
    }

    public static void findItemName(Input input, Tracker tracker) {
        String findName = input.askStr("OKAY LETS FIND SOME STUFF! TYPE A NAME: ");
        Item[] findItems = tracker.findByName(findName);
        for (Item i : findItems) {
            System.out.println(i.getId() + ", " + i.getName());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");

            if (select == 0) {
                StartUI.createItem(input, tracker);

            } else if (select == 1) {
                StartUI.showItem(tracker);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);

            } else if (select == 4) {
                StartUI.findItemId(input, tracker);

            } else if (select == 5) {
                StartUI.findItemName(input, tracker);

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
