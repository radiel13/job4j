package ru.job4j.oop.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindALl() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        Item item4 = new Item("test4");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item4);
        Item[] items = {item, item2, item4};

        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void whenfindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        Item item4 = new Item("test4");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item4);
        Item[] items = {item};
        Item[] result = tracker.findByName("test1");
        assertThat(result, is(items));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}