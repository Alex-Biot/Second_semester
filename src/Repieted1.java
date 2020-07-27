import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repieted1 {
    public static ArrayList getListRepieted(ArrayList <Integer> integerList) {
        ArrayList <Integer> newList = new ArrayList<>();
        Set<Integer> fake = new HashSet<>();

        for (int i = 0; i <integerList.size() ; i++) {
            fake.add(integerList.get(i));
        }
        Iterator<Integer> iterator = fake.iterator();
        while (iterator.hasNext()) {newList.add(iterator.next());
        }


        return newList;  }
}
