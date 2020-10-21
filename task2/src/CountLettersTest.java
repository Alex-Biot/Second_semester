import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    @Test
    public void countLettersTest_aaaabbb_a4b3(){
        assertEquals("a4b3",CountLetters.countLetters("aaaabbb"));
    }
    @Test
    public void countLettersTest_abcdef_a1b1c1d1e1f1(){
        assertEquals("a1b1c1d1e1f1",CountLetters.countLetters("abcdef"));
    }
    @Test
    public void countLettersTest__(){
        assertEquals("",CountLetters.countLetters(""));
    }
    @Test
    public void countLettersTest(){
        assertEquals("a4b3f13h13",CountLetters.countLetters("aaaabbbfffffffffffffhhhhhhhhhhhhh"));
    }

}