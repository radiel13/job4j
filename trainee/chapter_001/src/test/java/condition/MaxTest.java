package condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void when1to2() {
        assertThat(
                Max.max(1, 2),
                is(2)
        );
    }

    @Test
    public void when2to1() {
        assertThat(
                Max.max(2, 1),
                is(2)
        );

    }

    @Test
    public void whenEqual() {
        assertThat(
                Max.max(2, 2),
                is(2)
        );

    }

}
