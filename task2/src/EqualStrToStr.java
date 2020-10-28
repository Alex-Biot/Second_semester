
import java.util.Arrays;


public class EqualStrToStr {
    public static boolean equalStrToStr(String firstWord, String secondWord) {
        firstWord = firstWord.replace(" ", "").toLowerCase();
        secondWord = secondWord.replace(" ", "").toLowerCase();
        System.out.println(firstWord + "  " + secondWord);

        if (firstWord.length() == secondWord.length() && sortWord(firstWord).equals(sortWord(secondWord)))

            return true;

        return false;
    }

    private static String sortWord(String strSort) {
        char[] ch = strSort.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

}
