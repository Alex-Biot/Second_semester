import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextNumerTest {
    @Test
    public void getRandomTest(){
        System.out.println(FindNextNumer.getGettingNamber());
    }
    @Test
    public void getNextNamberTest_256_265(){
        FindNextNumer a = new FindNextNumer();
        assertEquals(265,a.getNextNamber(256));
    }
    @Test
    public void getNextNamberTest_99_189(){
        FindNextNumer a = new FindNextNumer();
        assertEquals(189,a.getNextNamber(99));
    }
    @Test
    public void getNextNamberTest_9_18(){
        FindNextNumer a = new FindNextNumer();
        assertEquals(18,a.getNextNamber(9));
    } @Test
    public void getNextNamberTest_1_10(){
        FindNextNumer a = new FindNextNumer();
        assertEquals(10,a.getNextNamber(1));
    }


}