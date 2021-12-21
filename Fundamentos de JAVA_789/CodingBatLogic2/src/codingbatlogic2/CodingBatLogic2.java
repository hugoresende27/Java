/*

 */
package codingbatlogic2;

/**
 *
 * @author Hugo
 */
public class CodingBatLogic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        blackjack x = new blackjack();
        System.out.println(x.fun1(19, 21));
        System.out.println(x.fun1(22, 19));
        /////////////////////////////////////////////
        loneSum y = new loneSum();
        System.out.println(y.fun1(1,2,3));
        System.out.println(y.fun1(3,2,3));
        System.out.println(y.fun1(3,3,3));
        //////////////////////////////////////////////
        luckySum z = new luckySum();
        System.out.println(z.fun1(1,2,3));
        System.out.println(z.fun1(1,2,13));
        System.out.println(z.fun2(13,2,13));
    }
    
}
