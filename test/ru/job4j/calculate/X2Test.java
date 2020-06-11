package ru.job4j.calculate;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenBCZero() {
        // Input parameters
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        // Expected value
        int expected = 40;
        // Target method call
        int rsl = X2.calc(a, b, c, x);
        // Comparison of the received value with the expected
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenABCOne() {
        // Input parameters
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        // Expected value
        int expected = 3;
        // Target method call
        int rsl = X2.calc(a, b, c, x);
        // Comparison of the received value with the expected
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenAZero() {
        // Input parameters
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        // Expected value
        int expected = 2;
        // Target method call
        int rsl = X2.calc(a, b, c, x);
        // Comparison of the received value with the expected
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCZero() {
        // Input parameters
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        // Expected value
        int expected = 2;
        // Target method call
        int rsl = X2.calc(a, b, c, x);
        // Comparison of the received value with the expected
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenXZero() {
        // Input parameters
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        // Expected value
        int expected = 1;
        // Target method call
        int rsl = X2.calc(a, b, c, x);
        // Comparison of the received value with the expected
        assertThat(rsl, is(expected));
    }
}