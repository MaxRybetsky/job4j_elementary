package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX0Y0AndX2Y0ThenDistIs2() {
        // Input parameters
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        // Expected value
        double expected = 2.0;
        // Target method call
        double result = a.distance(b);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenX1Y2AndX4Y6ThenDistIs5() {
        // Input parameters
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        // Expected value
        double expected = 5.0;
        // Target method call
        double result = a.distance(b);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenX5Y5AndX25Y25ThenDistIs28() {
        // Input parameters
        Point a = new Point(5, 5);
        Point b = new Point(25, 25);
        // Expected value
        double expected = 28.28;
        // Target method call
        double result = a.distance(b);
        // Comparison of the received value with the expected
        Assert.assertEquals(expected, result, 0.01);
    }
}