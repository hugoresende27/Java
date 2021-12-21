/*
Given 3 int values, a b c, return their sum. However, if one of the values is 13 
then it does not count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count.
luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
 */
package codingbatlogic2;

/**
 *
 * @author Hugo
 */
public class luckySum {
        public int fun1(int a, int b, int c) {
        int tot=0;
        if(a!=13 && b!=13 && c!=13){
            tot = a+b+c;
        }
        else if (a==13){
            tot=0;
        }
        else if (b==13){
            tot=a;
        }
        else if (c==13){
            tot=a+b;
        }
        return tot;
}
        
        public int fun2(int a, int b, int c){
            if (a==13){
                a=0;b=0;c=0;
            } if (b==13){
                b=0;c=0;
            } if (c==13){
                c=0;
            }
            return a+b+c;
        }
        

}
