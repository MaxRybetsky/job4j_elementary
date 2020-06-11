package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y0AndX2Y0ThenDistIs2() {
        // Input parameters
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        // Expected value
        double expected = 2.0;
        // Target method call
        double result = Point.distance(x1, y1, x2, y2);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenX1Y2AndX4Y6ThenDistIs5() {
        // Input parameters
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 6;
        // Expected value
        double expected = 5.0;
        // Target method call
        double result = Point.distance(x1, y1, x2, y2);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenX5Y5AndX25Y25ThenDistIs28() {
        // Input parameters
        int x1 = 5;
        int y1 = 5;
        int x2 = 25;
        int y2 = 25;
        // Expected value
        double expected = 28.28;
        // Target method call
        double result = Point.distance(x1, y1, x2, y2);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }
}