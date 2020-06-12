package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1]; // массив имеет array.length элементов, но его
        array[array.length - 1] = temp;     // последний елемент имеет индекс array.length - 1
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}