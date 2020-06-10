package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        double sqX = Math.pow(dx, 2);
        double sqY = Math.pow(dy, 2);

        double sqDist = sqX + sqY;

        double rsl = Math.sqrt(sqDist);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(1, 2, 2, 9);
        System.out.println("result (1, 2) to (2, 9) " + result);

        result = Point.distance(5, 5, 25, 25);
        System.out.println("result (5, 5) to (25, 25) " + result);
    }
}