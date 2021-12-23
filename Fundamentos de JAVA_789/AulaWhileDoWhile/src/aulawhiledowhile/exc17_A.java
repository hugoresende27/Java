/*
Exercicio17_A
Crie um programa que imprima 11 vezes a frase " Feliz Natal!" utilizando uma estrutura de repetição while.
Exercicio17_D
Crie um programa que leia um número do teclado até que encontre um número menor ou igual a 1. 
Quando o numero 1 ou 0 é digitado, o programa termina. Use a estrutura DO… While

 */
package aulawhiledowhile;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class exc17_A {
    public static void main(String[] args) {
        
        int x=0;
        do{
            System.out.println("x="+x+" FELIZ NAVIDADE!!!");
            x++;
        }while (x<10);
        System.out.println(x);
        while (x>0){
            System.out.println("x="+x+" 2 FELIZ NAVIDADE!!!");
            x--;
        }
        
        /////////////////////////////////////////////
        Scanner input = new Scanner (System.in);
        int valor=0;
        do{
            System.out.print("Qual o valor? ");
            valor = input.nextInt();    
        }while (valor >1);
        System.out.println("TERMINANDO....");
        
        
    }
    
}
