import java.lang.reflect.Array;
import java.util.*;

public class MakePointList {

    List<Integer> points;


    /**
     * @param numberPoints - number Points
     * @param limits       - borders from 0 to limits
     * @return sorted Arraylist
     */
    public List<Integer> pointMaker(int numberPoints, int limits) {
        points = new ArrayList<>();
        points = ListRandomPointMaker(numberPoints, limits);
        return points;
    }

    private static List<Integer> ListRandomPointMaker(int numberPoints, int limits) {
        Set<Integer> fakeSet = new HashSet<>();
        int simplePoint;
        while (fakeSet.size() != numberPoints) {
            simplePoint = randomMaker(limits);
            fakeSet.add(simplePoint);
        }
        ArrayList<Integer> fPoints = new ArrayList<>(fakeSet);
        Collections.sort(fPoints);
        return fPoints;
    }

    private static int randomMaker(int limits) {
        Random randomPoint = new Random();
        return randomPoint.nextInt(limits);
    }

}
