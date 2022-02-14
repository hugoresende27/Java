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
public class CamaroteSuperior extends VIP{
    
    protected double taxa ;

    public CamaroteSuperior(double taxa) {
        this.taxa = taxa;
    }

    public CamaroteSuperior(double taxa, double valor, double novoValor) {
        super(valor, novoValor);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public double precoFinal(){
        return this.valor + this.taxa;
    }
     
    @Override
     public void ImprimeValor(){
        System.out.println("PRECO VIP::"+String.format("%.2f",precoFinal())+" €");
        this.setNovoValor(15);      
        System.out.println("Camarote Superior");
        System.out.println("PREÇO FINAL:: "+String.format("%.2f",precoFinal())+" €");
    }
    
}
