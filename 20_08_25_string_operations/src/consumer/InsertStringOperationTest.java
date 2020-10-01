package consumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertStringOperationTest {
    @Test
    public void testInsertString() {

        IStringOperation a = new InsertStringOperation("toLowerCase");
        System.out.println(a.operate("SSSS"));

        IStringOperation b = new InsertStringOperation("toUpperCase");
        System.out.println(b.operate("ccc"));
        IStringOperation c = new InsertStringOperation("concat");
        System.out.println(c.operate("sss"));
        IStringOperation d = new InsertStringOperation("replace");
        System.out.println(d.operate("ccc"));

    }

}