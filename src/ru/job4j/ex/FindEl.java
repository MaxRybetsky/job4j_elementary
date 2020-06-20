package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                return i;
            }
        }
        throw new ElementNotFoundException("No such element in array");
    }

    public static void main(String[] args) {
        String[] values = {
                "C++", "Java", "C#"
        };

        try {
            System.out.println(indexOf(values, "Java"));
            System.out.println(indexOf(values, "PHP"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}