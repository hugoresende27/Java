/*
Given a list of strings, return a list where each string has all its "x" removed.
noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */
package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hugo
 */
public class noX {
    public static List<String> noX(List<String> strings) {
       return strings.stream().map(x -> x.replaceAll("x", "")).collect(Collectors.toList());
}
    public static void main(String[] args) {
        List<String> x = new ArrayList<String>();
        x.add("ax");
        x.add("bb");
        x.add("cx");
        
        System.out.println(noX(x));
    }
    
}
