import java.util.Arrays;

public class TwoArray {
    int[] arrayA;
    int[] arrayB;


    public TwoArray(int[] arrayA, int[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    public int getCoincidence() {
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (sumAndCompareArray(arrayA, i) && sumAndCompareArray(arrayB, i))
                ++count;
        }

        return count;
    }

    public boolean sumAndCompareArray(int[] inputArray, int i) {
        int sum1 = Arrays.stream(inputArray).limit((long) i).reduce(0, Integer::sum);
        int sum2 = Arrays.stream(inputArray).skip((long) i).sum();
        return sum1 == sum2;
    }
}