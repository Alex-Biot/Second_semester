package com.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point2DTest {

    Point2D point1XY;
    Point2D point2XY;
    Point2D comparatorIn;
    Point2D comparatorInF;
    @BeforeEach
    public void init() {
        Comparator<Point2D> point2DComparator = new Point2DComparator();
        comparatorIn = new Point2D(point2DComparator);
        Comparator<Point2D> point2DComparatorF = (Comparator<Point2D>) new Point2ComparatorF();
        comparatorInF = new Point2D(point2DComparatorF);
    }

    @Test
    public void testcompare_AllZiro_Equal() {
        point1XY = new Point2D(0, 0);
        point2XY = new Point2D(0, 0);
        assertEquals(0, comparatorIn.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompare_1111_Equal() {
        point1XY = new Point2D(1, 1);
        point2XY = new Point2D(1, 1);
        assertEquals(0, comparatorIn.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompare_0011_EqualMinus2() {
        point1XY = new Point2D(0, 0);
        point2XY = new Point2D(1, 1);
        assertEquals(-2, comparatorIn.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompare_1100_EqualMinus2() {
        point1XY = new Point2D(1, 1);
        point2XY = new Point2D(0, 0);
        assertEquals(2, comparatorIn.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompare_Negativ1100_EqualMinus2() {
        point1XY = new Point2D(-1, -1);
        point2XY = new Point2D(0, 0);
        assertEquals(2, comparatorIn.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompare_00Negativ11_EqualMinus2() {
        point2XY = new Point2D(-1, -1);
        point1XY = new Point2D(0, 0);
        assertEquals(-2, comparatorIn.dComparator.compare(point1XY, point2XY));
    }
    @Test
    public void testcompare_Negativ1111_EqualMinus2() {
        point2XY = new Point2D(-1, -1);
        point1XY = new Point2D(-1, -1);
        assertEquals(0, comparatorIn.dComparator.compare(point1XY, point2XY));
    }


@Test
    public void testcompareF_AllZiro_Equal() {
        point1XY = new Point2D(0, 0);
        point2XY = new Point2D(0, 0);
        assertEquals(0, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompareF_1111_Equal() {
        point1XY = new Point2D(1, 1);
        point2XY = new Point2D(1, 1);
        assertEquals(0, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompareF_0011_EqualMinus2() {
        point1XY = new Point2D(0, 0);
        point2XY = new Point2D(1, 1);
        assertEquals(-45, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompareF_1100_EqualMinus2() {
        point1XY = new Point2D(1, 1);
        point2XY = new Point2D(0, 0);
        assertEquals(45, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompareF_Negativ1100_EqualMinus2() {
        point1XY = new Point2D(-1, -1);
        point2XY = new Point2D(0, 0);
        assertEquals(315, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

    @Test
    public void testcompareF_00Negativ11_EqualMinus2() {
        point2XY = new Point2D(-1, -1);
        point1XY = new Point2D(0, 0);
        assertEquals(-315 , comparatorInF.dComparator.compare(point1XY, point2XY));
    }
    @Test
    public void testcompareF_Negativ1111_EqualMinus2() {
        point2XY = new Point2D(-1, -1);
        point1XY = new Point2D(-1, -1);
        assertEquals(0, comparatorInF.dComparator.compare(point1XY, point2XY));
    }

}

