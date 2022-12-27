package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas7Then3() {
        int[] data = new int[] {5, 10, 3, 7};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = new int[] {5, 10, 3, 7, 9, 10};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
