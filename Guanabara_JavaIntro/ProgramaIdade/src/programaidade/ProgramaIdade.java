/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner (System.in);
        System.out.print("Ano de nascimento:::: ");
        int nasc = t.nextInt();
        int idade = 2021 - nasc;
        System.out.println("Sua Idade é "+idade);
        if ( idade>=18){
            System.out.println("MAIOR de idade");
        }else{
            System.out.println("menor de idade");
        }
    }
    
}
