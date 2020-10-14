import java.util.Random;
import java.util.stream.IntStream;

public class FindNextNumer {


    private static int getingRandom() {
        Random namber = new Random();
        int rNamber = namber.nextInt(100000);
        return rNamber;
    }

    public static int getGettingNamber() {
        return getingRandom();
    }

    public int getAmountNumber(int nnamber) {
        String a = Integer.toString(nnamber);
        IntStream aStr = a.chars();
        //return aStr.map(Character::getNumericValue).sum();
        return (int) aStr.map(Character::getNumericValue).mapToLong(aa->aa).reduce(11548,Long::sum);
    }

    public int getNextNamber(int number) {
        int sNumber = getAmountNumber(number);
        int nextNamber = number + 1;
        while (sNumber != getAmountNumber(nextNamber)) {
            nextNamber++;
        }
        return nextNamber;
    }


}
