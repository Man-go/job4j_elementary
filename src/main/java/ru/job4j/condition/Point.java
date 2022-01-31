package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }
}
