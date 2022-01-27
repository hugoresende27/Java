/*
Java main() method is always static, so that compiler can call it without 
the creation of an object or before the creation of an object of the class. 
In any Java program, the main() method is the starting point from where compiler 
starts program execution.

Static methods are the methods in Java that can be called without creating an 
object of class. They are referenced by the class name itself or reference to the Object of that class.  

Static para usar classes, metodos sem instanciar o objeto

 */
package exccalculadora;
import entidades.Calculador;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //Calculator c1 = new Calculator();
        System.out.println("Valor do raio?");
        double raio = input.nextDouble();
        
        double c = Calculador.circunferencia(raio);
        double v = Calculador.volume(raio);
        
        System.out.printf("Circunferência = %.2f\nVolume = %.2f\n", c,v);
        System.out.println("PI:: "+ Calculador.PI);
    }
    
}
