package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        Fact.calc(-1);
    }

    @Test
    public void calcCorrect() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is(120));
    }

}