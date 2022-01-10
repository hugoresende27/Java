/*
Desenvolva um programa que calcule o número médio de alunos por turma.
Para isto, peça ao utilizador que indique a quantidade de turmas e a 
quantidade de alunos para cada turma. As turmas não podem ter mais de 
20 alunos.
Para a realização deste exercício use uma estrutura do… while.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //inicio das vars
        int turmas=0,contAux=0;
        //alunos sao vars float para o cálculo da media 
        float mediaAlunos=0,totalAlunos=0,alunosTurma=0;
        
        
        //ciclo do para apenas aceitar 1 turma no minimo
        do{
           System.out.println("Quantas turmas (minimo 1) ?");
           turmas = input.nextInt();
        }while (turmas <1);
        
        //ciclo while vai iterar até turmas ser igual a 0
        while (turmas!=0){
            //ciclo do com input de nr de alunos por turma, controlando minimo 0 e maximo 20
            do {
                System.out.print("Nr de alunos da turma "+(contAux+1)+" [máximo 20]--> ");
                alunosTurma = input.nextFloat();           
            }while (alunosTurma<0 || alunosTurma>20);
            //dentro do ciclo while, o totalAlunos vai ser incrementado a cada turma
            totalAlunos += alunosTurma;
            contAux++;//contador auxiliar vai controlar o numero de turmas e vai somar 1 a cada ciclo
            turmas--;//var turmas vai decrementar uma unidade a cada iteração
        }
           
        //cálculo da média de alunos, o total de alunos a dividir pelo contador auxiliar
        mediaAlunos = totalAlunos / contAux;//a divisão não pode ser por turmas, visto turmas ter o valor 0 aqui
        
        //output dos dados
        System.out.println("TOTAL ALUNOS:: "+totalAlunos);
        //output da media float arredondado a 0 casas decimais, 8.66 vai imprimir 9
        System.out.printf("MEDIA DE ALUNOS POR TURMA:: %.0f\n",mediaAlunos);
  
    }
    
}
