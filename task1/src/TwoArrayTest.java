import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class TwoArrayTest {

    @Test
    void testDoThings_oneMatch_1() {
        int[] a = {5, 0, 2, 3};
        int[] b = new int[3];
        TwoArray aaaa = new TwoArray(a, a);
        boolean c = aaaa.sumAndCompareArray(a, 1);
        System.out.println(c);
    }

    @Test
    void testDoThings_equalArrays_twoMatch_2() {
        int[] a = {5, 0, 2, 3};
        int[] b = {5, 0, 2, 3};
        TwoArray aaaa = new TwoArray(a, b);
        assertEquals(2, aaaa.getCoincidence());
    }

    @Test
    void testDoThings_equalArraysEqualDigits_oneMatch_1() {
        int[] a = {5, 5, 5, 5};
        int[] b = {5, 5, 5, 5};
        TwoArray aaaa = new TwoArray(a, b);
        assertEquals(1, aaaa.getCoincidence());
    }

    @Test
    void testDoThings_mixedArrays_oneMatch_1() {
        int[] a = {3, 1, 4, 0};
        int[] b = {2, 2, -1, 5};
        TwoArray aaaa = new TwoArray(a, b);
        assertEquals(1, aaaa.getCoincidence());
    }

    @Test
    void testDoThings_noMatch_0() {
        int[] a = {5, 7, 5, 4};
        int[] b = {3, 2, 1, 4};
        TwoArray aaaa = new TwoArray(a, b);
        assertEquals(0, aaaa.getCoincidence());
    }


}