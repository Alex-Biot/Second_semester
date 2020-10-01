import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindeNambetsInIntervalTest {

//    @Test
//    public void


    @Test
    public  void TestFindeNambetsInInterval_xx_5() {
        FindeNambetsInInterval fNII = new FindeNambetsInInterval();
        Double interval = 0.1;
        List <Double> lArray = Arrays.asList(.1,.2,.22,.23,.25,.3,.4,.5);

        Assert.assertEquals(5,fNII.findeNambetsInInterval(lArray,interval));

    }
    @Test
    public  void TestFindeNambetsInInterval_xx_6() {
        FindeNambetsInInterval fNII = new FindeNambetsInInterval();
        Double interval = 0.1;
        List <Double> lArray = Arrays.asList(.1,.2,.22,.22,.23,.25,.3,.4,.5);

        Assert.assertEquals(6,fNII.findeNambetsInInterval(lArray,interval));

    }

    @Test
    public  void TestFindeNambetsInInterval_0_0() {
        FindeNambetsInInterval fNII = new FindeNambetsInInterval();
        Double interval = 0.1;
        List <Double> lArray = Arrays.asList();

        Assert.assertEquals(0,fNII.findeNambetsInInterval(lArray,interval));

    }
 @Test
    public  void TestFindeNambetsInInterval_1_1() {
        FindeNambetsInInterval fNII = new FindeNambetsInInterval();
        Double interval = 0.1;
        List <Double> lArray = Arrays.asList(1.);

        Assert.assertEquals(1,fNII.findeNambetsInInterval(lArray,interval));

    }
}