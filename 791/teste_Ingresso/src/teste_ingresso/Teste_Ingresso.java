/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_ingresso;

import entidades.CamaroteInferior;
import entidades.CamaroteSuperior;
import entidades.Ingresso;
import entidades.Normal;
import entidades.VIP;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Teste_Ingresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int op;
        
        System.out.println("Qual o tipo de Ingresso");
        do{
                   
            System.out.println("1.VIP");
            System.out.print("2.Normal\n-->");
            op = input.nextInt();
            if (op == 1){
                int cam;
                do{
                    System.out.print("Camarote\n1.Superior\n2.Inferior\n-->");
                    cam = input.nextInt();
                    if (cam != 1 && cam != 2) System.out.println("Escolha 1 ou 2");
                }while (cam != 1 && cam != 2);
               
                if (cam == 1){
                    System.out.print("Valor->");
                    double v = input.nextDouble();
                    Ingresso i1 = new CamaroteSuperior(v,20,15);
                    i1.ImprimeValor();

                }
                if (cam == 2){
                    input.nextLine();
                    System.out.print("Local->");               
                    String local = input.nextLine();                           
                    System.out.print("Valor->");
                    double v = input.nextDouble();


                    Ingresso i1 = new CamaroteInferior(local,v,20);
                    i1.ImprimeValor();
                }

            }
            if (op == 2){
                System.out.print("Valor->");
                double v = input.nextDouble();
                Ingresso i1 = new Normal(v);
                i1.ImprimeValor();
            }
        if (op != 1 && op != 2) System.out.println("Escolha 1 ou 2");
        }while (op != 1 && op != 2);
    }
    
}
