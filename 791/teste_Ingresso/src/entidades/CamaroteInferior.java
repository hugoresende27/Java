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
public class CamaroteInferior extends VIP{
    
    protected String local;

    public CamaroteInferior(String local) {
        this.local = local;
    }

    public CamaroteInferior(String local, double valor, double novoValor) {
        super(valor, novoValor);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
     public void ImprimeValor(){
        
        System.out.println("Camarote Inferior");
        System.out.println("PRECO sem ser VIP::"+String.format("%.2f",getValor())+" €");
        this.setNovoValor(15);
        
        System.out.println("PREÇO FINAL VIP:: "+String.format("%.2f",getValor())+" €");
        System.out.println("LOCAL:: "+getLocal());
    }
}
