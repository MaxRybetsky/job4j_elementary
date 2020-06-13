package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort3Elements() {
        assertThat(
                SortSelected.sort(
                        new int[]{9, 8, 3}
                ),
                is(
                        new int[]{3, 8, 9}
                )
        );
    }

    @Test
    public void whenSort5Elements() {
        assertThat(
                SortSelected.sort(
                        new int[]{3, 4, 1, 2, 5}
                ),
                is(
                        new int[]{1, 2, 3, 4, 5}
                )
        );
    }

    @Test
    public void whenSort10Elements() {
        assertThat(
                SortSelected.sort(
                        new int[]{9, 8, 3, 5, 7, 1, 2, 75, 3, 2}
                ),
                is(
                        new int[]{1, 2, 2, 3, 3, 5, 7, 8, 9, 75}
                )
        );
    }
}