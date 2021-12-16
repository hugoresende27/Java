/*
Given a list of integers, return a list where each integer is multiplied by 2.
doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */
package functional_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        for (int i=0; i<nums.size();i++){
            //System.out.println(nums.get(i));
            nums.set(i,nums.get(i)*2);
        }
        return nums;
}
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(doubling(a));
    }
    
}
