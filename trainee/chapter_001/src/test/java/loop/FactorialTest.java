package loop;

import ru.job4j.loop.Factorial;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void test() {
        assertThat(
                Factorial.calc(5),
                is(120)
        );
    }

    @Test
    public void ifZero() {
        assertThat(
                Factorial.calc(0),
                is(1)
        );
    }
}
