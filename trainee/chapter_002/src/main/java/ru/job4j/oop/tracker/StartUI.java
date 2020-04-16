package ru.job4j.oop.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("List of items:");
                Item[] list = tracker.findAll();
                int q = 1;
                for (Item i : list) {
                    System.out.println(q + ". " + i.getId() + ", " + i.getName());
                    q++;
                }

            } else if (select == 2) {
                System.out.println("Type an id: ");
                String id = scanner.nextLine();
                System.out.println("=== Replace the item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);

                if (tracker.replace(id, item)) {
                    System.out.println("You have successfully replaced an item.");
                } else {
                    System.out.println("Uops! Something went wrong. (here's the tip: check the id you, trash. Try again! Sorry, had a bad day. Don't cry, sweety.");
                }

            } else if (select == 3) {
                System.out.println("Type an ID of the item to delete: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("You have successfully deleted an item.");
                } else {
                    System.out.println("Uops! Something went wrong. It doesn't want to be erased... Try again!");
                }

            } else if (select == 4) {
                System.out.println("OKAY LETS FIND SOME STUFF! TYPE AN ID: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println(item.getName());

            } else if (select == 5) {
                System.out.println("OKAY LETS FIND SOME STUFF! TYPE A NAME: ");
                String findName = scanner.nextLine();
                Item[] findItems = tracker.findByName(findName);
                for (Item i : findItems) {
                    System.out.println(i.getId() + ", " + i.getName());
                }

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
        System.out.println("Select: ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
