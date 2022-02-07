/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

/**
 *
 * @author Hugo
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Conta contaPessoal = new Conta(1001,"Hugo Resende",0);
        ContaEmpresa cntEmpresa = new ContaEmpresa(10000,2001,"HR Software",0);
       
        System.out.println(cntEmpresa);
        //System.out.println(cntEmpresa.getSaldo());
        
        /////////// UPCASTING ////////////////
        Conta c1 = cntEmpresa;
        Conta c2 = new ContaEmpresa(500,2002,"JavaEmpresa",600);
        Conta c3 = new ContaPoupanca(10,3001,"Rita",20);
        contaPessoal = cntEmpresa;
        
        
        /////////// DOWNCASTING ///////////////////
        ContaEmpresa c4 = (ContaEmpresa) c2;
       
        c4.emprestimo(100);
         
        System.out.println(c4);
        
        ContaEmpresa c5 =  (ContaEmpresa) c3;
        
        c5.levantamentos(5);
        System.out.println(c5);
           
    }
    
}
