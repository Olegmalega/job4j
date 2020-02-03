package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then5() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }
    @Test
    public void whenMin2To1Then2() {
        int result = Max.min(3, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstEquallySecondThen4() {
        int result = Max.Equally(4, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(3, 5);
        assertThat(result, is(5));
    }
}