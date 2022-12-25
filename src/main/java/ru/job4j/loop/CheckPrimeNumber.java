package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++) {
            if ((number % 2) != 0) {
                return prime;
           } else {
                break;
            }
        }
        return false;
    }
}
