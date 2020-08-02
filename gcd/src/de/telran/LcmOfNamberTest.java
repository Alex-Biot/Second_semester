package de.telran;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LcmOfNamberTest {

    @Test
    public void testLcmOfNamber_1and1_1() {
        Assert.assertEquals(1, LcmOfNamber.lcmOfNamber(1, 1));
    }

    @Test
    public void testLcmOfNamber_70and35_1() {
        assertEquals(70, LcmOfNamber.lcmOfNamber(70, 35));
        assertEquals(70, LcmOfNamber.lcmOfNamber(35, 70));
    }

    @Test
    public void testLcmOfNamber_24and24_6() {
        assertEquals(4, LcmOfNamber.lcmOfNamber(4, 4));
        assertEquals(24, LcmOfNamber.lcmOfNamber(24, 24));
    }

    @Test
    public void testLcmOfNamber_500and600_3000() {
        assertEquals(3000, LcmOfNamber.lcmOfNamber(500, 600));
        assertEquals(3000, LcmOfNamber.lcmOfNamber(600, 500));
    }
}