package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqareaTest {
    @Test
    public void squeare(){
        int in1 = 6;
        int in2 = 2;
        int expected = 2;
        double out = Sqarea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
