package de.telran;

import de.telran.GcdOfArray;

public class LcmOfNamber {
    public static int lcmOfNamber(int a, int b){

    return a*b/ GcdOfArray.compute(a,b);
    }
}
