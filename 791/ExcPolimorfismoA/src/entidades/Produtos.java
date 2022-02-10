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
public class Produtos {
    protected String nome;
    protected String descricao;
    protected String categoria;
    protected double preco;

    public Produtos(String nome, String descricao, String categoria, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    ///////////// TO STRING //////////////////
    @Override
    public String toString(){
         return 
                "\nDescriçao:: "+getDescricao()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                +"\nCategoria:: "+getCategoria()
               ;
    }
}
