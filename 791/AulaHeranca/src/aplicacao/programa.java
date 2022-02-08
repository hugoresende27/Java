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
      
        
        Conta conta = new Conta(1001,"Hugo Resende",0);
        ContaEmpresa cntEmpresa = new ContaEmpresa(10000,2001,"HR Software",0);
       
        //System.out.println(cntEmpresa);
        //System.out.println(cntEmpresa.getSaldo());
        
        /////////// UPCASTING subclasse passa a superclasse////////////////
        /**
    Upcasting é fazer um objeto se passar por um objeto que seja um supertipo dele. 
* Ele sempre funcionará já que todo objeto é completamente compatível com um tipo 
* do qual ele foi derivado. Como sempre pode ser realizado, é possível fazer 
* implicitamente, ou seja, o compilador faz por você quando for necessário.

É muito comum ele ocorrer como parâmetro de um método que usará polimorfismo. 
* O chamador manda como argumento um objeto que é o subtipo, o método recebe um 
* parâmetro como se fosse o supertipo, mas funciona como um subtipo. Mas note 
* que o polimorfismo é um mecanismo auxiliar e não ligado diretamente ao casting.
* É considerado uma coerção em tempo de compilação.



         */
        Conta c1 = cntEmpresa;
        Conta c2 = new ContaEmpresa(500,2002,"JavaEmpresa",600);
        Conta c3 = new ContaPoupanca(0.10,3001,"Rita",0);
        conta = cntEmpresa;//upcasting aqui permitido normalmente sem cast
        
        
        /////////// DOWNCASTING ///////////////////
        /*
        Downcasting é quando o objeto se passa como se fosse um subtipo dele. 
* Não há garantias que funcione (pode lançar uma ClassCastException, o que 
* obviamente é um erro de programação) e pode haver necessidade de conversões.
* O compilador só aceita se ele puder provar que o objeto se encaixará 
* perfeitamente e seja de fato aquele objeto. Por isso deve ser explicitado pelo
* programador quando deseja essa ação. A coerção ocorre em tempo de execução.
        */
        ContaEmpresa c4 = (ContaEmpresa) c2;
       
        c4.emprestimo(100);
         
        //System.out.println(c4);
        
        //se c3 for instanciado como ContaEmpresa
        if (c3 instanceof ContaEmpresa){
            ContaEmpresa c5 = (ContaEmpresa)c3;
            c5.emprestimo(100);
            System.out.println("conta empresa\n"+c5);
        }
        
        if (c3 instanceof ContaPoupanca){
            ContaPoupanca c5 = (ContaPoupanca)c3;
            c5.depositos(500);
            c5.atualizaSaldo();
            System.out.println("conta poupança\n"+c5);
            c5.levantamentos(1000);
            System.out.println("conta poupança\n"+c5);
        }
        
        Conta c6 = new Conta(2002,"Maria",1000);
        c6.levantamentos(900);
        System.out.println("MARIA::\n"+c6);
        
        Conta c7 = new ContaPoupanca(0.01,3002,"Telma",1000);
        c7.levantamentos(900);
        System.out.println("TELMA::\n"+c7);
        
        Conta c8 = new Conta(2002,"Eisnt",1000);
        c8.levantamentos(900);
        System.out.println(c8);
        
        Conta c9 = new ContaEmpresa(0.01,3002,"UPS",1000);
        c9.levantamentos(900);
        System.out.println(c9);
        
        
        ////////////////POLIFMORFISMO/////////////
        Conta x = new Conta(1001,"Alex",500);
        Conta y = new ContaPoupanca(0.02,2001,"Alex2",500);
        x.levantamentos(50);
        y.levantamentos(50);
        System.out.println(x);
        System.out.println(y);
           
    }
    
}
