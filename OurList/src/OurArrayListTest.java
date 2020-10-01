import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    OurArrayList<Integer> ourArrayList;

    @BeforeEach
    public void init() {
        ourArrayList = new OurArrayList<>();
    }

    @Test
    public void addAndSizeTest_18nambers_18size() {
        for (int i = 0; i < 18; i++) {
            ourArrayList.add(i + 1);
        }
        assertEquals(18, ourArrayList.size());
    }

    @Test
    public void getAndContainsTest_10_10() {
        for (int i = 0; i < 18; i++) {
            ourArrayList.add(i);}
        assertEquals(10, ourArrayList.get(10));
        assertTrue(ourArrayList.contains(10));
        assertFalse(ourArrayList.contains(19));
        
    }

}