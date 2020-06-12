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

    @Test
    public void whenFind2Then3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind9Then6() {
        int[] input = new int[]{5, 2, 10, 2, 4, 5, 9, 10, 3};
        int value = 9;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4Then0() {
        int[] input = new int[]{4, 2, 10, 2, 4};
        int value = 4;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoSuchElementThenMinus1() {
        int[] input = new int[]{5, 0, 10, 2, 4};
        int value = 20;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}