package ru.job4j.oop.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        int size = 0;
        Item[] itemsNew = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                itemsNew[size] = item;
                size++;
            }
        }
        itemsNew = Arrays.copyOf(itemsNew, size);
        return itemsNew;
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] itemsNew = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null && key.equals(item.getName())) {
                itemsNew[size] = item;
                size++;
            }
        }
        itemsNew = Arrays.copyOf(itemsNew, size);
        return itemsNew;
    }

    public boolean replace(String id, Item item) {
    int index = indexOf(id);
    item.setId(id);
    items[index] = item;
    return true;
    }

    public Item findById(String id) {
        return items[indexOf(id)];
    }


    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}