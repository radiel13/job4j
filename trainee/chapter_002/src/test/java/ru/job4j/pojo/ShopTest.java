package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void shop() {
        Product[] products = new Product[4];

        products[0] = new Product("beer", 1);
        products[1] = new Product("cheese", 1);
        products[2] = new Product("beef", 1);
        products[3] = new Product("chicken", 1);


        // Assert.assertEquals(expected, out);
    }
}