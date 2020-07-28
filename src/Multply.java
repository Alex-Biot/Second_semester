import java.util.ArrayList;
import java.util.List;

public class Multply {
    public static boolean isMultiplied(List<Integer> integerList, int n) {
        int k;
        for (int i = 0; i < integerList.size(); i++) {
            if (n % integerList.get(i) == 0) {
                k = n / integerList.get(i);
                for (int j = 0; j < integerList.size(); j++) {
                    if (j != i & k == integerList.get(j)) return true;
                }
            }
        }
        return false;
    }
}
