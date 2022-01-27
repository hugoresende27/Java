/*
Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto 
seria o valor de uma circunferência e do volume de uma esfera para um raio 
daquele valor. 
Informar também o valor de PI com duas casas decimais.



 */
package entidades;


/**
 *
 * @author Hugo
 */
public class Calculador {
    public static final double PI = 3.14159265359;//sempre que é const final tem de ter valor definido
    
    public static double circunferencia(double raio){
        return 2*PI*raio;
    }
    
    public static double volume(double raio){
        return 4*PI*raio*raio/3;
    }
    
}
