package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CheckTest {

    @Test
    public void whenMonoTrueThenTrue() {
        boolean[] test = new boolean[]{true, true, true};
        assertThat(Check.mono(test), is(true));
    }

    @Test
    public void whenMonoFalseThenTrue() {
        boolean[] test = new boolean[]{false};
        assertThat(Check.mono(test), is(true));
    }

    @Test
    public void whenNotMonoThenFalse() {
        boolean[] test = new boolean[]{true, false, true, false, false, true};
        assertThat(Check.mono(test), is(false));
    }
}