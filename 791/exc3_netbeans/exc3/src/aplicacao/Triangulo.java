/*
Resolver agora o exercício usando uma classe com 
três atributos para representar melhor o Triângulo 
• Triângulo é uma entidade com três atributos: a, b, c. 
• No exercício anterior usamos três variáveis distintas para representar 
cada triângulo: 
• Para melhorar isto, vamos usar uma CLASSE para representar um 
triângulo
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
