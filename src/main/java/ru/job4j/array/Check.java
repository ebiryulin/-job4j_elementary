package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[data.length - index - 2]) {
                return false;
            }
        }
        return true;
    }
}

