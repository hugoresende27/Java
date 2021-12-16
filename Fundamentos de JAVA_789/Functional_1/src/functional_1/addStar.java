/*
Given a list of strings, return a list where each string has "*" added at its end.
addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
Given a list of strings, return a list where each string is replaced by 3 copies 
of the string concatenated together.
copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

 */
package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hugo
 */
public class addStar {
    public static List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(x -> x.concat("*"))
                .collect(Collectors.toList());
    }
    
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(x -> x.concat(x).concat(x))
                .collect(Collectors.toList());
    }
    
    public static List<String> copies3B(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("a");
        lst.add("bb");
        lst.add("ccc");
        
        System.out.println(addStar(lst));
        System.out.println(copies3(lst));
        System.out.println(copies3B(lst));
    }
}
