package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LinearFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = LinearFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSqResults() {
        List<Double> result = LinearFunction.diapason(1, 4, x -> 2 * x * x + 7 * x + 9);
        List<Double> expected = Arrays.asList(18D, 31D, 48D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenPkResults() {
        List<Double> result = LinearFunction.diapason(1, 4, x -> Math.pow(5, x));
        List<Double> expected = Arrays.asList(5D, 25D, 125D);
        assertThat(result, is(expected));
    }
}

