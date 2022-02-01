/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excbanco;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numC = (int)Math.random();
        
        System.out.println("-- PROGRAMA BANCO HR --");
        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();
        System.out.println("Quer fazer um depósito inicial(s/n)?");
        char res = Character.toLowerCase((input.next().charAt(0)));
        if (res == 's'){
            System.out.println("Qual o montante a depositar? ");
            double deposito = input.nextDouble();
            Conta c1 = new Conta(numC,nome,deposito);
            System.out.println(c1);
        }
        else {
            Conta c1 = new Conta(numC,nome);
            System.out.println(c1);
        }
        
        
        
        
       
        
    }
    
}
