/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Hugo
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=0;
        while (cc<10)
        {
            cc++;
            if (cc==3 || cc==4 || cc==2)
            {
                continue;       //salta o 2 3 e 4 e imprime o resto
            }
            else if (cc==7)
            {
                break;          //chega ao 7 e pára o laço
            }
            System.out.println("Cambalhota:: "+ cc);//(cc+1));
            
        }
    }
    
}
