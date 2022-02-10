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
public class Midia {
    
    Scanner input = new Scanner(System.in);
    
    
    protected int codigo;
    protected double preco;
    protected String nome;
    
    public Midia(){
        
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void InserirDados(){
        System.out.print("Código-->");
        int c = input.nextInt();
        this.setCodigo(c);
        System.out.print("Preço-->");
        double p = input.nextDouble();
        this.setPreco(p);
        System.out.print("Nome-->");
        String n = input.nextLine();
        this.setNome(n);
        
    }
    
                 ///////////// TO STRING //////////////////
    @Override
    public String toString(){
         return 
                "\nNome:: "+getNome()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                +"\nCódigo:: "+getCodigo()
                ;
    }
}
