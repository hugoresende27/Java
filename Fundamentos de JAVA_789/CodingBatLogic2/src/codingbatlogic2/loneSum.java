/*
Given 3 int values, a b c, return their sum. However, if one of the values is the 
same as another of the values, it does not count towards the sum.
loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */
package codingbatlogic2;

/**
 *
 * @author Hugo
 */
public class loneSum {
    int fun1(int a,int b, int c){
        if (a==b && b==c) {
            a=0;
            b=0;
            c=0;
        }
        else if (a==c) {
            a=0;
            c=0;
        }
        else if (b==c) {
            b=0;
            c=0;
        }
        else if  (a==b){
            a=0;
            b=0;
        };
        return a+b+c;
    }
    
    int fun2(int a,int b,int c){
        int sum=0;
        if (a !=b && a !=c){
            sum+=a;
        }
        if (b != a && b!=c){
            sum +=b;
        }
        if (c != a && c!=b){
            sum +=c;
        }
        return sum;
    }
}
