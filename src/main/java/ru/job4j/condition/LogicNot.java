package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean result = isEven(2);
        System.out.println("2 is even: " + result);

        result = isPositive(3);
        System.out.println("3 is positive: " + result);

        result = notEven(3);
        System.out.println("3 is not even: " + result);

        result = notPositive(-3);
        System.out.println("-3 is not positive: " + result);

        result = notEvenAndPositive(3);
        System.out.println("3 is not even and positive: " + result);

        result = evenOrNotPositive(3);
        System.out.println("3 is even or not positive: " + result);
    }
}
