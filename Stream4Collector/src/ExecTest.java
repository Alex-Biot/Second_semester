
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecTest {
    @Test
    public void testSumStream_Emptyarray_0Return(){
        Integer [] inputArray = {};
        assertEquals(0,Exec.SumStream(inputArray));
    }
@Test
    public void testSumStream_1array_1Return(){
        Integer [] inputArray = {1};
        assertEquals(1,Exec.SumStream(inputArray));
    }
@Test
    public void testSumStream_123array_0Return(){
        Integer [] inputArray = {1,2,3};
        assertEquals(14,Exec.SumStream(inputArray));
    }
@Test
    public void testSumStream_Negativ1230123array_0Return(){
        Integer [] inputArray = {-3,-2,-1,0,1,2,3};
        assertEquals(28,Exec.SumStream(inputArray));
    }

@Test
    public void testMultStream_Emptyarray_0Return(){
        Integer [] inputArray = {};
        assertEquals(1,Exec.MultStream(inputArray));
    }
@Test
    public void testMultStream_1array_1Return(){
        Integer [] inputArray = {1};
        assertEquals(1,Exec.MultStream(inputArray));
    }
@Test
    public void testMultStream_123array_0Return(){
        Integer [] inputArray = {1,2,3};
        assertEquals(36,Exec.MultStream(inputArray));
    }
@Test
    public void testMultStream_Negativ1230123array_0Return(){
        Integer [] inputArray = {-3,-2,-1,0,1,2,3};
        assertEquals(0,Exec.MultStream(inputArray));
    }


}