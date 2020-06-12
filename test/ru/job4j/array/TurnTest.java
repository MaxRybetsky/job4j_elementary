package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] test = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected = new int[]{6, 5, 4, 3, 2, 1};
        assertThat(Turn.back(test), is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertThat(Turn.back(test), is(expected));
    }
}