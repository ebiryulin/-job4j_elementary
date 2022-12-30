package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (char index = 0; index < word.length / 2; index++) {
            if (word[word.length - 1 - index] != post[post.length - 1 - index]) {
                return false;
            }
        }
        return result;
    }
}
