package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax110To250Then250() {
        int result = Max.max(110, 250);
        assertThat(result, is(250));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To1To4Then5() {
        int result = Max.max(5, 1, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To1To1Then1() {
        int result = Max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax17To17To17To17Then17() {
        int result = Max.max(17, 17, 17, 17);
        assertThat(result, is(17));
    }
}