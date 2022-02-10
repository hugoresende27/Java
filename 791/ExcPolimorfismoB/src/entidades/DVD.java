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
public class DVD extends Midia {
    
    protected int faixas ;
    
    public DVD(){
        
    }
    
    public DVD(int codigo, double preco, String nome, int f) {
        super(codigo, preco, nome);
        this.faixas = f;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
    
    @Override
      public void InserirDados(){
        super.InserirDados();
        input.nextLine();
        System.out.print("Faixas-->");
        int fx = input.nextInt();
        this.setFaixas(fx);
    }
      
  
    
}
