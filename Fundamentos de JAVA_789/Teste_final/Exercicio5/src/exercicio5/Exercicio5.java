/*
Desenvolva um programa que aceite dois inteiros e imprima a soma, a 
diferença, o produto, a média, o máximo (o maior dos dois inteiros), o mínimo 
(menor dos dois Inteiros).
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //inicio das vars a, b e media
        float a=0,b=0,media=0;
        
        //input de valores
        System.out.print("VALOR 1--> ");
        a = input.nextFloat();
        System.out.print("VALOR 2--> ");
        b = input.nextFloat();
        
        System.out.printf("\n%.2f + %.2f = %.2f ", a,b,a+b);
        System.out.printf("\n%.2f - %.2f = %.2f ", a,b,a-b);
        System.out.printf("\n%.2f X %.2f = %.2f ", a,b,a*b);
        
        //cálculo da media
        media=(a+b)/2;
        System.out.printf("\nMEDIA::  %.2f\n", media);
        
        //estutura if para saber o maior
        if (a>b){//teste a maior do que b
            System.out.println("MAIOR:: "+a);
            System.out.println("MENOR:: "+b);
        } else if (a<b){//teste b maior do a
            System.out.println("MAIOR:: "+b);
            System.out.println("MENOR:: "+a);
        } else {//ultimos else são iguais, única opção possivel restante
            System.out.println("IGUAIS");
        }
        
        
    }
    
}
