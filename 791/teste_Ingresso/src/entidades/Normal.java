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
public class Normal extends Ingresso {
    

    public Normal() {
    }

    public Normal(double valor) {
        super(valor);
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

  
    @Override
    public void ImprimeValor(){
        super.toString();
        System.out.println("Ingresso NORMAL\n VALOR:: "+String.format("%.2f",getValor())+" €");
    }
}
