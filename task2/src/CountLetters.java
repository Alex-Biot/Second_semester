public class CountLetters {
    public static String countLetters(String str) {
        char[] ch = str.toCharArray();
        String newStr = "";
        int j = str.length() - 1;
        int n = 1;

        for (int i = 0; i <= j; i++) {
            char fakeChar = ch[i];
            if (i < j &&  fakeChar == ch[i + 1])
                n++;
            else {
                newStr += fakeChar;
                newStr += Integer.toString(n);
                n = 1;
            }
        }
        return newStr;
    }
}
