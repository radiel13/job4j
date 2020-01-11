package Counter;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void test() {
        assertThat(
                Counter.add(1, 10),
                is(30)
        );
    }
}
