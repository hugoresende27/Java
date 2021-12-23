/*
Exercicio17_A
Crie um programa que imprima 11 vezes a frase " Feliz Natal!" utilizando uma estrutura de repetição while.
Exercicio17_B
Desenvolva um programa para exibir os números de 1 até 50 na tela.
Use a estrutura … While.
Exercicio17_C
Crie um programa para ler 3 notas e mostrar a média.
Use a estrutura … While.
Exercicio17_D
Crie um programa que leia um número do teclado até que encontre um número menor ou igual a 1. 
Quando o numero 1 ou 0 é digitado, o programa termina. Use a estrutura DO… While
Exercicio17_E
Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma e a média dos números digitados. Use a estrutura DO… While
 */
package exc17;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc17 {
    
    
    public static void questaoA(){
        int x=0;
        do{
            System.out.println((x+1)+"->FELIZ NAVIDADE");
            x++;
        }while (x<10);
    }
    ///////////////////////////////////////////////////////
    public static void questaoB(){
        int x=1;
        do{
            System.out.print((x)+ " | ");
            x++;
        }while (x<51);
    }
    ///////////////////////////////////////////////////////
    public static void questaoC(){
        Scanner input = new Scanner (System.in);
        float notas=0,media=0;
        int contador=0;
        
        while (contador<3){
            System.out.print("Nota "+(contador+1)+"--> ");   
            notas+= input.nextFloat();
            contador++;
        }
        media = notas/3;
        System.out.printf("Media %.2f", media); 
    }
    ///////////////////////////////////////////////////////
    public static void questaoD(){
        Scanner input = new Scanner (System.in);
        int valor=0;
        do{
            System.out.print("Qual o valor? ");
            valor = input.nextInt();    
        }while (valor >1);
        System.out.println("TERMINANDO....");
    }
    ///////////////////////////////////////////////////////
    public static void questaoE(){
        Scanner input = new Scanner (System.in);
        int valor=0;
        int total=0;
        int contador=0;
        float media=0;
        
        do{
            System.out.print("Qual o valor? ");
            valor = input.nextInt();   
            total +=valor;
            contador++;
        }while (valor >1);
        
        System.out.println("TERMINANDO....");
        System.out.println("TOTAL::: "+total);
        media = total/contador;
        System.out.println("MEDIA:::"+media);
    }
   //////////////////////////////////////////////////
    public static void menu(){
        System.out.println("*****************");
        System.out.println("** A->Alinea A **");
        System.out.println("** B->Alinea B **");
        System.out.println("** C->Alinea C **");
        System.out.println("** D->Alinea D **");
        System.out.println("** D->Alinea E **");
        System.out.println("** S-> SAIR <- **");
        System.out.println("*****************");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("EXERCICIO 17");
        
     
        
        do{
            menu();
            System.out.print("Opcao--> ");
            char opcao = Character.toUpperCase((input.next().charAt(0)));
            switch (opcao){
                case 'A':
                    questaoA();
                    break;
                case 'B':
                    questaoB();
                    break;
                case 'C':
                    questaoC();
                    break;      
                case 'D':
                    questaoD();
                    break; 
                case 'E':
                    questaoE();
                    break; 
                case 'S':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
        }while (true);
    
}
