package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] expected = new int[]{0, 1, 4};
        int[] result = Square.calculate(bound);
        assertThat(result, is(expected));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] expected = new int[]{0, 1, 4, 9, 16};
        int[] result = Square.calculate(bound);
        assertThat(result, is(expected));
    }
}