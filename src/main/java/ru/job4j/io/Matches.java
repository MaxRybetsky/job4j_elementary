package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matchNumber = 11;
        int player = 1;
        System.out.println("Спичек на старте: " + matchNumber);
        while (matchNumber != 0) {
            System.out.println("Ход Игрока " + player);
            int round = input.nextInt();
            if (matchNumber - round < 0 || round < 1 || round > 3) {
                System.out.println("Невозможно взять такое количество спичек, возьмите меньшее количество.");
                continue;
            }
            matchNumber -= round;
            System.out.println("Ход выполнен! Осталось спичек: " + matchNumber);
            player = player == 1 ? 2 : 1;
        }
        System.out.println("Победил Игрок " + (player == 1 ? 2 : 1));
    }
}
