import java.util.*;

public class CountSegmentsAbovePoint {
    Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

    public Map<Integer, Integer> getCoverNum(List<Integer> points, List<Segment> segments) {


        for (int i = 0; i < points.size(); i++) {
            for (int j = 0; j < segments.size(); j++) {
                if (points.get(i) >= segments.get(j).leftPoint)
                    if (points.get(i) <= segments.get(j).rightPoint)
                        if (countMap.containsKey(points.get(i))) {
                            countMap.put(points.get(i), countMap.get(points.get(i)) + 1);
                        } else {
                            countMap.put(points.get(i), 1);
                        }
            }
        }


        return countMap;
    }

    public int maxValue() {
        return Collections.max(countMap.values());

    }


}
