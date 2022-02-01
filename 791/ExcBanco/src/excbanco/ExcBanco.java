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
    
     public void menu(){
        System.out.println("-- PROGRAMA BANCO HR --");
        System.out.println("1.Abrir Conta");
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numC =  (int)(1+Math.random()*(1000-1));
        Conta c1;
        
        System.out.println("-- PROGRAMA BANCO HR --");
        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();
        System.out.println("Quer fazer um depósito inicial(s/n)?");
        char res = Character.toLowerCase((input.next().charAt(0)));
        if (res == 's'){
            System.out.println("Qual o montante a depositar? ");
            double deposito = input.nextDouble();
            c1 = new Conta(numC,nome,deposito);
            System.out.println(c1);
        }
        else {
            c1 = new Conta(numC,nome);
            System.out.println(c1);
        }
        
        
        System.out.println("Valor a depositar?");
        double depos = input.nextDouble();
        c1.deposito(depos);
        System.out.println(c1);
        
        
        System.out.println("Valor a levantar?");
        double levan = input.nextDouble();
        c1.levantamento(levan);
        System.out.println(c1);
        
        
        
       
        
    }
    
}
