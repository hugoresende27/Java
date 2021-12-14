/*
Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
package codingbatstrings;

/**
 *
 * @author Hugo
 */
public class conCat {
    public static String conCat(String a, String b) {
        System.out.println(a.charAt(a.length()-1));
        //System.out.println(a.length());
        //int compA = a.length()-1;
        //System.out.println(a.charAt(compA));
        return a + b;
}
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
    }
}
