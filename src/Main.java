import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Reverse string
        String string = "Hallo Wold";
        System.out.println(ReverseAndOthers.reverse(string));

        //Up and down
        System.out.println(ReverseAndOthers.upAndDown(string));

        // Repeated.
        int[] jArr = {1,2,2,2,2,2,3,4,1,7,7,8,456,23,456};
        List <Integer> integerList = new ArrayList<>();
        for (Integer jj: jArr
             ) {integerList.add(jj);}
        integerList=Repeated1.getListRepeated( (ArrayList) integerList);
        System.out.println(integerList);

        //The Euclidean algorithm
        EuclideanAlgorithm a = new EuclideanAlgorithm();
        System.out.println(a.getD(36,12 ));

        //Exponentiation 2. Not clear task.
        int ex = 15;
        System.out.println(ReverseAndOthers.exponent(ex));

        // isMultiplied
        List <Integer>list = Arrays.asList(1,3,8,9,11,20);
        int n;
        System.out.println(Multply.isMultiplied(list,64 ));
    }


}

