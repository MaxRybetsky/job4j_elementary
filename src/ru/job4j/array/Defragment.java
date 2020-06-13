package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String temp = array[i];
                        array[i] = array[point];
                        array[point] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}