package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student max = new Student();
        max.setFullName("Maxim Aleksandrvich Rybetsky");
        max.setGroup("C1-01");
        max.setDate(LocalDate.of(2014, 9, 1));
        System.out.println("Student " + max.getFullName() + " went to group "
                + max.getGroup() + " at " + max.getDate());
    }
}
