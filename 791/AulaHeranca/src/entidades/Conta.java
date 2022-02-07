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
public class Conta {
    
    private int numConta;
    private String titular;
    protected double saldo;

    ///////////////// CONSTRUTOR PADRÃO ///////////////
    public Conta() {
    }
    
    
    ///////// CONSTRUTOR COM ARGUMENTOS ///////////////
    public Conta(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //////////////////// GETTERS //////////////////////
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }
    
    //////////////////// SETTERS //////////////////////
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

  
    ///////////// LEVANTAMENTOS //////////////
    public void levantamentos (double quantia){
        this.saldo -= quantia;
    }
    
     ///////////// DEPOSITO //////////////
    public void depositos (double quantia){
        this.saldo += quantia;
    }
    
    @Override
     ///////////// TO STRING //////////////////
    public String toString(){
        return "Nome:: "+getTitular()
                +"\nNumConta:: "+getNumConta()
                +" \nSaldo:: "+String.format("%.2f",getSaldo())+" €";
    }
    
}
