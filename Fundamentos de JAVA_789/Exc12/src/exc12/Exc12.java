/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc12;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("MES--> ");
        String mes = input.nextLine().toLowerCase();
        if (mes.equals("janeiro") || mes.equals("fevereiro") || mes.equals("marco")){
            System.out.println("INVERNO");
        } else if (mes.equals("abril") || mes.equals("maio") || mes.equals("junho")){
            System.out.println("PRIMAVERA");
        } else if (mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro")){
            System.out.println("VERÃO");
        } else if (mes.equals("outurbo") || mes.equals("novembro") || mes.equals("dezembro")){
            System.out.println("OUTONO");
        }else if (mes.equals("sair")){
            System.exit(0);
        } else {
            System.out.println("Mes inválido!");
        }
    }
    
}
