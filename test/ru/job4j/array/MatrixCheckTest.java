package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        assertThat(
                MatrixCheck.monoHorizontal(input, 1),
                is(true)
        );
    }

    @Test
    public void whenDoesNotHaveMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'O', 'X'},
                {' ', ' ', ' '},
        };
        assertThat(
                MatrixCheck.monoHorizontal(input, 1),
                is(false)
        );
    }
}