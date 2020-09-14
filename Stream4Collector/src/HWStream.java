
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class HWStream {

    public static void main(String[] args) {

        Map<Boolean, List<String>> map;

        Predicate<String> aPr = v -> v.equals(new StringBuilder(v).reverse().toString());


        String str = "asdsa dfghj dfgfd";
        String[] srtArray = str.split(" ");
        Stream<String> polindrom = Arrays.stream(srtArray);
        map = polindrom
                .collect(partitioningBy(aPr));
        System.out.println(map);
    }

}