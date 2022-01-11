package codingbatstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.
noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
 */
public class NoLong {
    public static List<String> noLong(List<String> strings) {
        strings.removeIf(x -> x.length()>=4);
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1= new ArrayList<String>(Arrays.asList("this", "not", "too", "long"));
        ArrayList<String>arr2= new ArrayList<String>(Arrays.asList("a", "bbb", "cccc"));
        System.out.println(noLong(arr1));
        System.out.println(noLong(arr2));
    }
}
