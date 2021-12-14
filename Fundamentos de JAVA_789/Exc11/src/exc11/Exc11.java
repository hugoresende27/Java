/*
Desenvolva um programa que permita determinar em que estação do ano se encontra de acordo com o mês
identificado pelo utilizador:
1, 2 e 3 – Inverno
4, 5 e 6 – Primavera
7, 8 e 9 – Verão
10, 11 e 12 - Outono

 */
package exc11;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc11 {
    
    static void numMes(int n){
        switch (n){
                case 1:
                case 2:
                case 3:
                    System.out.println("INVERNO");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("PRIMAVERA");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("VERÂO");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("OUTONO");
                    break;
                case 99:
                    System.exit(0);
                default :
                    System.out.println("Mês inválido!");
                    break;
            }
    }
    
    static void nomeMes(String n){
        switch (n){
                case "janeiro":
                case "fevereiro":
                case "marco":
                    System.out.println("INVERNO");
                    break;
                case "abril":
                case "maio":
                case "junho":
                    System.out.println("PRIMAVERA");
                    break;
                case "julho":
                case "agosto":
                case "setembro":
                    System.out.println("VERÂO");
                    break;
                case "outubro":
                case "novembro":
                case "dezembro":
                    System.out.println("OUTONO");
                    break;
                default :
                    System.out.println("Mês inválido!");
                    break;
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int mes;
        /*
        do{
            System.out.print("Qual o mes(99 para sair)--> ");
            mes = input.nextInt();
            numMes(mes);
        }while (true);
        */
        String mesB = "";
        System.out.println("Qual o mês? --> ");
        mesB = input.nextLine().toLowerCase();
        nomeMes(mesB);
        
        
    
}
}
