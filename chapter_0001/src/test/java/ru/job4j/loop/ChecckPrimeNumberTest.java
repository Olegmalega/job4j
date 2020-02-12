package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ChecckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = ChecckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = ChecckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = ChecckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}