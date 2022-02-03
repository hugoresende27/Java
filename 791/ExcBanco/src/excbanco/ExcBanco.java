/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://github.com/FlavioRoloff/Conta_Bancaria
 */
package excbanco;

import java.util.Scanner;
import operacoes.Emprestimo;

/**
 *
 * @author Hugo
 */
public class ExcBanco {

    /**
     * @param args the command line arguments
     */
    
     public static void menu(){
        System.out.println("-- PROGRAMA BANCO HR --");
        System.out.println("-- ---------- -- ");
        System.out.println("-- 1.Depositar  -- ");
        System.out.println("-- 2.Levantar -- ");
        System.out.println("-- 3.Consultar -- ");
        System.out.println("-- 4.Empréstimo -- ");
        System.out.println("-- 0.Sair-- ");
    }
     
 
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int numC =  (int)(1+Math.random()*(1000-1));

        Conta c1 = new Conta();
        System.out.println("Qual o seu nome?");
               String nome = input.nextLine();
               System.out.println("Quer fazer um depósito inicial(s/n)?");
               char res = Character.toLowerCase((input.next().charAt(0)));
               if (res == 's'){
                   System.out.println("Qual o montante a depositar? ");
                   double deposito = input.nextDouble();
                   c1 = new Conta(numC,nome,deposito);
                   System.out.println(c1);
               }
                else {
                    c1 = new Conta(numC,nome);
                    System.out.println(c1);
                }
               
               
    do{
        menu();
        System.out.print("opção--> ");
        int op = input.nextInt();
        input.nextLine();//input aqui para não saltar o nextInt() para nextLine()
        switch (op){

            case 1:
                System.out.println("Valor a depositar?");
                double depos = input.nextDouble();
                c1.deposito(depos);
                System.out.println(c1);
                break;
            case 2:
                System.out.println("Valor a levantar?");
                double levan = input.nextDouble();
                if (levan > c1.getSaldo()) System.out.println("Montante não autorizado");
                else c1.levantamento(levan);
                System.out.println(c1);
                break;
            case 3:
                System.out.println(c1);
                break;
            case 4:
                Emprestimo e1 = new Emprestimo();
                e1.pedido(c1);
                break;
            case 0:
                System.out.println("Adeus\n");
                System.exit(0);
            default:
                System.out.println("Inválido\n");
                break;
               
        }
    }while (true);
        
   
    }
    
}
