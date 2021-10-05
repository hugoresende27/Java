/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternário;

/**
 *
 * @author Hugo
 */
public class OperadorTernário {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r,n1,n2;
        n1=14;
        n2=8;
        r= (n1>n2)?n1+n2: n2-n1;
        System.out.println(r);
        
        int a=61, b=81;
        String c;
        if (a>b){
            c="Primeiro é maior";
        }else{
            c="Segundo é maior";
        }
        System.out.println(c);
        String d= (a<=b)?"segundo maior":"primeiro maior";
        System.out.println(d);
              
    }
    
}
