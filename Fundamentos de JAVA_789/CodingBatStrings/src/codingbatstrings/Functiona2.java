package codingbatstrings;
/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)
noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functiona2 {

    public static List<String> noZ(List<String> strings) {

        strings.removeIf(x -> x.contains("z"));
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String>arr1= new ArrayList<String>(Arrays.asList("aza", "bbb", "aza"));
        ArrayList<String>arr2= new ArrayList<String>(Arrays.asList("hziz", "hzello", "hi"));
        System.out.println(noZ(arr1));
        System.out.println(noZ(arr2));
    }
}
