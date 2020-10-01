import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VasjaTest {

    @Test
    public void testVasja_1_1_20_10() {
        Vasja vasja = new Vasja(1, 1, 20);
        assertEquals(10, vasja.numberOfAttemptMin());
    }
    @Test
    public void testVasja_2_1_20_6() {
        Vasja vasja = new Vasja(2, 1, 20);
        assertEquals(6, vasja.numberOfAttemptMin());
    }
    @Test
    public void testVasja_10_1_20_10() {
        Vasja vasja = new Vasja(10, 1, 20);
        assertEquals(5, vasja.numberOfAttemptMin());
    }
    @Test
    public void testVasja_0_0_0_0() {
        Vasja vasja = new Vasja(0, 0, 0);
        assertEquals(0, vasja.numberOfAttemptMin());
    }

    @Test
    public void testVasja_0_1_100_99() {
        Vasja vasja = new Vasja(0, 1, 100);
        assertEquals(99, vasja.numberOfAttemptMin());
    }


}