/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Hugo
 */
public class PessoaNor extends Cliente {//classe pai Cliente, subclasse PessoaNor e ClienteVip
    
    private String nif;
    
            
    public PessoaNor(String nome,String endereco,String nif){
        super(nome,endereco);//super para herdar da classe Cliente nome e endereco
        this.nif=nif;
    }

    public String getNif() {
        return nif;
    }

     public void setNif(String nif) {
        this.nif = nif;
    }
    
    
}
