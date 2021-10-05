/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Hugo
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);  //converter int para string
        System.out.println(valor);
        
        String valor2="30";
        int idade2 = Integer.parseInt(valor2); //converter de string para int
        System.out.println(idade2);
        
        String valor3= "30.5";
        float idade3 = Float.parseFloat(valor3);//converter de string para float 
        System.out.printf("%.3f\n",idade3);
        
    }
    
}
