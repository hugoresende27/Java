/*
Use a classe projetada abaixo.
Funcionario
nome: String
salarioBruto: double
Percentagem: double
salarioLiquido:double
aumentarSalario(percentagem: double): void
 */
package excsalario;

/**
 *
 * @author Hugo
 */
public class Funcionario {
    
    
    private String nome;
    private double salBruto;
    private double taxa;
    private double salLiq;
    private double percentagem;
    private double salAumento;

    ///CONSTRUTOR
    public Funcionario() {
    }

    
    //SETTERS
    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Funcionario setSalBruto(double salBruto) {
        this.salBruto = salBruto;
        return this;
    }

    public Funcionario setTaxa(double taxa) {
        this.taxa = taxa;
        return this;
    }

    public Double setSalLiq() {
        
        this.salLiq = this.salBruto - (this.salBruto * (this.taxa/100));
        return this.salLiq;
    }
    
    public Funcionario setPercentagem(double perce) {
        this.percentagem = perce;
        return this;
    }
    
    //GETTER PARA AUMENTO
    public double getAumento() {
        return this.salAumento;
    }
    
    
    //AUMENTO
    public void aumento() {
        this.salAumento = this.salLiq + (this.salLiq * (this.percentagem/100));   
    }
    

    //TO STRING
    public String toString(){
        return "Nome:: "+this.nome+"\n\tSal liquido:: "+String.format("%.2f", setSalLiq())+" €\n\tImposto:: "+String.format("%.1f",this.taxa)+"%\n\tSal Bruto:: "+String.format("%.2f", this.salBruto)+ " €";
    }
}
