package snake;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Ola Hugo");
        System.out.print("Adoro Alface\n");
    /////////////// TROCAR 2 VARIÁVEIS////////////////////////////
        String x = "água";
        String y = "vinho";
        String temp="";

        temp = y;
        y = x;
        x = temp;

        System.out.println(x);
        System.out.println(y);
    /////////////// INPUT SCANNER ////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        //System.out.print("NOME-->");
        //String nome = scanner.nextLine();
        //System.out.println("O teu nome é --> "+nome);
    /////////////// EXPRESSÕES ////////////////////////////////
        double amigos = 10;
        amigos = (double) amigos / 3 ; //trunca a 3 como int
        amigos++;
        System.out.println("expressões :: "+amigos);

    }
}
