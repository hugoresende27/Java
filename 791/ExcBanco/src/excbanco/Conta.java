/*
Num banco, para cadastrar uma conta bancária, é necessário informar o número da 
conta, o nome do titular da conta, e o valor de depósito inicial que o titular 
depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, 
ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, 
o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca 
poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa 
pode mudar de nome por casamento, por exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um 
mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só 
diminui por meio de levantamentos. Para cada levantamento realizado, o banco 
cobra uma taxa de € 5.00. 
Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para 
realizar o levantamento e/ou pagar a taxa.
Deve fazer um programa que realize o cadastro de uma conta, dando opção para 
que seja ou não informado o valor de depósito inicial. Em seguida, realizar um 
depósito e depois um levantamento, sempre mostrando os dados da conta após cada operação

 */
package excbanco;

/**
 *
 * @author Hugo
 */
public class Conta {
    
    
    private String nomeTitular;
    private double saldo=0;
    
    
    Conta (int num,String nome){
        this.numConta = num;
        this.nomeTitular = nome;    
    }
    
    Conta (int num,String nome,double depInicial){
        this.numConta = num;
        this.nomeTitular = nome;
        this.saldo = depInicial;
    }
    
   
    
    public void setNome(String nom){
        this.nomeTitular = nom;
    }
    
    public void setSaldo(double s){
        this.saldo=s;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public String getNome(){
        return this.nomeTitular;
    }
        
    public double getSaldo(){
        return this.saldo;
    }
    
    public String toString(){
        return "Nome:: "+getNome()
                +"\nNumConta:: "+getNumConta()
                +" \nSaldo:: "+String.format("%.2f",getSaldo());
    }
}
