package com.telran;

import java.util.Comparator;

public class Point2D {
    private int x;
    private int y;
    Comparator <Point2D> dComparator ;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public Point2D(Comparator<Point2D> dComparator) {
        this.dComparator = dComparator;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
