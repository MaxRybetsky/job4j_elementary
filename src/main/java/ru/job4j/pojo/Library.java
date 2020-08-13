package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaCore = new Book("Java Core", 1000);
        Book cleanCode = new Book("Clean Code", 854);
        Book cssBook = new Book("Css Book", 540);
        Book structBook = new Book("Algorithms and Data Structures in Java", 1235);

        Book[] books = new Book[]{javaCore, cleanCode, cssBook, structBook};

        print(books);

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        print(books);

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i]);
            }
        }
    }

    public static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }
}
