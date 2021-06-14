package ru.job4j.oop.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {

    private List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        List<Item> itemsNew = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item != null) {
                itemsNew.add(item);
            }
        }
        return itemsNew;
    }

    public List<Item> findByName(String key) {
        List<Item> itemsNew = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item != null && key.equals(item.getName())) {
                itemsNew.add(item);
            }
        }
        return itemsNew;
    }


    public boolean replace(String id, Item item) {
        if (indexOf(id) >= 0) {
            int index = indexOf(id);
            item.setId(id);
            items.set(index, item);
            return true;
        }
        return false;
    }


    public Item findById(String id) {
        if (indexOf(id) < 0) {
            return null;
        }
        return items.get(indexOf(id));
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(String id) {
        if (indexOf(id) >= 0) {
            int i = indexOf(id);
            items.remove(indexOf(id));
            return true;
        }
        return false;
    }

}
