/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Hugo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        x=4;
        y=7;
        z=12;
        boolean r,r2,r3 ;
        r =(x<y && y==z)?true:false;//uma e outra felizes
        System.out.println(r);
        r2 = (x<y || y==z)?true:false;//tanto faz uma ou outra
        System.out.println(r2);
        r3 = (x<y ^ y<z)?true:false;//exclusivo, ou uma ou outra, nunca as duas ou nenhuma
        System.out.println(r3);
        
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s ="Hello";
        
       // c=c+i;
        s += i ;
        //i += s;
        //c +=s;
        i +=l;
        System.out.println(s);
        System.out.println(i);
        
        int num1=1;
        int num2=0;
        
        while (num1<10)
        {
            ++num2;
            num1 = num1+ 1;
            if (num2>6) ++num1;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
