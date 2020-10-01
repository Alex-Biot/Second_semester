import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExecListTest {

    @Test
    void testPointMaker() {
        MakePointList execList = new MakePointList();
        System.out.println(execList.pointMaker(20, 100));

    }

    @Test
    void testSegmentMaker() {
        MakeSegmentList execList = new MakeSegmentList();
        System.out.println(execList.segmentMaker(5, 100));

    }

    @Test
    void testPointCount() {
        List<Integer> p = new ArrayList<>();
        List<Segment> s = new ArrayList<>();
        p.add(5);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(1);
        s.add(new Segment(0, 1));
        s.add(new Segment(0, 2));
        s.add(new Segment(0, 3));
        s.add(new Segment(0, 4));
        s.add(new Segment(0, 5));

        CountSegmentsAbovePoint countSegmentsAbovePoint = new CountSegmentsAbovePoint();

        System.out.println(countSegmentsAbovePoint.getCoverNum(p, s));


    }

    @Test
    void testMaxValue() {
        List<Integer> p = new ArrayList<>();
        List<Segment> s = new ArrayList<>();
        p.add(5);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(1);
        s.add(new Segment(0, 1));
        s.add(new Segment(0, 2));
        s.add(new Segment(0, 3));
        s.add(new Segment(0, 4));
        s.add(new Segment(0, 5));

        CountSegmentsAbovePoint countSegmentsAbovePoint = new CountSegmentsAbovePoint();

        System.out.println(countSegmentsAbovePoint.getCoverNum(p, s));
        assertEquals(5, countSegmentsAbovePoint.maxValue());
    }

    @Test
    void testRandomPointCount() {
        MakePointList execList = new MakePointList();
        MakeSegmentList execSList = new MakeSegmentList();
        CountSegmentsAbovePoint countSegmentsAbovePoint = new CountSegmentsAbovePoint();

        System.out.println(countSegmentsAbovePoint.getCoverNum(execList.pointMaker(20, 100), execSList.segmentMaker(20, 100)));
        System.out.print("Max segments =" + countSegmentsAbovePoint.maxValue());

    }

}