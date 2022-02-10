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
public class Veiculos {
    Scanner input = new Scanner(System.in);
    
    protected String modelo;
    protected double preco;
    
    public Veiculos(){
        
    }

    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void InserirDados(){
      System.out.print("Modelo-->");
      String m = input.nextLine();
      this.setModelo(m);
      System.out.print("Preço-->");
      double p = input.nextDouble();
      this.setPreco(p);
  }

}
