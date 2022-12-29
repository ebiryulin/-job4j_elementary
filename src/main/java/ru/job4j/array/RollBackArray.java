package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length - 1; index++) {
            int lastIndex = array[array.length - 1];
            int currentIndex = lastIndex - array[index];
            result[currentIndex] = array[currentIndex];
        }
        return result;
    }
}
