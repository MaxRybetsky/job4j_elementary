package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegative() {
        new Fact().calc(-20);
    }

    @Test
    public void whenNIsPositive() {
        assertThat(
                new Fact().calc(4),
                is(24)
        );
    }
}