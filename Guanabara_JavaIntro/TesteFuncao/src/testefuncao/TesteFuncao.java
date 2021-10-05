/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author Hugo
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    static void soma (int a, int b)         //metodo sem retorno, void, e estático
    {
        int r=a+b;
        System.out.println("a soma é ::" + r);
    }
    
    static int soma2 (int a, int b)     //metodo com retorno int(r), estático
    {
        int r=a+b;
        return r;
    }
    
    public static void main(String[] args) {        //nao posso chamar metodos não estáticos
        // TODO code application logic here         //dentro de metodo main q é estático
        System.out.println("Começou o programa");
        soma(5,7);
        int sm = soma2(5,7);
        System.out.println("Soma 2 vale ::"+ sm);
        
    }
    
}
