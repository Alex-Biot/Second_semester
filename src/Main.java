import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       /* //Reverse string
        String string = "Hallo Wold";
        StringBuilder stringBuilder = new StringBuilder(string);
        //string = stringBuilder.reverse().toString();
        System.out.println(stringBuilder.reverse() + "  " + string);

        //Up and down
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) chars[i]=Character.toUpperCase(chars[i]) ;
            else chars[i]=Character.toLowerCase(chars[i]) ;
        }
        System.out.println(String.valueOf(chars));*/
        int[] jArr = {1,2,2,3,4,1,7,7,8,456,23,456};

        List <Integer> integerList = new ArrayList<>();
        for (Integer jj: jArr
             ) {integerList.add(jj);}

       integerList=Repieted.getListRepieted( (ArrayList) integerList);
        System.out.println(integerList);
        integerList=Repieted1.getListRepieted( (ArrayList) integerList);
        System.out.println(integerList);

    }
}

