package codingbatstrings;
/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase()
returns the lowercase version of a string.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

import java.util.Locale;

public class endOther {
    public static boolean endOther(String a, String b) {

        String strA = a.toLowerCase();
        String strB = b.toLowerCase();
        int tamanhoA = strA.length();
        int tamanhoB = strB.length();

        if (strA.endsWith(strB) || strB.endsWith(strA)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc") );
        System.out.println(endOther("AbC", "HiaBc") );
    }
}
