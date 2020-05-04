package ru.job4j.oop.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction() {

        };
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    /*@Test
    public void initTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        UserAction action = actions[select];
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction() {

        };
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. === Create a new Item ===")
                .add("1. === List of Items ===")
                .add("2. === Replace Item ===")
                .add("3. === Delete Item ===")
                .add("4. === Find Item by ID ===")
                .add("5. === Find Item by Name ===")
                .add("6. === Exit the Program ===")
                .add("Select: ")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
*/
  /*  @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC", "NASTYUSHKA", "INDYUSHKA"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[2];
        Item expected = new Item("INDYUSHKA");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId() // id сохраненной заявки в объект tracker.
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }*/
}