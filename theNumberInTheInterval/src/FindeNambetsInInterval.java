import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;


public class FindeNambetsInInterval {

    public int findeNambetsInInterval(List<Double> lDuble, Double interval) {
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>(lDuble);
        int count1 = 0;
        for (Double lD : lDuble
        ) {
            Iterator<Double> iterator =  arrayDeque.iterator();
            int count = 0;
            while (iterator.hasNext() && iterator.next() <= arrayDeque.peekFirst() + interval) {
                count += 1;
            }
            arrayDeque.removeFirst();
           if (count > count1) {
                count1 = count;
            }
        }
        return count1;
    }
}
