package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        if (one > two && one > three) {
            return one;
        } else if (two > one && two > three) {
            return two;
        }
        return three;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int number = Max.max(3, 5);
        System.out.println(number);
    }
}
