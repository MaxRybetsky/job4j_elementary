package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 1);
        products[4] = new Product("Meat", 12);

        print(products);
        products = delete(products, 1);
        print(products);
    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void print(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println("Name:" + products[i].getName()
                        + ", count = " + products[i].getCount());
            } else {
                System.out.println("Null");
            }
        }
        System.out.println();
    }
}