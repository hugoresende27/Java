/*
Area=largura*altura
Perimetro= 2*(largura*altura)
Diagonal= raiz quadrada (largura*largura + altura* altura)

 */
package excretangulo;

/**
 *
 * @author Hugo
 */
public class Retangulo {
    
    double largura;
    double altura;
    
    public static double area (double l, double a){
        return l*a;
    }
    
    public static double perimetro (double l, double a){
        return 2*(l+a);
    }
    
    public static double diagonal (double l, double a){
        return Math.sqrt(l*l+a*a);
    }
    
    
    
}
