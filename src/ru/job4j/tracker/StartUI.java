package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu(input);
            int select = input.askInt("Select:");
            if (select == 0) {
                input.print("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                input.print("Item was created!");
            } else if (select == 1) {
                input.print("=== Print All Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    input.print(items[i].toString());
                }
            } else if (select == 2) {
                input.print("=== Edit item ====");
                int id = input.askInt("Enter ID of item:");
                Item item = tracker.findById(id);
                if (item == null) {
                    input.print("No such item!");
                    continue;
                }
                input.print(item.toString());
                String newName = input.askStr("Enter new name: ");
                if (tracker.replace(id, new Item(newName))) {
                    input.print("Item was changed!");
                    input.print(tracker.findById(id).toString());
                } else {
                    input.print("Item wasn't changed, try again.");
                }
            } else if (select == 3) {
                input.print("=== Delete Item ====");
                int id = input.askInt("Enter ID of item");
                if (tracker.delete(id)) {
                    input.print("Item was deleted!");
                } else {
                    input.print("Item wasn't deleted, try again.");
                }
            } else if (select == 4) {
                input.print("=== Find item by ID ====");
                int id = input.askInt("Enter ID of item");
                Item item = tracker.findById(id);
                if (item != null) {
                    input.print("Item was found\n" + item.toString());
                } else {
                    input.print("Item wasn't found, try again.");
                }
            } else if (select == 5) {
                input.print("=== Find items by name ====");
                String name = input.askStr("Enter key name:");
                Item[] items = tracker.findByName(name);
                if (items.length == 0) {
                    input.print("No items with this key name, try again.");
                    continue;
                }
                for (int i = 0; i < items.length; i++) {
                    input.print(items[i].toString());
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu(Input input) {
        input.print("Menu.");
        input.print("0. Add new Item");
        input.print("1. Show all items");
        input.print("2. Edit item");
        input.print("3. Delete item");
        input.print("4. Find item by Id");
        input.print("5. Find items by name");
        input.print("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        StartUI startUI = new StartUI();
        startUI.init(input, tracker);
    }
}