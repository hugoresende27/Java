/*
Desenvolva um programa que imprima os números de 1 a 100 no ecrã, com 
um incremento de 5. Use um ciclo for.
Exemplo: 0 5 10 15 20 25 … 100
 */
package exercicio1;

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
        for (int i=0; i<=100; i+=5){
            System.out.print(i+ " ");
        }
    }
    
}
