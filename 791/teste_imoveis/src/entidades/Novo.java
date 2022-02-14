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
public class Novo extends Imovel {
    
    protected double taxa = 0.05;

    public Novo() {
    }

    public Novo(double preco, String endereco, double taxa) {
        super(preco, endereco);
        this.taxa=taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public double getPrecoFinal(){
        return this.preco + (this.preco*this.taxa);
    }
       

      
    ////////////////////////////////// TO STRING //////////////////
    @Override
    public String toString(){
         return 
                super.toString()
                +"\nIMÓVEL NOVO \nPreço FINAL:: "+String.format("%.2f",getPrecoFinal())+" €";
                
    }
    
   
}
