package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP25K4ThenSquare16() {
        // Input parameters
        int p = 25;
        int k = 4;
        // Expected value
        double expected = 16.0;
        // Target method call
        double result = SqArea.square(p, k);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP50K2ThenSquare128() {
        // Input parameters
        int p = 50;
        int k = 2;
        // Expected value
        double expected = 128.0;
        // Target method call
        double result = SqArea.square(p, k);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP90K8ThenSquare200() {
        // Input parameters
        int p = 90;
        int k = 8;
        // Expected value
        double expected = 200.0;
        // Target method call
        double result = SqArea.square(p, k);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }
}