/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc3;

import aplicacao.Triangulo;
import static funcoes.ComparaAreas.compArea;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

            Triangulo x,y;
            x = new Triangulo();
            y = new Triangulo();

            System.out.print("Qual o valor do lado A do triangulo X ->");
            x.a = input.nextDouble();
            System.out.print("Qual o valor do lado B do triangulo X ->");
            x.b = input.nextDouble();
            System.out.print("Qual o valor do lado C do triangulo X ->");
            x.c = input.nextDouble();

            System.out.print("Qual o valor do lado A do triangulo Y ->");
            y.a = input.nextDouble();
            System.out.print("Qual o valor do lado B do triangulo Y ->");
            y.b = input.nextDouble();
            System.out.print("Qual o valor do lado C do triangulo Y ->");
            y.c = input.nextDouble();

            System.out.printf("Area X: %.4f\nArea Y: %.4f", x.area(),y.area());
            x.perimetro();
            y.perimetro();
            System.out.println("Soma lados X:: "+x.somarLados());
            System.out.println("Soma lados Y:: "+y.somarLados());

           //verificar se a área é NaN ou não. Se não for um triângulo área NaN
         /*
            if ((x.area() == Double.NaN) && (y.area() == Double.NaN)){
                 if (x.area() > y.area()){
                    System.out.println("\nArea de X é maior");
                } else if (x.area()<y.area()){
                        System.out.println("\nArea de Y maior");
                } else {
                        System.out.println("\nAreas iguais");
                }
                 
            } else {
                System.out.println("Um deles não é um triângulo!");
            }
           */
        
         compArea(x.area(),y.area());
         
         
    }
    
}
