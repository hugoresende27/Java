package broTutorials;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("IDADE-> ");
        int age = input.nextInt();

        try{
            checkAge(age);
        }
        catch (Exception e){
            System.out.println("Ocorreu um ERRO: "+e);
        }


        System.out.println("***EXPERIENCIA***");
        System.out.println("*** 1.ROOKIE  ***");
        System.out.println("*** 2.PRO     ***");
        System.out.println("*** 3.WORLD   ***");
        System.out.println("*****************");

        int xp = input.nextInt();
        try {
            checkXP(xp);
        } catch (Exception e){
            System.out.println("ERROR "+e);
        }




    }

    static void checkAge (int a) throws AgeExeption{

        if (a<18){
            throw new AgeExeption("\n"+"Minimo 18 anos");
        } else {
            System.out.println("Registado");
        }
    }

    static void checkXP (int x) throws XPExeption{

        switch (x){
            case 1:
                System.out.println("NIVEL 1");
                break;
            case 2:
                System.out.println("NIVEL 2");
                break;
            case 3:
                System.out.println("NIVEL 3");
                break;
            default:
                throw new XPExeption("NOT VALID");
        }
    }
}
