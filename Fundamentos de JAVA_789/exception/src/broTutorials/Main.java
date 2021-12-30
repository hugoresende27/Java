package broTutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 “an event that occurs during the execution of a program that disrupts the normal flow of instructions” is called an exception.
 This is generally an unexpected or unwanted event which can occur either at compile-time or run-time in application code.
Java exceptions can be of several types and all exception types are organized in a fundamental hierarchy.

1.try { }
2.catch (Exception e) {}
3.finally { close(); }
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.print("NUM1--->");
            int x = input.nextInt();
            System.out.print("NUM2--->");
            int y = input.nextInt();

            int z = x/y;

            System.out.println("Resultado "+z);
        }
        catch (ArithmeticException e) {
            System.out.println("Não pode dividir por zero!");
        }
        catch (InputMismatchException e){
            System.out.println("Insira um número!");
        }
        catch (Exception e) {       //posso usar Exception para o geral, mas não é boa pratica
            System.out.println("Algo correu mal");
        }
        finally {           //finally para close do scanner e sout vai imprimir sempre
            input.close();
            System.out.println("Programa terminado com sucesso");
        }


    }
}
