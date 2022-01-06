/*
Desenvolva um programa que solicite ao utilizador o seu nome, profissão e 
valor das vendas no mês corrente. Usando a estrutura lógica Switch … Case, 
mostre:
 Caso a profissão seja Comercial, o ordenado é 1200€ e tem um prémio de 40% sobre o 
valor das vendas
 Caso a profissão seja Tecnico, o ordenado é 800€ e tem um prémio de 20% sobre o 
valor das vendas
 Caso a profissão seja Diretor, o ordenado é 1700€ e tem um prémio de 30% sobre o 
valor das vendas
 Caso a profissão seja Gerente, o ordenado é 1500€ e tem um prémio de 20% sobre o 
valor das vendas
No final, o programa deve mostrar o nome e profissão do utilizador, bem 
como o valor do prémio e o valor final do ordenado com o prémio.

 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        //menu para escolha a profissão
        System.out.println("Escolha a sua profissão :");
        System.out.println("*********************");
        System.out.println("**   1.COMERCIAL   **");
        System.out.println("**   2.TECNICO     **");
        System.out.println("**   3.DIRETOR     **");
        System.out.println("**   4.GERENTE     **");
        System.out.println("*********************");
    }
    
    public static void main(String[] args) {
        //inicio da biblioteca Scanner
        Scanner input = new Scanner (System.in);
        
        //iniciação das vars 
        String nome="",cargo="";
        int profissao=0,vendas=0;
        double salarioFinal=0,salarioInicial=0,premio=0;
        
        //inputs
        System.out.println("Qual o seu nome?");
        nome = input.nextLine();
        
        System.out.print("Quantas vendas? -> ");
        vendas = input.nextInt();
        
        menu();
        profissao = input.nextInt();
        
        //switch case com a var profissao, cada case define o cargo, salarioInicial e premio
        switch (profissao){
            case 1:
                cargo = "Comercial";
                salarioInicial=1200;
                premio = vendas*0.40;
               
                break;
            case 2:
                cargo = "Técnico";
                salarioInicial=800;
                premio = vendas*0.20;
                
                break;
            case 3:
                cargo = "Director";
                salarioInicial=1700;
                premio = vendas*0.30;
                
                break;
            case 4:
                cargo = "Gerente";
                salarioInicial=1500;
                premio = vendas*0.20;           
                break;
                
        }
        //o cálculo do salario final é feito aqui, no switch case foi atribuido valor às vars salarioInicial e premio
        salarioFinal = salarioInicial + premio;
        
        //output final de dados do funcionário
        System.out.println("Funcionário:: "+nome+"\ncargo:: "+cargo+"\nvendas:: "+vendas);
        //output com printf para formatar com 2 casas decimais
        System.out.printf("Salario Inicial:: %.2f€\nPremio:: %.2f€\nSalarioFinal:: %.2f€\n",salarioInicial,premio,salarioFinal);
    }
    
 
}
