import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class Exec {

    public static Integer SumStream(Integer[] array) {
        Stream<Integer> streamFromValues = Stream.of(array);
        return streamFromValues.collect(summingInt(value -> value * value));
    }

    public static Integer MultStream(Integer[] array) {
        Stream<Integer> streamFromValues = Arrays.stream(array);
        return streamFromValues
                .reduce(1, (res, value) -> res * value * value);
    }

    public static Map<Boolean, List<String>> mapPalindrom(String str) {
        Map<Boolean, List<String>> map;
        Predicate<String> aPr = v -> v.equals(new StringBuilder(v).reverse().toString());
        String[] srtArray = str.split(" ");
        Stream<String> polindrom = Arrays.stream(srtArray);
        return polindrom
                .collect(partitioningBy(aPr));

    }

}
