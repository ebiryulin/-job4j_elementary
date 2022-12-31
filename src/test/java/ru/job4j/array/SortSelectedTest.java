package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3numbersInArray() {
        int[] data = new int[] {2, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5numbersInArray() {
        int[] data = new int[] {11, 7, 9, 8, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9, 10, 11};
        assertThat(result).containsExactly(expected);
    }
}
