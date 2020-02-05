package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void when6() {
        int s = SqMax.max(6, 7, 6, 4);
        assertThat(s, is(6));
    }
    @Test
    public void when4() {
        int s = SqMax.max(3, 4, 7, 6);
        assertThat(s, is(4));
    }
    @Test
    public void when7() {
        int s = SqMax.max(8, 3, 7, 6);
        assertThat(s, is(7));
    }
    @Test
    public void when5() {
        int s = SqMax.max(3, 4, 2, 5);
        assertThat(s, is(5));
    }
}
