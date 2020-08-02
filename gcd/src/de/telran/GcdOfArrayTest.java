package de.telran;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdOfArrayTest {

    int[] arrayint = {54, 24, 12};
    int[] arrayint1 = {54, 24, 3};
    int[] arrayint11 = {3, 54, 24};
    int[] arrayint2 = {54, 24, 10};
    int[] arrayint3 = {3, 54, 24, 108};
    int[] arrayint4 = {518, 4551, 2035, 74};
    int[] arrayint5 = {518, 4551, 2035, 74, 3367, 296, 36519};

    @Test
    public void testCompute_1and1_1() {
        Assert.assertEquals(1, GcdOfArray.compute(1, 1));
    }

    @Test
    public void testCompute_70and35_1() {
        assertEquals(35, GcdOfArray.compute(70, 35));
        assertEquals(35, GcdOfArray.compute(35, 70));
    }

    @Test
    public void testCompute_54and24_6() {
        assertEquals(6, GcdOfArray.compute(54, 24));
        assertEquals(6, GcdOfArray.compute(24, 54));
    }

    @Test
    public void testCompute_500and600_100() {
        assertEquals(100, GcdOfArray.compute(500, 600));
        assertEquals(100, GcdOfArray.compute(600, 500));
    }

    @Test
    public void testCommonGcd_54and24and12_6() {
        assertEquals(6, GcdOfArray.commonGcd(arrayint));

    }

    @Test
    public void testCommonGcd_54and24and3_3() {
        assertEquals(3, GcdOfArray.commonGcd(arrayint1));

    }

    @Test
    public void testCommonGcd_3and24and54_3() {
        assertEquals(3, GcdOfArray.commonGcd(arrayint11));

    }

    @Test
    public void testCommonGcd_54and24and10_2() {
        assertEquals(2, GcdOfArray.commonGcd(arrayint2));

    }

    @Test
    public void testCommonGcd_3and24and54and108_3() {
        assertEquals(3, GcdOfArray.commonGcd(arrayint3));

    }
    @Test
    public void testCommonGcd_array4_37() {
        assertEquals(37, GcdOfArray.commonGcd(arrayint4));

    }
    @Test
    public void testCommonGcd_array5_37() {
        assertEquals(37, GcdOfArray.commonGcd(arrayint5));

    }
}

