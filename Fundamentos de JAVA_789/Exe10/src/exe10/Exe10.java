/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe10;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */


public class Exe10 {

    /**
     *Desenvolva um programa que permita determinar a se o aluno está aprovado ou reprovado tendo 
     * em conta as seguintes condições:
Média dos 3 testes >=10
Número de faltas <=3

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float notas =0,media=0;
        int faltas=0;
        ///////////////////CICLO PARA LER AS NOTAS////////////////
        for (int i=0;i<3;i++){
            System.out.printf("Nota do teste %d --> " , i+1);
            //System.out.println("Informe a nota do teste " + (i+1) + ":");
            notas += input.nextFloat();//notas vão ser somadas na var notas
        }
        System.out.print("Quantas faltas? --> ");
        faltas = input.nextInt();
        
        media=notas/3;
        System.out.printf("\nMEDIA:: %.2f\n",media);
        
        if (media>=10 && faltas <= 3){
            System.out.println("APROVADO!");
        }else {
            System.out.println("REPROVADO! ");
        }
        
    }
    
}
