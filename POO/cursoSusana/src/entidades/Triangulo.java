package entidades;

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
