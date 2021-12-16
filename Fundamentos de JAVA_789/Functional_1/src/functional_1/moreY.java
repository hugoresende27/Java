/*
Given a list of strings, return a list where each string has "y" added at its start and end.
moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */
package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hugo
 */
public class moreY {
    public static List<String> moreY(List<String> strings) {
        return strings.stream().
                map(x -> x.concat("y"))
                .collect(Collectors.toList());
}
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        
        System.out.println(moreY(lst));
    }
}
