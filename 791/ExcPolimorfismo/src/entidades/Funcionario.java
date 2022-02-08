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
public class Funcionario {
    private String nome;
    private int horas;
    private double valorHora;

    public Funcionario(String nome, int horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double salario()
    {
        return horas*valorHora;
    }
    
      ///////////// TO STRING //////////////////
    @Override
    public String toString(){
        return "Nome:: "+getNome()
                +"\nHoras:: "+getHoras()
                +" \nSalário:: "+String.format("%.2f",salario())+" €";
    }
}
