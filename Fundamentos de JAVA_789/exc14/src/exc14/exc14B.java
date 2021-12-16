/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc14;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class exc14B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int produto_a,produto_b,produto_c ;
        int mais_barato=07;
        
       
        System.out.print("Qual o preço? A --> ");
        produto_a = input.nextInt();
        System.out.print("Qual o preço? B --> ");
        produto_b = input.nextInt();
        System.out.print("Qual o preço? C --> ");
        produto_c = input.nextInt();
        
        
        if (produto_a <= produto_b && produto_a<= produto_c){
            System.out.println("::"+produto_a);
        } else if (produto_b<=produto_c && produto_b<= produto_a){
            System.out.println("::"+produto_b);
        } else {
            System.out.println("::"+produto_c);
        }
    }
}
