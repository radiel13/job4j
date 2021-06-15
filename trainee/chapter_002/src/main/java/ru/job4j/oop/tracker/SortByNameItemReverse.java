package ru.job4j.oop.tracker;

import java.util.Collections;
import java.util.Comparator;

public class SortByNameItemReverse implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return (second.getName().compareTo(first.getName()));
    }
}
