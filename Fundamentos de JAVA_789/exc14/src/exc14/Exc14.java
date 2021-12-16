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
public class Exc14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int precos[] = new int[3];
        int mais_barato=07;
        
        for (int i=0; i<3; i++) {//loop para preencher o vetor
            System.out.printf("Qual o preço? [%d] --> ", i+1);
            precos[i] = input.nextInt();
        }
        for (int i=0; i<3; i++) {
            mais_barato=precos[0];//mais barato vai ser o preco da primeira posição
            if (precos[i]<mais_barato){//se o preco da posicao i for mais barato
                mais_barato=precos[i];//mais barato passa a ser preco[i]
            }
        }
        System.out.printf("\n\tO mais barato é %d\n", mais_barato);
        
       
       
        
    }
    
}
