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
public class Moto extends Veiculos {
    
    Scanner input = new Scanner(System.in);
    
    protected int ano;
    
   public Moto(){
       
   }

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



   
    
    
    @Override
    public void InserirDados(){
      super.InserirDados();
      System.out.print("Ano-->");
      int a = input.nextInt();
      this.setAno(a);
  }
    
    ///////////// TO STRING //////////////////
    
    @Override
    public String toString(){
         return 
                "\nModelo:: "+getModelo()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                +"\nAno:: "+getAno()
                +"\nMOTA\n--------------";
    }
}
