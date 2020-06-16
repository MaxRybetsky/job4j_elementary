package ru.job4j.tracker;

public class Item {
    String id;
    String name;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
        this.name = "No name";
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
