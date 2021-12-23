/*
Aula sobre while e do while.

 */
package aulawhiledowhile;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class AulaWhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   ////////////////////////////////////////////////////     
        String res="";
        do{
   
        // /////////////////////////////////////////
            System.out.print("Qual o inicio?--> ");
            int inicio = input.nextInt();
            System.out.print("Qual o fim?--> ");
            int fim = input.nextInt();
            System.out.print("Quanto é o passo?--> ");
            int passo = input.nextInt();
            
            int fim2 = inicio;
            
            System.out.println("WHILE");
            while (inicio<=fim){
                System.out.print(inicio+ " | ");
                inicio +=passo;
            }
      //////////////////////////////////////////////////////////////////    
            System.out.println("\nAGORA PAR TRÁS COM DO WHILE");
            do {
                System.out.print(inicio+ " | ");
                inicio-=passo;
            }while (inicio>=fim2);
     ////////////////////////////////////////////////////////////////////
            System.out.print("\nQuer sair(s/n)? ->");
            res = input.next().toLowerCase();
        }while (!"s".equals(res));
    }
    
}
