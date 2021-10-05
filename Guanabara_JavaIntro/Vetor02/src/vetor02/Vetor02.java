/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author Hugo
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double num[]={3.5   ,  5.75  ,  -1  ,  -0.8  ,  4};
    Arrays.sort(num);               //ordena o vetor
    for (double valor:num)         //igual a um foreach
    {
        System.out.println("valor é :: "+ valor);
    }
    int vet []= {3,7,6,1,9,4,2};
    int p = Arrays.binarySearch(vet,0);  //procurar em arrays, o valor 1, binarySearcj
    System.out.println("Encontrei o valor 1 na posição :: "+p);
    
    int num2[]=new int [20];
    Arrays.fill(num2,0);        //preencher auto o vetor num2 com 0 em todos
    for (int valor:num2)        //os index.
    {
        System.out.print(valor+" ");
    }
    
    String s = "CURSOEMVIDEO";
    char r[]=new char [12];
    System.out.println("\n");
    for (int c=s.length()-1;c>=0;c-- )      //pegadinha, mostra o vetor 
    {                                   //na sua ordem correcta, para cada index
        r[c]=s.charAt(c);       //-11 onde começa, o vetor r[] recebe a char da string
    }                           //correspondente
    for (char l:r)
    {
        System.out.print(l);
    }
    }
    
   
    
}
