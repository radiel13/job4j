package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import ru.job4j.condition.MultiMax;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMAx(){
        MultiMax check2 = new MultiMax();
        int result = check2.max(10,5,1);
        assertThat(result,is(10));
    }

    @Test
    public void whenThirdMax(){
        MultiMax check3 = new MultiMax();
        int result = check3.max(1,2,3);
        assertThat(result,is(3));
    }

    @Test
    public void whenEquals(){
        MultiMax check4 = new MultiMax();
        int result = check4.max(2,2,2);
        assertThat(result,is(2));
    }
}