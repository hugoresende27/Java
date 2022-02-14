/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Imovel {
    Scanner input = new Scanner(System.in);
         
    protected double preco;
    protected String endereco;
    
    
    public Imovel(){
        
    }

    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void InserirDados(){
    System.out.print("Endereço-->");
    String adr = input.nextLine();
    this.setEndereco(adr);
  
    System.out.print("Preço-->");
    double p = input.nextDouble();
    this.setPreco(p);   
    }
    
                 ///////////// TO STRING //////////////////
    
    @Override
    public String toString(){
         return 
                "\nEndereço:: "+getEndereco()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                ;
    }
}
