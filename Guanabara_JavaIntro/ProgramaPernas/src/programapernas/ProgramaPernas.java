/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas Pernas?");
        int escolha = tec.nextInt();
        String tipo;
        switch (escolha)
        {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo="Tripé";
                break;
            case 4:
                tipo ="Quadrupede";
                break;
            case 6:
                tipo ="Aranha";
                break;
            case 8:
                tipo ="Aranha";
                break;
            default:
                tipo ="ET";
                break;
        }
        System.out.printf("é do tipo :: %s\n", tipo);         
        }
        
        // TODO code application logic here
    }
    

