/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Hugo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String ("Gustavo");//diferente porque instaciado com new
        String res;
        res = (n1.equals(n2))? "igual":"diferente";//em vez de n1==n3 metodo equals()
        System.out.println(res);                   //serve para classes involucro
    }
    
}
