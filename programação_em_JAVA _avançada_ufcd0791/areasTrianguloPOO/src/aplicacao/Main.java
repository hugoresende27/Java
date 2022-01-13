package aplicacao;

import java.util.Scanner;

public class Main {
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

        System.out.printf("Perimetro X: %.2f Area X: %.2f\nPerimetro Y: %.2f Area Y: %.2f", perimetroX,areaX,perimetroY,areaY);


    }
}
