import java.util.Comparator;

public class Segment implements Comparator<Segment> {
    int leftPoint;
    int rightPoint;

    public Segment(int leftPoint, int rightPoint) {
        this.leftPoint = leftPoint;
        this.rightPoint = rightPoint;
    }


    @Override
    public int compare(Segment o1, Segment o2) {
        return (o1.rightPoint-o1.leftPoint)-(o2.rightPoint-o2.leftPoint);
    }

    @Override
    public String toString() {
        return "Segment {" +
                "leftPoint= " + leftPoint +
                ", rightPoint= " + rightPoint +
                ", length= " +(rightPoint-leftPoint)+
                " }\n";
    }
}
