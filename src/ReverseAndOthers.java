public class ReverseAndOthers {
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        string = stringBuilder.reverse().toString();
        return string;
    }

    public static String upAndDown(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) chars[i] = Character.toUpperCase(chars[i]);
            else chars[i] = Character.toLowerCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static int exponent(int i) {
        return (int) Math.pow(i, 2);
    }
}
