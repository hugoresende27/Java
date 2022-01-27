/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a 
ser comprado por uma pessoa em euros. 
Informar quantos euros a pessoa vai pagar pelos dólares, considerando ainda que 
a pessoa terá que pagar 6% de imposto sobre o valor em dólar. 
Criar uma classe CambioMoeda para ser responsável pelos cálculos.
1 United States Dollar equals 0.90 Euro
 */
package cambios;

/**
 *
 * @author Hugo
 */
public class CambioMoeda {
    public static final double IMPOSTO = 0.06 ;
    
    public static double conversao(double qtd, double precoDolar){
        return qtd*precoDolar*(1+IMPOSTO);
    }
}
