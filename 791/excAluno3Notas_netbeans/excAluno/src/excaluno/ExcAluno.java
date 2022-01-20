/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
No final, mostrar qual a nota final do aluno no ano. 
Dizer também se o aluno está aprovado ou reprovado e, em caso negativo, quantos 
pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
Deve criar uma classe Estudante para resolver este exercício.
 */
package excaluno;


import static calculos.Medias.*;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
   
        Estudante a1 = new Estudante();
        
  
        System.out.print("Nome--> ");
        a1.setNome(input.next());
        a1.setNotas();
        
        double media = med(a1.notas)*100/20;    //media aqui é convertida para de 0 a 100
        a1.mostraDados();
        
        //media geral 25% cada nota convertido de 0 a 100
        //System.out.println("MEDIA a 25%|25%|25%|25%:: "+String.format("%.2f",medGeral(a1.notas)*100/20));
        //media de 0 a 20 25% cada nota
        //System.out.println("Media de 0 a 20:: "+String.format("%.2f",medGeral(a1.notas)));
        
        //media 20 20 30 30  convertido de 0 a 100
        System.out.println("MEDIA a 20%|20%|30%|30%:: "+String.format("%.2f",media)); 
        //media de 0 a 20 , notas a valer 20 20 30 30
        System.out.println("Media de 0 a 20:: "+String.format("%.2f",media*20/100));
        
      
        if (media>=60){//media aqui já está convertida de 0 a 100
            System.out.println("Aprovado! Com "+String.format("%.2f", (media-60))+" pontos a mais...");
        } else {
            System.out.println("Reprovado, faltam "+String.format("%.2f", (60-media))+" pontos...");
        }
        
        
       
       
        
    }
    
}
