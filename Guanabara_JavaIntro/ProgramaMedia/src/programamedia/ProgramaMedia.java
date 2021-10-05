/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.print("Primeira nota:: ");
        float n1 = leitura.nextFloat();
        System.out.print("Segunda nota:: ");
        float n2 = leitura.nextFloat();
        float m = ( n1+n2)/2;
        System.out.println("sua media foi "+ m);
        if (m>9){
            System.out.println("MUITO BEM");
        }
        // TODO code application logic here
    }
    
}
