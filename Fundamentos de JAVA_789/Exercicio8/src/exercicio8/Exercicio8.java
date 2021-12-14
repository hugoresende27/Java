/*
PROGRAMA QUE MOSTRE SE ALUNO ESTÁ APROVADO OU REPROVADO MEDIANTE A MÉDIA DE 3 TESTES
aprovado media >=10
reprovado media <10
 */

package exercicio8;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        Media x = new Media();
        float nota=0,media=0;
        int teste=0;
        System.out.print("Quantos testes --> ");
        teste = input.nextInt();
        for (int i=0; i<teste; i++){
            System.out.printf("Nota %d --> ", i+1);
            nota += input.nextFloat();
        }
        media = (nota/teste);
        System.out.printf("Media :: %.2f",media);
        if (media>=9.5){
            System.out.println("\nAPROVADO");
        }else if(media >=8.5){
            System.out.println("\nRECUPERAÇÃO!");
        } else {
            System.out.println("\nREPROVADO");
        }
        
        //tbm criei a classe Media noutro ficheiro 
        System.out.println(x.medias(nota,teste));
        System.out.println(x.aprov(media));
        
    }
}
