package ru.job4j.oop;

public class Battery {
    private int charge;

    public void exchange(Battery another) {
        another.charge += this.charge;
        this.charge = 0;
    }
}
