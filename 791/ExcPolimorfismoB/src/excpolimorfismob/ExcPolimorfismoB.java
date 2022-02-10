/*
Uma loja de música deseja construir um Registo dos seus produtos. A mesma vende CDs e 
DVDs e pretende registar ara cada áudio/midia dados como código, nome e preço. 
Desenvolva um programa que tenha em conta todos os cenários abaixo apresentados:

 */
package excpolimorfismob;

import entidades.CD;
import entidades.DVD;
import entidades.Midia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcPolimorfismoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        List<Midia> midias = new ArrayList<>();
        
        
        System.out.println("Quantos produtos?");
        int qts = input.nextInt();
        
        for (int i=0; i<qts;i++){
            int esc;
            do{
                System.out.print("Quer registar :: \n1.CD's\n2.DVD's\nEscolha--> ");
                esc = input.nextInt(); 
                if (esc != 1 || esc !=2) System.out.println("Escolha 1 ou 2");
            }while (esc != 1 && esc !=2);
                  
            if (esc == 1 ){
                    Midia m = new CD();
                    m.InserirDados();
                    midias.add(m);
                }
            else {
                    Midia m = new DVD();
                    m.InserirDados();
                    midias.add(m);
            }
        }
        
        for (Midia x : midias){
            System.out.println(x);
        }
        
    }
    
}
