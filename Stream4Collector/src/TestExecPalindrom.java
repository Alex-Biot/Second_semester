import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class TestExecPalindrom {



    @Test
    public void testmapPalindrom_EmptyString_EmptyMap() {
        String[] a;
        String inputString = "";
        assertFalse(Exec.mapPalindrom(inputString).entrySet().isEmpty());
        assertFalse(Exec.mapPalindrom(inputString).values().contains(null));
        assertTrue(Exec.mapPalindrom(inputString).keySet().contains(true));
        assertTrue(Exec.mapPalindrom(inputString).keySet().contains(false));



    }
    @Test
    public void testmapPalindrom_1String_ArrayString() {

        String inputString = "asdsa";
        assertFalse(Exec.mapPalindrom(inputString).entrySet().isEmpty());
        //assertFalse(Exec.mapPalindrom(inputString).values().contains(null));
        assertTrue(Exec.mapPalindrom(inputString).get(true).contains("asdsa"));
        assertFalse(Exec.mapPalindrom(inputString).values().contains("ssss"));

        assertTrue(Exec.mapPalindrom(inputString).keySet().contains(true));
        assertTrue(Exec.mapPalindrom(inputString).keySet().contains(false));

    }
        @Test
    public void testmapPalindrom_EmptyString_EmptyMap1() {

        String inputString = "qwewq";
        //System.out.println(Exec.mapPalindrom(inputString).values().size());
        assertFalse(Exec.mapPalindrom(inputString).entrySet().isEmpty());
        assertFalse(Exec.mapPalindrom(inputString).keySet().isEmpty());
        assertFalse(Exec.mapPalindrom(inputString).values().isEmpty());
        assertTrue(Exec.mapPalindrom(inputString).keySet().contains(true));
        String [] a = TestExecPalindrom.outString(Exec.mapPalindrom(inputString),true);

        assertEquals("qwewq",a[0]);
    }


    private static String[] outString(Map<Boolean, List<String>> inputMap, Boolean byKey) {

return   inputMap.get(byKey).toArray(new String[0]);
    }


}