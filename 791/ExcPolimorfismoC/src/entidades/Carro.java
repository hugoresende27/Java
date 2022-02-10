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
public class Carro extends Veiculos {
    
    Scanner input = new Scanner (System.in);
    
    protected double kms;
    
    public Carro(){
        
    } 
    public Carro(String modelo, double preco, double kms) {
        super(modelo, preco);
        this.kms = kms;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }
    
    
    @Override
    public void InserirDados(){
      super.InserirDados();
      System.out.print("Kms-->");
      double k = input.nextDouble();
      this.setKms(k);
  }
    
      ///////////// TO STRING //////////////////
    
    @Override
    public String toString(){
         return 
                "\nModelo:: "+getModelo()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                +"\nKms:: "+getKms()
                +"\nCARRO\n--------------";
    }
}
