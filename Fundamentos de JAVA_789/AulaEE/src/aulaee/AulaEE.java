/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaee;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */

class Notas{
    void fun(float nota){
        if (nota>=0 && nota<=4){
            System.out.println("FRACO");
        } else if (nota>4 && nota<=9){
            System.out.println("INSUFICIENTE");
        } else if (nota>9 && nota<=14){
            System.out.println("SATISFAZ");
        } else if (nota>14 && nota<=18){
            System.out.println("SATISFAZ BASTANTE");
        } else if (nota>18 && nota<=20){
            System.out.println("EXCELENTE");
        } else {
            System.out.println("NOTA INVÁLIDA!");
        }
    }
}
public class AulaEE {

    /**
     *Desenvolva um programa que permita determinar a nota com base na pontuação.

0 a 4 -- fraco
5 a 9 -- insuficiente
10 a 14 -- satisfaz
15 a 18 -- satisfaz bastante
19 a 20 -- excelente

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Notas obj1 = new Notas();
        float nota=0;
        do {
            System.out.print("Qual a nota? (0-20)--> ");
            nota = input.nextFloat();
        }while (nota<0 || nota>20);
        
        obj1.fun(nota);
        /*
        if (nota>=0 && nota<=4){
            System.out.println("FRACO");
        } else if (nota>4 && nota<=9){
            System.out.println("INSUFICIENTE");
        } else if (nota>9 && nota<=14){
            System.out.println("SATISFAZ");
        } else if (nota>14 && nota<=18){
            System.out.println("SATISFAZ BASTANTE");
        } else if (nota>18 && nota<=20){
            System.out.println("EXCELENTE");
        }    
*/
    }  
}
