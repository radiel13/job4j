package ru.job4j.array;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5ThenNemo() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindNothing() {
        int[] input = new int[]{5, 2, 10, 2, 4, 1, 7, 8, 9, 13};
        int value = 15;
        int start = 0;
        int finish = 9;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}