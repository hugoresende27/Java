/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import excbanco.Conta;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Emprestimo {
    
    Scanner input = new Scanner(System.in);
    
    public void pedido(Conta c){
        
        System.out.println("Quanto é o empréstimo? ");
        double valor = input.nextDouble();
        c.deposito(valor);
        System.out.println("Emprestimo concedido");
    }
}
