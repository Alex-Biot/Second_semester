import java.util.Comparator;

public class SegmentComporator implements Comparator<Segment> {
    @Override
    public int compare(Segment o1, Segment o2) {
         return o1.leftPoint-o2.leftPoint;
    }
}
