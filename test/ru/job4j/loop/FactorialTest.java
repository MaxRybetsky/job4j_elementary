package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5;
        int expected = 120;
        Assert.assertEquals(expected, Factorial.calc(n));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        Assert.assertEquals(expected, Factorial.calc(n));
    }
}