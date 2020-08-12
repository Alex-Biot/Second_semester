package com.telran;

import java.util.Comparator;

public class Point2DComparator implements Comparator<Point2D>{
    @Override
    public int compare(Point2D o1, Point2D o2) {
        return (o1.getX()*o1.getX()+o1.getY()* o1.getY())-(o2.getX()*o2.getX()+o2.getY()* o2.getY());
    }

}
