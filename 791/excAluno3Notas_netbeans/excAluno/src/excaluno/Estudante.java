/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
No final, mostrar qual a nota final do aluno no ano. 
Dizer também se o aluno está aprovado ou reprovado e, em caso negativo, quantos 
pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
Deve criar uma classe Estudante para resolver este exercício.
 */
package excaluno;


import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Estudante {
    
    private String nome;
    
    public double notas[] = new double[4];
    

    public Estudante() {
    }

    public Estudante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public void setNotas() {
        Scanner input = new Scanner (System.in);
        double temp=0;
        for (int i=0; i<4;i++){    
            do{
                System.out.print("Nota Trimestre "+(i+1)+"::(0-20)--> ");
                temp = input.nextDouble();
            }while (temp <0 || temp > 20);
            
            this.notas[i]=temp;
        }      
    }

    //Mostrar Info
    public void mostraDados(){
        System.out.println(this.nome);
        
        for (int i=0; i<4;i++){
            System.out.println("Trimestre "+(i+1)+"::"+this.notas[i]);           
        }
    }

  
    
 
    
}
