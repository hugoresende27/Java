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
public class Produtos_importados extends Produtos {
        protected double taxa_importacao;

    public Produtos_importados(String nome, String descricao, String categoria, double preco, double taxa) {
        super(nome, descricao, categoria, preco);
        this.taxa_importacao = taxa;
    }
    
    @Override
    public void setPreco(double preco) {
        this.preco += preco*this.taxa_importacao;
    }
    
          ///////////// TO STRING //////////////////
    @Override
    public String toString(){
         return 
                super.toString()
                +"\nPRODUTO IMPORTADO \nNome:: "+getNome()+"\n--------------";
    }
}
