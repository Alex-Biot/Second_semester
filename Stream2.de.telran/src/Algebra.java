import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Algebra {

    public static int[] concatAndTransform (int[] first, int[] second) {
        IntStream firstStream = Arrays.stream(first);
        IntStream secondStream = Arrays.stream(second);

        return IntStream.concat(firstStream,secondStream)

            .filter(a -> (a % 5)==0 && (a % 3) == 0)
            .skip(2)
            .sorted()
            .toArray()    ;
    }
    public void blockAccount (List<Account> accounts, long upperBorder){

        Stream <Account> accountStream = accounts.stream();
        accountStream
                .filter(account -> account.getBalansce()>upperBorder)
                .map(account -> account.isLocked=false)
                 .collect(Collectors.toList())
        ;

    }

}
