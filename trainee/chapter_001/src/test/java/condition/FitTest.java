package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Fit;

public class FitTest {

    @Test
    public void manWeight(){
        double in = 176.0;
        double expected = 87.39;
        double out = Fit.manWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight(){

        double in = 169.0;
        double expected = 67.85;
        double out = Fit.womanWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }
}
