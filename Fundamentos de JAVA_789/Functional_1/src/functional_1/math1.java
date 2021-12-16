/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]

Given a list of strings, return a list where each string is converted to lower case 
(Note: String toLowerCase() method).
lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
package functional_1;

import static functional_1.square.square;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class math1 {
    public static List<Integer> math1(List<Integer> nums) {
        for (int i=0; i<nums.size();i++){
            //System.out.println(nums.get(i));
            nums.set(i,(nums.get(i)+1)*10);
        }
        return nums;
    }
    
    public static void arvore(int height){
         for (int i = 0; i < height; ++i) {
            for (int j = -height + 1; j < -i; ++j) {
                System.out.print(" ");
            }
        for (int j = -i; j <= i; ++j) {
            if (j == 0) {
                System.out.print(".|.");
            } else if (j < 0) {
                System.out.print("\\");
            } else {
                System.out.print("/");
            }
  }
  System.out.println("");
      }
}
    
    public static List<String> lower(List<String> strings) {
           for (int i=0; i<strings.size();i++){
            strings.set(i,strings.get(i).toLowerCase());
        }
        return strings;
}



    public static void main(String[] args) {
        List<Integer> y = new ArrayList<Integer>();
        y.add(1);
        y.add(2);
        y.add(3);
        System.out.println(math1(y));
        Scanner sc = new Scanner(System.in);
 /*
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        arvore(height);
   */     
        List<String> a = new ArrayList<String>();
        a.add("Hello");
        a.add("Hi");
        System.out.println(lower(a));
        
        
    }
}
