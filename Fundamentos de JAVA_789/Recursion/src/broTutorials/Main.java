package broTutorials;

import java.util.Scanner;

/*
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is
called recursive method. It makes the code compact but complex to understand. Syntax: ... methodname();//calling same method.
processo em que o metodo se chama a si mesmo continuamente
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////////////
        System.out.println("Quantas vezes?");
        int vezes = input.nextInt();

        HelloWorld(vezes);

        /////////////////////////////////////////////////////////////////////////
        System.out.println("Quantos metros queres andar? ");
        int dist = input.nextInt();
        daUmPasso(0,dist);

        /////////////////////////////////////////////////////////////////////////
        System.out.println("X-> ");
        int a = input.nextInt();
        countRecursive(a);

    }


    static void HelloWorld(int n){

        if (n>0) {  //condição de saida, n=0
            System.out.println("Ola Hugo!:: "+n);
            //n--;
            HelloWorld(n-1); //decremento do n a cada iteração
        }
    }

    static void daUmPasso(int i,int di){
        if (i<di){
            i++;//incrementa um passo
            System.out.println("*deu um passo**"+i+" metros");
            daUmPasso(i,di);
        }
        else {
            System.out.println("Chegou ao seu destino");
        }
    }

    static void countRecursive (int x) {
        if (x > 0) {
            System.out.println("X VALUE -> " + x);
            countRecursive(x - 1);
        } else {
            System.out.println("THE END");
        }
    }
    
}
