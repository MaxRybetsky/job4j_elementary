package ru.job4j.tracker;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.print("Item was created!");
            } else if (select == 1) {
                System.out.println("=== Print All Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Enter ID of item:");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("No such item!");
                    continue;
                }
                System.out.println(item);
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                if (tracker.replace(id, new Item(newName))) {
                    System.out.println("Item was changed!");
                    System.out.println(tracker.findById(id));
                } else {
                    System.out.println("Item wasn't changed, try again.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.println("Enter ID of item");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item was deleted!");
                } else {
                    System.out.println("Item wasn't deleted, try again.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID ====");
                System.out.println("Enter ID of item");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Item was found");
                    System.out.println(item);
                } else {
                    System.out.println("Item wasn't found, try again.");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Enter key name:");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length == 0) {
                    System.out.println("No items with this key name, try again.");
                    continue;
                }
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}