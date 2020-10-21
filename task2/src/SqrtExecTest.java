import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtExecTest {
    @Test
    public void SqrtExecTest_1_1(){
        assertEquals(1,SqrtExec.sqrtExec(2,5));
    }

 @Test
    public void SqrtExecTest1_3_3(){
        assertEquals(3,SqrtExec.sqrtExec(2,16));
    }

@Test
    public void SqrtExecTest1_9243_9243(){
        assertEquals(3,SqrtExec.sqrtExec(9243,85455569));
    }


    @Test
    public void SqrtExecPlusTest(){
        assertEquals(2,SqrtExec.sqrtExec(2,12));
    }
    @Test
    public void SqrtExecPlusTest1(){
        assertEquals(3,SqrtExec.sqrtExec(2,20));
    }


}
