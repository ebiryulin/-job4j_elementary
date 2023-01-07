package ru.job4j.array;

import javax.swing.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            //if (code != isSpecialSymbol(code) && code != isUpperLatinLetter(code)
            //&& isLowerLatinLetter(code) && isDigit(code) && isUpperCase(code)
            //&& isEmpty()) {
            //return false;
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code != 36 || code != 95) {
            return false;
        }
        return true;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code < 65 || code > 90) {
            return false;
        }
        return true;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code < 97 || code > 122) {
            return false;
        }
        return true;
    }

    public static boolean isDigit(int code) {
        if (code < 49  || code > 57) {
            return false;
        }
        return true;
    }

    public static boolean isUpperCase(int code) {
        if (code >= 65  || code <= 90) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (isEmpty()) {
            return true;
        }
        return false;
    }
}
