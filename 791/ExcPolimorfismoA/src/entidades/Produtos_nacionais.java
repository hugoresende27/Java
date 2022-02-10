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
public class Produtos_nacionais extends Produtos {
    
    protected String biologico;
    
    public Produtos_nacionais(String nome, String descricao, String categoria, double preco, String bio) {
        super(nome, descricao, categoria, preco);
        this.biologico = bio;
    }

    public String getBiologico() {
        return biologico;
    }

    
      ///////////// TO STRING //////////////////
    @Override
    public String toString(){
        return 
                super.toString()
                +"\nPRODUTO NACIONAL\nNome:: "+getNome()+"\n--------------\n";
    }
    
}
