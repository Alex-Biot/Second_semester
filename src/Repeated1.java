import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repeated1 {
    public static ArrayList getListRepeated(ArrayList <Integer> integerList) {
        ArrayList <Integer> newList = new ArrayList<>();
        Set<Integer> fake = new HashSet<>();
        Set<Integer> fake1 = new HashSet<>();
        for (int i = 0; i <integerList.size() ; i++) {
            if (!fake.add(integerList.get(i)))fake1.add(integerList.get(i));
        }
        Iterator<Integer> iterator = fake1.iterator();
        while (iterator.hasNext()) {newList.add(iterator.next());
        }
        return newList;  }
}
