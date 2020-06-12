package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop findLoop = new FindLoop();
        int el = 5;
        int[] testArray = new int[]{5, 3, 6, 34};
        int expIndex = 0;
        int resultIndex = findLoop.indexOf(testArray, el);
        assertThat(resultIndex, is(expIndex));
    }

    @Test
    public void whenArrayHas8Then6() {
        FindLoop findLoop = new FindLoop();
        int el = 8;
        int[] testArray = new int[]{5, 3, 6, 34, 3, 5, 8, 7, 45, 90};
        int expIndex = 6;
        int resultIndex = findLoop.indexOf(testArray, el);
        assertThat(resultIndex, is(expIndex));
    }

    @Test
    public void whenArrayDoesNotHave7ThenMinus1() {
        FindLoop findLoop = new FindLoop();
        int el = 7;
        int[] testArray = new int[]{4, 3, 6, 34};
        int expIndex = -1;
        int resultIndex = findLoop.indexOf(testArray, el);
        assertThat(resultIndex, is(expIndex));
    }
}