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
    
     String nome ="";
     double preco =0;
     int qtd = 0;
    /*METODO CONSTRUTOR NÃO USADO
    Produto(String n, double pr, int qt){
        this.nome = n;
        this.preco = pr;
        this.qtd = qt;  
    }
*/
    public double totalStock(){
        return this.preco*this.qtd;
    }
    
    public  void adicionarProduto(int q){
        this.qtd += q;
    }
    
    public  void retirarProduto(int q){
            this.qtd -= q;
    }
    
    public String toString(){
        return "Nome:: "+this.nome+"\nPreco:: "+String.format("%.2f", this.preco)+" €\nQuantidade:: "+this.qtd+"\nTotal Stock:: "+String.format("%.2f", this.preco*this.qtd)+ " €";
    }

}
