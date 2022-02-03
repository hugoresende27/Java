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
public class Produto {

  
    
    ///atributos
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
    //construtor
     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    
    ////metodos
    
}
