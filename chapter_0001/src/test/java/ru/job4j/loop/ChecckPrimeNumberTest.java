package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ChecckPrimeNumberTest {
  //  @Test
 //   public void when5() {
 //       boolean rsl = ChecckPrimeNumber.check(5);
  //      assertThat(rsl, is(true));
  //  }

 //   @Test
 //   public void when4() {
 //       boolean rsl = ChecckPrimeNumber.check(4);
  //      assertThat(rsl, is(false));
  //  }

  //  @Test
 //   public void when1() {
 //       boolean rsl = ChecckPrimeNumber.check(1);
  //      assertThat(rsl, is(false));
 //   }
    @Test
    public void when1() {
        boolean rsl = ChecckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
    @Test
    public void when2() {
        boolean rsl = ChecckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }
    @Test
    public void when3() {
        boolean rsl = ChecckPrimeNumber.check(3);
        assertThat(rsl, is(true));
    }
    @Test
    public void when4() {
        boolean rsl = ChecckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }
    @Test
    public void when5() {
        boolean rsl = ChecckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }
    @Test
    public void when6() {
        boolean rsl = ChecckPrimeNumber.check(6);
        assertThat(rsl, is(false));
    }
    @Test
    public void when7() {
        boolean rsl = ChecckPrimeNumber.check(7);
        assertThat(rsl, is(true));
    }
    @Test
    public void when8() {
        boolean rsl = ChecckPrimeNumber.check(8);
        assertThat(rsl, is(false));
    }
    @Test
    public void when9() {
        boolean rsl = ChecckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }
    @Test
    public void when10() {
        boolean rsl = ChecckPrimeNumber.check(10);
        assertThat(rsl, is(false));
    }
    @Test
    public void when11() {
        boolean rsl = ChecckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }
}