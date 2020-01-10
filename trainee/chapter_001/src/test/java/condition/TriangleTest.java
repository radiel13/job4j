package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.condition.Triangle;

public class TriangleTest {
    @Test
    public void whenExist(){
        boolean result = Triangle.exist(2.0, 2.0, 1.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotExist(){
        boolean result = Triangle.exist(1.0, 1.0, 4.0);
        assertThat(result, is(false));
    }
}
