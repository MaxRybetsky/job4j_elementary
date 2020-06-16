package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 5);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6.0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1.0;
        assertThat(result, is(expected));
    }
}