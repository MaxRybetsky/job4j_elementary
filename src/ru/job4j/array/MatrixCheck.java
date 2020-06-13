package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        char controlElement = 'X';
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != controlElement) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        char controlElement = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != controlElement) {
                return false;
            }
        }
        return true;
    }
}