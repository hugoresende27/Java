/*
Given a list of integers, return a list where each integer is multiplied with itself.
square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
 */
package functional_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class square {
    public static List<Integer> square(List<Integer> nums) {
        for (int i=0; i<nums.size();i++){
            //System.out.println(nums.get(i));
            nums.set(i,nums.get(i)*nums.get(i));
        }
        return nums;
}
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        System.out.println(square(x));
    }
}
