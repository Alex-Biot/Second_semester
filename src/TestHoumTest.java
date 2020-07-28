import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHoumTest {

    @Test
    public void testRevers() {
        String string = "Hallo Wold";
        Assert.assertEquals("dloW ollaH", ReverseAndOthers.reverse(string));
    }

    @Test
    public void testUpAndDown() {
        String string = "Hallo Wold";
        Assert.assertEquals("hALLO wOLD", ReverseAndOthers.upAndDown(string));
    }

    @Test
    public void testExponent() {
        int i = 10;
        Assert.assertEquals(100, ReverseAndOthers.exponent(i));
    }

    @Test
    public void testRepeated() {

        int[] jArr = {1, 2, 2, 2, 2, 2, 3, 4, 1, 7, 7, 8, 456, 23, 456};
        int[] jArr1 = {1, 2, 7, 456};
        List<Integer> integerList = new ArrayList<>();
        for (Integer jj : jArr
        ) {
            integerList.add(jj);
        }
        List<Integer> integerList1 = new ArrayList<>();
        for (Integer jj : jArr1
        ) {
            integerList1.add(jj);
        }
        Assert.assertEquals(4, Repeated1.getListRepeated((ArrayList) integerList).size());
        Assert.assertEquals( integerList1, Repeated1.getListRepeated((ArrayList) integerList));
    }
    @Test
    public void testEuclideanAlgorithm(){
        EuclideanAlgorithm testint = new EuclideanAlgorithm();
        Assert.assertEquals(12,testint.getD(36,84));
    }
    @Test
    public void testMultply(){
        List <Integer>list = Arrays.asList(1,3,8,9,11,20);
        int n;
       Assert.assertEquals(false,Multply.isMultiplied(list,64 ));
        Assert.assertEquals(true,Multply.isMultiplied(list,33 ));
    }
}
