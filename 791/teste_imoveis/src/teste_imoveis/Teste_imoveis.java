/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_imoveis;

import entidades.Imovel;
import entidades.Novo;
import entidades.Usado;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Teste_imoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("PROGRAMA IMOEXPANSÃO");
        int op;
        do{
            System.out.println("1.NOVO");
            System.out.println("2.USADO");
            System.out.println("Qual o tipo de imóvel(1/2)?");
            op = input.nextInt();
            if (op != 1 && op!=2) System.out.println("Escolha 1 ou 2");
        }while (op != 1 && op!=2);
       
        if (op == 1){
            Imovel i = new Novo(); 
            i.InserirDados();
            System.out.println(i);
        }
        
        if (op == 2){
            Imovel i = new Usado(); 
            i.InserirDados();
            System.out.println(i);
        }
        
        
        
    }
    
}
