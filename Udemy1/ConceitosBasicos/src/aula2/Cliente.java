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


public class Cliente {
    
    
    private String nome;
    private String endereco;
    
    public Cliente (String nome, String endereco)
    {
    this.nome=nome;
    this.endereco=endereco;
    }
    

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    
 
    

}
