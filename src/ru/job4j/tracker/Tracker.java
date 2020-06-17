package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод получения списка всех заявок
     *
     * @return Массив ненулевых элементов Item
     */
    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i] != null) {
                result[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /* Метод получения списка по имени
     *
     * @param key - ключ поиска (ищем по имени)
     * @return Список заявок, чьи имена совпадают с ключом
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                result[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /* Метод получения элемента Item по ID
     *
     * @param id - id заявки
     * @return Объект класса Item, если он есть в массиве, иначе - null
     */
    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rndm = new Random();
        return String.valueOf(rndm.nextLong() + System.currentTimeMillis());
    }
}