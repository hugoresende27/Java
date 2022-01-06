/*
Desenvolva um programa que imprima os números de 1 a 100 no ecrã, com 
um incremento de 5. Use um ciclo for.
Exemplo: 0 5 10 15 20 25 … 100
 */
package exercicio1;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author Hugo
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ciclo for, começa no 0, vai até 100, incrementa 5 a cada iteração
        String tudo ="";
        for (Integer i=0; i<=100; i+=5){
            System.out.print(i+ " ");
            tudo += "-" + i.toString();
        }
        //JOptionPane.showMessageDialog(null,"Números de 0 a 100 com incremento de 5\n"+ tudo, "Exercício 1",JOptionPane.INFORMATION_MESSAGE);


        MyFrame frame = new MyFrame();


        /*
        int i,j=5,arrayNums[]=new int[21];
        for(i=0; i<21; i++){
            arrayNums[i]=i*j;
        };
        JOptionPane.showMessageDialog(null,"Números de 0 a 100 com incremento de 5\n"+ Arrays.toString(arrayNums),
                "Exercício 1 - Valentim",JOptionPane.INFORMATION_MESSAGE);

         */
    }

    }
    

