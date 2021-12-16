/*
Usando  Switch… case
Desenvolva um programa que:
Pergunte em que turno estuda. Peça para digitar:
 M – Matutino
 V- Vespertino
 N – Noturno
Imprima a mensagem “Bom dia”, “Boa tarde” ou “Boa noite” Conforme o caso.

 */
package exc14_b;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc14_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o turno ( M | V | N ) --> ");
        char turno = Character.toLowerCase((input.next().charAt(0)));
        switch (turno){
            case 'm':
                System.out.println("Bom dia");
                break;
            case 'v':
                System.out.println("Boa tarde");
                break;
            case 'n':
                System.out.println("Boa Noite");
                break;
            default:
                System.out.println("ERRO");
                break;
        }
    }
    
}
