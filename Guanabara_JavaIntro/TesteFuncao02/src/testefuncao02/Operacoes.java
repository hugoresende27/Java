/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author Hugo
 * 
 */

public class Operacoes {
                                                      //publico e estático
    public static String contador(int i, int f)       //metodo com retorno string, var locais i e f
    {
     String s = "";                 //string s vazia
     for (int c=0; c<= f ; c++)     //ciclo para percorrer string
     {
         s += c+ " ";       //s recebe a string + c e espaço 
     }
     return s;      //retorna string //funcao dá um print do incio ao fim dos parametros i e f
    }
    
}
