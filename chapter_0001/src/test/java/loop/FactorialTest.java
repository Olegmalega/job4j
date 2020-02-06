package loop;
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc (5);
        //int expected = 1;
        assertThat(rsl, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc (0);
        //int expected = 1;
        assertThat(rsl, is(1));
    }
}
