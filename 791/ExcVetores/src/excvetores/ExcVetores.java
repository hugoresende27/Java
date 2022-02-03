/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excvetores;

import entidades.Produto;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcVetores {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         double soma=0;
         
        System.out.println("Quantos Produtos? ");
        int num = input.nextInt();
        
        Produto[] vetor = new Produto[num];
        //Produto[] pro;
        //pro = new Produto[num];
        
        for (int i=0; i<vetor.length;i++){
            
            System.out.println("Qual o nome?");
            input.nextLine();
            String nome = input.nextLine();
            
            
            
            System.out.println("Qual o preço?");
            double preco = input.nextDouble();
          
            vetor[i] = new Produto(nome,preco);
            soma += vetor[i].getPreco();
        }
        double media = soma/vetor.length;
        
        System.out.println(":::::PRODUTOS:::::");
        for (int i=0; i<vetor.length;i++){
            System.out.println(vetor[i].getNome());
            System.out.println(vetor[i].getPreco());
        }
        System.out.println("MEDIA::: "+media);
        
        
    }
    
}
