import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class OurLinkedListTest {
    OurList<Integer> list;
    OurList<Point2D> point2D;

    @BeforeEach
    void init() {
        list = new OurLinkedList<>();
        point2D = new OurLinkedList<>();
    }

    @Test
    public void testGetAndSize_oneNode_firstNode() {
        list.add(5);
        point2D.add(new Point2D(1, 256));
        assertEquals(5, list.get(0));
        assertEquals(1, list.size());
        assertEquals(new Point2D(1, 256), point2D.get(0));
        assertEquals(1, point2D.size());
    }

    @Test
    public void testGetAndSize_anyNode_thirdNode() {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        point2D.add(new Point2D(1, 256));
        point2D.add(new Point2D(2, 256));
        point2D.add(new Point2D(3, 256));
        point2D.add(new Point2D(4, 256));
        point2D.add(new Point2D(5, 256));

        assertEquals(15, list.get(2));
        assertEquals(5, list.size());
        assertEquals(new Point2D(3, 256), point2D.get(2));
        assertEquals(5, point2D.size());


    }

    @Test
    public void testSet_anyNode_firstThirdLastNode() {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        point2D.add(new Point2D(1, 256));
        point2D.add(new Point2D(2, 256));
        point2D.add(new Point2D(3, 256));
        point2D.add(new Point2D(4, 256));
        point2D.add(new Point2D(5, 256));

        assertEquals(-15, list.get(list.set(4, -15)));
        assertEquals(4, list.set(4, -15));
        assertEquals(new Point2D(256, 3), point2D.get(point2D.set(4, new Point2D(256, 3))));
        assertEquals(4, point2D.set(4, new Point2D(256, 3)));

        assertEquals(-15, list.get(list.set(2, -15)));
        assertEquals(2, list.set(2, -15));
        assertEquals(new Point2D(256, 3), point2D.get(point2D.set(2, new Point2D(256, 3))));
        assertEquals(2, point2D.set(2, new Point2D(256, 3)));

        assertEquals(-15, list.get(list.set(0, -15)));
        assertEquals(0, list.set(0, -15));
        assertEquals(new Point2D(256, 3), point2D.get(point2D.set(0, new Point2D(256, 3))));
        assertEquals(0, point2D.set(0, new Point2D(256, 3)));

    }
    @Test
    public void testContains_anyNode_TrueAndFalseFirstThirdLastNode() {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        point2D.add(new Point2D(1, 256));
        point2D.add(new Point2D(2, 256));
        point2D.add(new Point2D(3, 256));
        point2D.add(new Point2D(4, 256));
        point2D.add(new Point2D(5, 256));

        assertTrue( list.contains( 5));
        assertTrue( point2D.contains(new Point2D(1, 256)));
        assertFalse( list.contains( 16));
        assertFalse( point2D.contains(new Point2D(2, 255)));

        assertTrue( list.contains( 15));
        assertTrue( point2D.contains(new Point2D(3, 256)));
        assertFalse( list.contains( 116));
        assertFalse( point2D.contains(new Point2D(7, 252)));

        assertTrue( list.contains( 25));
        assertTrue( point2D.contains(new Point2D(5, 256)));
        assertFalse( list.contains( 16));
        assertFalse( point2D.contains(new Point2D(-1, -256)));

    }
    @Test
public void testRemoveIndex_anyNode_eFirstThirdLastNode() {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        point2D.add(new Point2D(1, 256));
        point2D.add(new Point2D(2, 256));
        point2D.add(new Point2D(3, 256));
        point2D.add(new Point2D(4, 256));
        point2D.add(new Point2D(5, 256));

        assertEquals( 5,list.remove( 0));
        assertEquals( new Point2D(1, 256),point2D.remove(0));
        assertEquals(4, list.size());
        assertEquals(4, point2D.size());

        assertEquals( 20,list.remove( 2));
        assertEquals( new Point2D(4, 256),point2D.remove(2));
        assertEquals(3, list.size());
        assertEquals(3, point2D.size());

        assertEquals( 25,list.remove( 2));
        assertEquals( new Point2D(5, 256),point2D.remove(2));
        assertEquals(2, list.size());
        assertEquals(2, point2D.size());
    }
    @Test
public void testRemoveElt_anyNode_eFirstThirdLastNode() {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        point2D.add(new Point2D(1, 256));
        point2D.add(new Point2D(2, 256));
        point2D.add(new Point2D(3, 256));
        point2D.add(new Point2D(4, 256));
        point2D.add(new Point2D(5, 256));

        assertTrue( list.remove((Integer) 5 ));
        assertTrue( point2D.remove(new Point2D(1,256)));
        assertEquals(4, list.size());
        assertEquals(4, point2D.size());

        assertTrue( list.remove((Integer) 15 ));
        assertTrue( point2D.remove(new Point2D(3,256)));
        assertEquals(3, list.size());
        assertEquals(3, point2D.size());

        assertTrue( list.remove((Integer) 25 ));
        assertTrue( point2D.remove(new Point2D(5,256)));
        assertEquals(2, list.size());
        assertEquals(2, point2D.size());
    }
    @Test
    public void testLinkedIterator() {

        list.add(2);
        list.add(-1);
        list.add(23);
        list.add(4);
        list.add(89);

        int[] expected = {2, -1, 23, 4, 89};

        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int num = it.next();
            assertEquals(expected[i++], num);
        }

    }


}
