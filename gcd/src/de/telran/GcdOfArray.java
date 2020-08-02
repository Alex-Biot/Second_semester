package de.telran;

public class GcdOfArray {
    private static int gcdOfArray;

    public static int commonGcd(int[] arrayNumb) {
        for (int i = 0; i < arrayNumb.length - 1; i++) {
            if (i==0) {gcdOfArray=compute(arrayNumb[0],arrayNumb[i+1]);}
            else gcdOfArray=compute(gcdOfArray,arrayNumb[i+1]);
        }

        return gcdOfArray;
    }

    public static int compute(int a, int b) {
        while (b != 0){
        int d = a % b;
        return compute(b, d);}
        return a; }
}


