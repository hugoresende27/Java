/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio7;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */



class AreaCirculo{
    public float areaCirc (float r){
        return  (float)(Math.PI * Math.pow(r,2));
    }
}
class Multiplicacao{
    public int mults(int x,int y){
        return x*y;
    }
}
class Conversor{
    public float convs(float kms){
        return kms*1000;
    }
}
class Corpo{
    public float imc(float peso,float altura){
        return (float)(peso/(Math.pow(altura,2)));
    }
}
class Fores{
    public void zeroAdez(){
        for (int i=0; i<=10; i++){
            System.out.printf("%d | ",i);
        }
    }
    public void dezAzero(){
        for (int i=10; i>=0; i--){
            System.out.printf("%d | ",i);
        }
    }

}
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaCirculo exc1 = new AreaCirculo();
        Multiplicacao exc2 = new Multiplicacao();
        Conversor exc3 = new Conversor();
        Corpo exc4 = new Corpo();
        Fores exc56 = new Fores();

        int op;//var opcao para a escolha

        do {
            System.out.println("\n**********MENU**********");       //menu dentro de um ciclo do while,
            System.out.println("* 1 -> Area Circulo    *");         //termina quando op == 7
            System.out.println("* 2 -> Multiplicação   *");
            System.out.println("* 3 -> Km's-Metros     *");
            System.out.println("* 4 -> Massa Corporal  *");
            System.out.println("* 5 -> FOR  0 a 10     *");
            System.out.println("* 6 -> FOR 10 a 0      *");
            System.out.println("* 7 -> SAIR            *");
            System.out.println("************************");
            System.out.print("Escolha o exercicio --> ");
            op = input.nextInt();//leitura da opcao
            switch (op) {
                case 1:
                    System.out.print("Qual o raio do triângulo? --> ");
                    float raio = input.nextFloat();//var raio declarada
                    System.out.printf("Um triângulo de raio %.2f vai ter %.2f de área", raio, exc1.areaCirc(raio));//vou usar o objeto exc1 com o metodo areaCirc(parametro raio)
                    break;

                case 2:
                    System.out.print("Qual o algarismo A? --> ");
                    int a = input.nextInt();//var algarismo A
                    System.out.print("Qual o algarismo B? --> ");
                    int b = input.nextInt();//var algarismo B
                    System.out.printf("%d X %d = %d", a, b, exc2.mults(a, b));//objeto exc2 função mults
                    break;

                case 3:
                    System.out.print("Quantos Km's ? --> ");
                    float k = input.nextFloat();//var de input kilometros
                    System.out.printf("%.2f Km's = %.2f Metros", k, exc3.convs(k));//obj exc3 função convs
                    break;

                case 4:
                    System.out.print("Peso --> ");
                    float peso = input.nextFloat();//var peso
                    System.out.print("Altura --> ");
                    float altura = input.nextFloat();//var altura
                    System.out.printf("O seu IMC é de %.2f", exc4.imc(peso, altura));//objeto exc4, funcao imc
                    break;

                case 5:
                    exc56.zeroAdez();       //objeto 56 vai ter os dois ciclos for, zeroAdez e dezAzero
                    break;

                case 6:
                    exc56.dezAzero();
                    break;

            }
        } while (op != 7);//para interromper o do while, se op == 7
    }
}
