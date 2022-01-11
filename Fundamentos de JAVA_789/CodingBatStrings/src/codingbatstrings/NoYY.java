package codingbatstrings;
/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that
contain "yy" as a substring anywhere.
noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoYY {
    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(s -> s+ "y");
        strings.removeIf( x -> x.contains("yy"));
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));

        System.out.println(noYY(arr1));
    }
}
