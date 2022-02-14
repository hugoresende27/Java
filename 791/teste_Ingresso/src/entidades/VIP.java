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
public class VIP extends Ingresso{
    protected double novoValor;

    public VIP() {
    }
    
    public VIP(double valor, double novoValor) {
        super(valor);
        this.novoValor = novoValor + valor;
    }

    public double getNovoValor() {
        return this.valor = this.novoValor;
    }

    public void setNovoValor(double novoValor) {
        this.valor = this.novoValor ;
    }
    
  
}
