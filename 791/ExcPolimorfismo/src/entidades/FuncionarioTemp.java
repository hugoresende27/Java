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
public class FuncionarioTemp extends Funcionario {
    
    private double taxaExtra;

    public FuncionarioTemp(String nome, int horas, double valorHora, double taxaExtra) {
        super(nome, horas, valorHora);
        this.taxaExtra = taxaExtra;
    }

    public double getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(double taxaExtra) {
        this.taxaExtra = taxaExtra;
    }
    
    @Override
    public double salario()
    {
        return super.salario() + (taxaExtra * 1.1);
    }
    
       ///////////// TO STRING //////////////////
    @Override
    public String toString(){
        return "Nome:: "+getNome()
                +"\nHoras:: "+getHoras()
                +"\nTaxa :: "+getTaxaExtra()
                +" \nSalário:: "+String.format("%.2f",salario())+" €";
    }
}
