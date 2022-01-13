package broTutorials;

/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
 Em seguida, vamos mostrar no ecrã o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a área maior.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados (a, b e c) é a seguinte (fórmula de Heron):
 */


import entidades.Triangulo;

import java.util.Scanner;

public class ProgramaPrincipal {

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

            if (x.area() > y.area()){
                    System.out.println("\nArea de X é maior");
            } else if (x.area()<y.area()){
                    System.out.println("\nArea de Y maior");
            } else {
                    System.out.println("\nAreas iguais");
            }




            /*
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

            if (areaX > areaY){
                    System.out.println("\nArea de X é maior");
            } else if (areaX<areaY){
                    System.out.println("\nArea de Y maior");
            } else {
                    System.out.println("\nAreas iguais");
            }

*/


        }
    }

