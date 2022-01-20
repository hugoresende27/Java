/*
 Fazer um programa para ler os valores da largura e altura de um retângulo. 
A seguir, mostrar no ecrã o valor da área, perímetro e diagonal.

 */
package excretangulo;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Retangulo r1 = new Retangulo();
        
        System.out.print("Altura do retangulo-->");
        r1.altura = input.nextDouble();
        System.out.print("largura do retangulo-->");
        r1.largura = input.nextDouble();
        
        System.out.printf("\n\tAREA:: %.2f",r1.area(r1.altura,r1.largura));
        System.out.printf("\n\tPERIMETRO:: %.2f",r1.perimetro(r1.altura,r1.largura));
        System.out.printf("\n\tDIAGONAL:: %.2f",r1.diagonal(r1.altura,r1.largura));
    }
    
}
