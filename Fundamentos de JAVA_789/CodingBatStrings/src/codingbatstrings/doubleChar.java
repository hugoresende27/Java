package codingbatstrings;
/*
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

public class doubleChar {

    public static String doubleChar(String str) {
        String nova = "";
        for (int i=0; i<str.length(); i++){
            nova += str.charAt(i);
            nova += str.charAt(i);
        }
        return nova;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
    }
}
