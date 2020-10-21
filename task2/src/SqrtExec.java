import java.util.Arrays;


public class SqrtExec {

    public static int sqrtExec(int a, int b) {
        int c;
        int d;
        if (a <= b) c = b - a + 1;
        else {
            c = a - b+1;
            a = b;
        }
        int[] ab = new int[c];
        for (int i = 0; i < c; i++) {
            ab[i] = a++;
        }
        for (int i = 0; i < c; i++) {
        }

        return (int) Arrays.stream(ab).filter(number -> Math.sqrt(number) * 10 % 10 == 0).count();
    }


    public static int sqrtExecPlus(int a, int b) {
        int c;
        if (a <= b) c = b - a + 1;
        else {
            c = a - b+1;
            a = b;
        }
        int[] ab = new int[c];
        for (int i = 0; i < c; i++)
            ab[i] = a++;


        return (int) Arrays.stream(ab).mapToLong(n->n).filter(number -> Math.sqrt(number) * 10 % 10 == 0 & Math.sqrt(number) * 10 % 10 == Math.sqrt(number)).count();
    }

}
