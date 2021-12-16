/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
Given a list of integers, return a list of the integers, omitting any that are less than 0.
noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
Given a list of integers, return a list of those numbers squared and the product added to 10, 
omitting any of the resulting numbers that end in 5 or 6.
square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
 */
package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hugo
 */
public class rightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(x-> x%10);
        return nums;
    }
    //////////////////////////////////////////////////////////
    public static List<Integer> noNeg(List<Integer> nums) {
        nums = nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        return nums;
    }
    /////////////////////////////////////////////////////////
    public static List<Integer> square56(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> (int)Math.pow(n,2)+10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
        return nums;
    }

    /////////////////////////////////////////////////////////
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(16);
        lst.add(88);
        lst.add(886);
        
        System.out.println(rightDigit(lst));
        
        List<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(-3);
        lst2.add(-3);
        lst2.add(3);
        
        System.out.println(noNeg(lst2));
        
        List<Integer> lst3 = new ArrayList<Integer>();
        lst3.add(3);
        lst3.add(1);
        lst3.add(4);
        
        System.out.println(square56(lst3));
    }

}
