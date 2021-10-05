/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ----------OUTPUT------------
        float nota = 8.5f; //igual a float nota2 = (float) 8.5;
        String nome = "Hugo";
        System.out.println("a nota é "+ nota);
        System.out.printf("a nota de %s com o f de formatado: %.2f\n" , nome,nota);
        System.out.format("A nota de %s é %.5f\n",nome,nota);
        System.out.print("aa\n");
        // ----------INPUT-------------
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno::");
        String nome_input = teclado.nextLine();
        System.out.print("Digite a nota::");
        float nota_input = teclado.nextFloat();
        System.out.print("Digite a idade::");
        int idade = teclado.nextInt();
        System.out.printf("A nota de %s é de %.3f e tem %s anos\n" , nome_input,nota_input,idade);
        
        boolean val1 = (4>=5), val2 =(4<4), val3 = (val1==val2);
        boolean val4= val1^val3;
        boolean val5 = !val2 && val4;
        System.out.println(val4+" "+val5);
        
        
    }
    
}
