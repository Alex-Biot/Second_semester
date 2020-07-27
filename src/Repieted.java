import java.util.*;
//There is an error
public class Repieted {
    public static ArrayList getListRepieted(ArrayList <Integer> integerList) {
        ArrayList <Integer> newList = new ArrayList<>();
        Set<Integer> fake = new HashSet<>();

        for (int i = 0; i <integerList.size() ; i++) {
            if (!fake.add(integerList.get(i))) newList.add(integerList.get(i));
        }
  return newList;  }


}
