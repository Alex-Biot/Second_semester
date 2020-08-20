import java.lang.reflect.Array;
import java.util.*;

public class MakeSegmentList {

    List<Segment> segments;


    /**
     * @param numberSegments - number segments
     * @param limits       - borders from 0 to limits
     * @return sorted Arraylist
     */
    public List<Segment> segmentMaker(int numberSegments, int limits) {
        segments = new ArrayList<Segment>();
        segments = ListRandomSegmentMaker(numberSegments, limits);
        return segments;
    }

    private static List<Segment> ListRandomSegmentMaker(int numberSegments, int limits) {
        Set<Segment> fakeSet = new HashSet<>();
        int simpleLSegment;
        int simpleRSegment;

        
        while (fakeSet.size() != numberSegments) {
            simpleLSegment = randomMaker(limits);
            simpleRSegment = randomMaker(limits);
            if (simpleLSegment>simpleRSegment)
            fakeSet.add(new Segment(simpleRSegment,simpleLSegment));
            else fakeSet.add(new Segment(simpleLSegment,simpleRSegment));
        }
        ArrayList<Segment> fSegments = new ArrayList<>(fakeSet);
       Collections.sort(fSegments, new SegmentComporator());

        //fSegments.sort(new SegmentComporator());
        
        return fSegments;
    }

    private static int randomMaker(int limits) {
        Random randomPoint = new Random();
        return randomPoint.nextInt(limits);
    }

}
