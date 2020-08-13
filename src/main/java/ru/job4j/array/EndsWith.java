package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int delta = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[i + delta]) {
                return false;
            }
        }
        return true;
    }
}