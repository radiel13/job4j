package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        Point p = new Point(2, 2, 2);
        Point po = new Point(4, 4, 4);
        double expected = 3.464101615137755;
        double out = p.distance3d(po);
        Assert.assertEquals(expected, out, 0.01);
    }
}

/*package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        int in1 = 2;
        int in2 = 10;
        int in3 = 5;
        int in4 = 2;
        double expected = 8.54;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
*/