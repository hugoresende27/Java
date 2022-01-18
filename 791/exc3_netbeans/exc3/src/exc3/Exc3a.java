/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc3;

import static funcoes.ComparaAreas.compArea;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double xa,xb,xc,ya,yb,yc;
            System.out.print("Qual o valor do lado A do triangulo X ->");
            xa = input.nextDouble();
            System.out.print("Qual o valor do lado B do triangulo X ->");
            xb = input.nextDouble();
            System.out.print("Qual o valor do lado C do triangulo X ->");
            xc = input.nextDouble();

            System.out.print("Qual o valor do lado A do triangulo Y ->");
            ya = input.nextDouble();
            System.out.print("Qual o valor do lado B do triangulo Y ->");
            yb = input.nextDouble();
            System.out.print("Qual o valor do lado C do triangulo Y ->");
            yc = input.nextDouble();

            double perimetroX = (xa+xb+xc)/2;
            double perimetroY = (ya+yb+yc)/2;

            double areaX = Math.sqrt(perimetroX*(perimetroX-xa)*(perimetroX-xb)*(perimetroX-xc));
            double areaY = Math.sqrt(perimetroY*(perimetroY-ya)*(perimetroY-yb)*(perimetroY-yc));

            System.out.printf("Perimetro X: %.4f Area X: %.4f\nPerimetro Y: %.4f Area Y: %.4f", perimetroX,areaX,perimetroY,areaY);

            //verificar se a área é NaN ou não. Se não for um triângulo área NaN
            /*
            if ((areaX == Double.NaN) && (areaY == Double.NaN)){
                if (areaX > areaY){
                        System.out.println("\nArea de X é maior");
                } else if (areaX<areaY){
                        System.out.println("\nArea de Y maior");
                } else {
                        System.out.println("\nAreas iguais");
                }
            }
            else 
            {
                System.out.println("Um deles não é um triângulo!");
            }
*/
            compArea(areaX,areaY);

    }
}
