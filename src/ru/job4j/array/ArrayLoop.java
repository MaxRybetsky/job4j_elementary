package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] valuesY = new int[5];

        for (int i = 0; i < valuesY.length; i++) {
            valuesY[i] = i * 2 + 3;
        }

        for (int i = 0; i < valuesY.length; i++) {
            System.out.println(valuesY[i]);
        }
    }
}
