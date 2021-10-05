/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author Hugo
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new  Fatorial();       //criar um objeto f, novo objeto com metodos da classe Fatorial
        f.setValor(5);                      //metodo setValor com parametro 5 no objeto f
        System.out.print(f.getFormula());   //print da formula, recurso a metodo getFormula aplicado no objeto f
        System.out.println(f.getFatorial());//print do fatorial, f.getFatorial
    }
    
}
