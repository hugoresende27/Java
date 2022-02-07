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
public class ContaPoupanca extends Conta {
    private double taxaJuro;

    public ContaPoupanca(double taxaJuro, int numConta, String titular, double saldo) {
        super(numConta, titular, saldo);
        this.taxaJuro = taxaJuro;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }
    
    public void atualizaSaldo(){
        this.saldo += this.saldo * getTaxaJuro();
    }
}
