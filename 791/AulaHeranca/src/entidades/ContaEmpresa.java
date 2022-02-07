/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Hugo
 */
public class ContaEmpresa extends Conta {
    

    //atributos
    private double limiteEmprestimo;

    public ContaEmpresa() {
        super();
        
    }

    /////// CONSTRUTOR ///////////////////////////////////
    public ContaEmpresa(double limiteEmprestimo, int numConta, String titular, double saldo) {
        super(numConta, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }


    ///////////////// GETTER E SETTER //////////////////
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    //////////// METODO EMPRESTIMO /////////////
    public void emprestimo(double quantia){
        if (quantia <= limiteEmprestimo){
             depositos(quantia);
             this.saldo += quantia-5;
        }
      
    }
    
    
    
}
