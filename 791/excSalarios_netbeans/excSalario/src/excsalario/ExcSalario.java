/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
Depois, mostrar os dados do funcionário (nome e salário líquido). 
Em seguida, aumentar o salário do funcionário com base numa percentagem dada 
(salário bruto) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
Funcionario
nome: String
salarioBruto: double
Percentagem: double
salarioLiquido:double
aumentarSalario(percentagem: double): void

 */
package excsalario;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.print("Nome--> ");
        f1.setNome(input.next());
        System.out.print("Salario Bruto--> ");
        f1.setSalBruto(input.nextDouble());
        double taxa_aux=0;
        do{
            System.out.print("Imposto (0-100%)--> ");
            taxa_aux = input.nextDouble();
            if (taxa_aux >100 || taxa_aux < 0) System.out.println("Entre 0 e 100");
        }while (taxa_aux >100 || taxa_aux < 0);
        
        f1.setTaxa(taxa_aux);
        
        System.out.println(f1);
        
        System.out.println("Quer aumentar o salário? (S/N)");
        char op = Character.toLowerCase((input.next().charAt(0)));
        if (op == 's'){
            double taxa_aux2=0;
            do{
                System.out.print("Percentagem do aumento? (0-100%)-->");
                taxa_aux2 = input.nextDouble();
                if (taxa_aux2 >100 || taxa_aux2 < 0) System.out.println("Entre 0 e 100");
            }while (taxa_aux2 >100 || taxa_aux2 < 0);
            f1.setPercentagem(taxa_aux2);
            f1.aumento();
            System.out.println(f1+"\n\tSal aumentado::: "+f1.getAumento()+ " €");
        } else {
            System.out.println(f1);
        }
    }
    
}
