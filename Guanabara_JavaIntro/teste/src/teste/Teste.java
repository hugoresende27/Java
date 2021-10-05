/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Hugo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        double z;

        x = 5;
        y = 2;
        z = x / y;
        System.out.println(z);
        double s = Math.pow(8,2);
        System.out.println(s);
        int total = 0;
        int c[] = new int[10];
        for (int i = 0; i<c.length; i++) {
                c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
                total += c[i];
        }
        System.out.println(total);
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println("v0 "+v0+ "v1"+v1+"v2"+v2);
        
    }
    
}
