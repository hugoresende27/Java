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
//se a ContaPoupanca fosse final não podia extends ContaPoupancaFinal, não
//podia herdar 
//final tbm pode ser utilizado para não deixar q um metodo seja override
//public final class ContaPoupanca extends Conta {
public class ContaPoupancaFinal extends ContaPoupanca {
    
    public ContaPoupancaFinal(double taxaJuro, int numConta, String titular, double saldo) {
        super(taxaJuro, numConta, titular, saldo);
    }
    
}
