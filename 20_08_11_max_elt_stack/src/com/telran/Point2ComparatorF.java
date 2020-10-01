package com.telran;

import java.util.Comparator;

public class Point2ComparatorF implements Comparator<Point2D>{

        @Override
        public int compare(Point2D o1, Point2D o2) {

            /*int a = (int)((Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY()))<0)?180-Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY())):Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY())));
            int b = (int)((Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY()))<0)?180-Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY())):Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY())));
            */
            return (int)((Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY()))<0)?180-Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY())):Math.toDegrees(Math.atan2((double)o1.getY(),(double)o1.getY())))-(int)((Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY()))<0)?180-Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY())):Math.toDegrees(Math.atan2((double)o2.getY(),(double)o2.getY())));
        }

    }


