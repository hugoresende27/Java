/*
Classe Produto (nome,preco,quantidade)
Metodos (totalStock():double ; 
        adicionarProduto(qtd):void ; 
        removerProdutos(qtd):void
 */
package excstocks;

/**
 *
 * @author Hugo
 */
public class Produto {
    
    private String nome ="TESTE";
    private double preco =0;
    private int qtd = 0;
    
    //*CONSTRUTOR*////////
    ///////*METODO CONSTRUTOR sem parametros*/
     Produto (){
         
     }
     ///////////*METODO CONSTRUTOR EM OVERLOADING (SOBRECARGA)*/
    Produto(String n, double pr, int qt){
        this.nome = n;
        this.preco = pr;
        this.qtd = qt;  
    }
    
    ///////////// SETTERS /////////////////
    public void setNome(String n){
         this.nome=n;
     }
    public void setPreco(double p){
         this.preco=p;
     }
    public void setQtd(int q){
         this.qtd=q;
     }
    
    ///////////// GETTERS /////////////////
    public String getNome(){
        return nome;
    }
    
    public int getQtd(){
        return qtd;
    }
     
     public double getPreco(){
        return preco;
    }
     
 

    public double totalStock(){
        return preco*qtd;
    }
    
    public  void adicionarProduto(int q){
        qtd += q;
    }
    
    public  void retirarProduto(int q){
        qtd -= q;
    }
    
    public String toString(){
        return "Nome:: "+getNome()+"\nPreco:: "+String.format("%.2f", getPreco())+" €\nQuantidade:: "+getQtd()+"\nTotal Stock:: "+String.format("%.2f", getPreco()*getQtd())+ " €";
    }

}
