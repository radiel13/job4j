package condition;

import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void lal() {
        int q = SqMax.max(3, 3, 3, 3);
        assertThat(q, is(3));
    }
}
