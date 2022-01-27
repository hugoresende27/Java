/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a 
ser comprado por uma pessoa em euros. 
Informar quantos euros a pessoa vai pagar pelos dólares, considerando ainda que 
a pessoa terá que pagar 6% de imposto sobre o valor em dólar. 
Criar uma classe CambioMoeda para ser responsável pelos cálculos.
1 United States Dollar equals 0.90 Euro

 */
package principal;

import cambios.CambioMoeda;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Qual o valor do dólar? --> ");
        double tax = input.nextDouble();
        System.out.print("Quantos doláres vai comprar? -->");
        double dol = input.nextDouble();
 
        System.out.println("Vai pagar em euros :: "+CambioMoeda.conversao(dol, tax));
    }
    
}
