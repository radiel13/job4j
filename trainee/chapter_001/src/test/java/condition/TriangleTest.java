package condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.condition.Triangle;
import ru.job4j.condition.Point;

public class TriangleTest {


    @Test

    public void square() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        Point c = new Point(0, 0);
        Triangle q = new Triangle(a, b, c);
        double result = q.area();
            assertThat(result, is(1.9999999999999991));

    }

    @Test
    public void whenExist() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        Point c = new Point(1, 1);
        Triangle q = new Triangle(a, b, c);
        double result = q.area();
            assertThat(result, is(-1.0));

    }
/*
    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exist(1.0, 1.0, 4.0);
        assertThat(result, is(false));
    }*/
}
