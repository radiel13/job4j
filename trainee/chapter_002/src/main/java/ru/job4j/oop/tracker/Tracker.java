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
        if (indexOf(id) >= 0) {
            int index = indexOf(id);
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }

    }

    public Item findById(String id) {
        if (indexOf(id) < 0) {
            return null;
        }
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

    public boolean delete(String id) {
        if (indexOf(id) >= 0) {
            int i = indexOf(id);
            items[indexOf(id)] = null;
            System.arraycopy(items, i + 1, items, i, position - i);
            items[position] = null;
            position--;
            return true;
        } else {
            return false;
        }
    }
}
/*
[0 1 2]
0 = item, id = 111
1 = item_2 id = 222
2 = item_3 id = 333
[null, 1 , 2]
*/