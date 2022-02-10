/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excpolimorfismoc;

import entidades.Veiculos;
import entidades.Carro;
import entidades.Moto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcPolimorfismoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        List<Veiculos> veics = new ArrayList<>();
        
        
        System.out.println("Quantos Veiculos?");
        int qts = input.nextInt();
        
        for (int i=0; i<qts;i++){
            int esc;
            do{
                System.out.print("Quer registar :: \n1.Motas\n2.Carros\nEscolha--> ");
                esc = input.nextInt(); 
                if (esc != 1 || esc !=2) System.out.println("Escolha 1 ou 2");
            }while (esc != 1 && esc !=2);
                  
            if (esc == 1 ){
                    Veiculos m = new Moto(); 
                    m.InserirDados();
                    veics.add(m);
                }
            else {
                    Veiculos m = new Carro();
                    m.InserirDados();
                    veics.add(m);
            }
        }
        
        for (Veiculos x : veics){
            System.out.println(x);
        }
        
    
    }
    
}
