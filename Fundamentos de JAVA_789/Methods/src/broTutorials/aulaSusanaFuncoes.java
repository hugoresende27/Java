package broTutorials;

import java.util.Scanner;

public class aulaSusanaFuncoes {

    static int soma(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        System.out.println("NUM1-> ");
        a = input.nextInt();
        System.out.println("NUM2-> ");
        b = input.nextInt();
        System.out.println("NUM3-> ");
        c = input.nextInt();

        System.out.println("Soma:: "+soma(a,b,c));
    }
}
