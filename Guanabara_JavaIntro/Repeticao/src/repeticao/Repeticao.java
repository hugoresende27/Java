/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        do
        {
            System.out.println("Cambalhota "+cont);
            cont++;
        }while (cont<4);
        
        //////////////////////
        
        int numero, soma=0;
        String resposta;
        Scanner teclado = new Scanner (System.in);
        
        do
        {
             System.out.println("Qual o numero??");
             numero = teclado.nextInt();
             soma+=numero;
             System.out.println("Quer continuar?? (s/n)");
             resposta= teclado.next();
        }while (resposta.equals("s"));
        System.out.println("A soma de todas os valores dá :: " + soma);
        
        
    }
    
}
