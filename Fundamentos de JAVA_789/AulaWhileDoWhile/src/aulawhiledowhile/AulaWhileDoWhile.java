/*
Aula sobre while e do while.
 */
package aulawhiledowhile;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class AulaWhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // /////////////////////////////////////////
        int x = 0;
        while (x<=10){
            System.out.println("WHILE "+x);
            x++;
        }
  //////////////////////////////////////////////////////////////////      
        do {
            System.out.println("DOWHILE "+x);
            x--;
        }while (x>=0);
 ////////////////////////////////////////////////////////////////////
        String res="";
        do{
            System.out.println("Quer sair(s/n)? ->");
            res = input.next();
        }while (!"s".equals(res));
    }
    
}
