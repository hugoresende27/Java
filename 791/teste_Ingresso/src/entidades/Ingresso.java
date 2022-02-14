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
public class Ingresso {
    protected double valor;
    
    public Ingresso(){
        
    }

    public Ingresso (double valor){
        this.valor = valor;
    }
     
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void ImprimeValor(){
        System.out.println("INGRESSOS::"+this.getValor());
    }
   
}
