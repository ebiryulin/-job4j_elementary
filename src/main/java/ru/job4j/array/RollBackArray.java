package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int lastIndex = array.length - 1 - index;
            int temp = array[lastIndex];
            array[lastIndex] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
