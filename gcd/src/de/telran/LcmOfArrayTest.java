package de.telran;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Ответ: НОК(84,648 ) = 4536
//Ответ: НОК()=94500

class LcmOfArrayTest {
    LcmOfArray a = new LcmOfArray();
    int [] arrayMalt =  {140,9,54,250};
    int [] arrayMalt1 =  {1, 2, 3};
    int [] arrayMalt2 =  {36, 24, 12};
    int [] arrayMalt3 =  {84,648};
    int [] arrayMalt33 =  {648,84};
    @Test
    public void testLcmOfArray_84And648 (){
        Assert.assertEquals(4536,a.lcmOfArray(arrayMalt3));
        Assert.assertEquals(4536,a.lcmOfArray(arrayMalt33));
    }

    @Test
    public void testLcmOfArray (){
        Assert.assertEquals(94500,a.lcmOfArray(arrayMalt));
        Assert.assertEquals(6,a.lcmOfArray(arrayMalt1));
        Assert.assertEquals(72,a.lcmOfArray(arrayMalt2));
    }
}