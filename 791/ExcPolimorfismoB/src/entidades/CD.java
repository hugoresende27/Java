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
public class CD extends Midia {
    
    protected int musicas ;
    
    public CD(){
        
    }
    
    public CD(int codigo, double preco, String nome, int m) {
        super(codigo, preco, nome);
        this.musicas = m;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }

    public int getMusicas() {
        return musicas;
    }
    
    @Override
      public void InserirDados(){
         super.InserirDados();
        input.nextLine();;
        System.out.print("Musicas-->");
        int fx = input.nextInt();
        this.setMusicas(fx);
    }
      
                   ///////////// TO STRING //////////////////
    @Override
    public String toString(){
         return 
                "\nNome:: "+getNome()
                +" \nPreço:: "+String.format("%.2f",getPreco())+" €"
                +"\nCódigo:: "+getCodigo()
                +"\nCD \nMusicas:: "+getMusicas()+"\n--------------";
    }
    
}
