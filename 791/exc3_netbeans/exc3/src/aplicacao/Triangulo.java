/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author Hugo
 */
public class Triangulo {
    public double a,b,c;

    public double area(){

        double p = (a+b+c)/2;
        double res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return res;

    }

    public double somarLados(){
        return a+b+c;
    }

    public void perimetro(){
        System.out.println("\nPERIMETRO :: "+ (a+b+c)/2);
    }
}
