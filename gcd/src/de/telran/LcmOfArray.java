package de.telran;


public class LcmOfArray {
    public int lcmOfArray(int[] arrayForLcm) {
        int lcm=0 ;
        for (int i = 0; i < arrayForLcm.length - 1; i++) {
            if (i == 0)
                lcm = LcmOfNamber.lcmOfNamber(arrayForLcm[i],arrayForLcm[i+1]) ;
             else lcm=LcmOfNamber.lcmOfNamber(lcm,arrayForLcm[i+1]);

        }
        return lcm ;
    }
}
