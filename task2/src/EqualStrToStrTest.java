import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualStrToStrTest {
    @Test
    public void equalStrToStrTest_aba_bab_true(){

        assertTrue(EqualStrToStr.equalStrToStr("aba bab","bab aba"));
    }
    @Test
    public void equalStrToStrTest_ababab_true(){

        assertTrue(EqualStrToStr.equalStrToStr("aba bab","bab aba"));
    }
    @Test
    public void equalStrToStrTest_abab_bab_false(){

        assertFalse(EqualStrToStr.equalStrToStr("abab bab","bab aba"));
    }
    @Test
    public void equalStrToStrTest__true(){

        assertTrue(EqualStrToStr.equalStrToStr("",""));
    }

    @Test
    public void equalStrToStrTest_hello_word_true() {

        assertTrue(EqualStrToStr.equalStrToStr("HellO wOrlD", "HOLlelordw"));
    }

}