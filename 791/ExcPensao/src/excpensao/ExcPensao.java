/*
A dona de uma pensão possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). De seguida, registe o aluguer dos
N estudantes. Para cada registro de aluguer, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. No final, o seu programa deve imprimir
um relatório de todas ocupações da pensão, por ordem de quarto,
conforme exemplo.

 */
package excpensao;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcPensao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
   
        Estudante[] vetor = new Estudante[10];
        int qtd;
        do{
            System.out.println("Quantos estudantes vão alugar quartos?(1-10) ");
            qtd = input.nextInt();
        }while(qtd<1 || qtd>10);
        
        input.nextLine();
        
        for (int i = 0; i < qtd; i++) {
                
                System.out.println("Quartos #  : \nNome:"); 
                String name = input.nextLine();
                
                System.out.print("Email: ");
                String email = input.nextLine();
                
                int quarto;
                boolean flag = true;
                while (flag)
                {
                    do{
                        System.out.println("Quarto (0-9) ? ");
                        quarto = input.nextInt();
                        input.nextLine();      
                    }while (quarto<0 || quarto > 10);
                    
                    if (vetor[quarto]==null) {
                        vetor[quarto] = new Estudante(name, email);
                        flag = false;
                    }
                    else {
                        System.out.println("Ocupado!");
                        System.out.println("Quartos livres :: ");
                        for (int f=0; f<vetor.length; f++){
                            if (vetor[f] == null){
                                System.out.print("-"+f+"-");
                            }
                        }
                    }
               
               
                };
      
        }
        
        System.out.println();
        System.out.println("Ocupação: ");
        for (int i = 0; i < qtd; i++) {        
              System.out.println(i+ ": " + vetor[i]);
        }
    }
    
}
