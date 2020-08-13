package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (el == data[i]) {
                return i;
            }
        }
        return -1;
    }
}
