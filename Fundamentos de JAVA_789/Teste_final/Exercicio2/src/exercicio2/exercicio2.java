/*
Desenvolva um programa que faça a leitura de duas notas de um aluno. O
programa deve calcular a média alcançada por aluno e apresentar (use um
ciclo if):
Aprovado - se a média for maior ou igual a nove;
Reprovado – se a média for menor do que sete;
Em recuperação – se a média for entre 7 e 9.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //biblioteca Scanner para input de dados
        Scanner input = new Scanner(System.in);

        //variaveis float, uma para cada nota e uma para a media
        float nota1=0,nota2=0,media=0;

        //input de dados
        do{//ciclo do para controlar entrada de nota entre 0 e 20
            System.out.print("Qual a primeira nota?(0-20) --> ");
            nota1 = input.nextFloat();
            //msg de erro caso a nota não esteja entre 0 e 20
            if (nota1<0 || nota1>20) System.out.println("Entre 0 e 20");
        }while (nota1<0 || nota1>20);

        do{//ciclo do para controlar entrada de nota entre 0 e 20
            System.out.print("Qual a segunda nota?(0-20) --> ");
            nota2 = input.nextFloat();
            //msg de erro caso a nota não esteja entre 0 e 20
            if (nota2<0 || nota2>20) System.out.println("Entre 0 e 20");
        }while (nota2<0 || nota2>20);

        //cálculo da media
        media = (nota1+nota2) / 2;
        //output da media
        System.out.println("MEDIA :: "+media);

        //estrutura de decisão if
        if (media >=9){//se a media for maior do que 9, aprovado
            System.out.println("APROVADO");
        } else if (media>=7){//se for abaixo de 9 e maior do que 7, recuperação
            System.out.println("RECUPERAÇÂO");
        } else {//se for abaixo de 7, reprovado, aqui basta um else não preciso de testar a condição
            System.out.println("REPROVADO");
        }


    }



}

