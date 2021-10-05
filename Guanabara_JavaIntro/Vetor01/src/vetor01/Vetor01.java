/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[]={3,2,8,7,5,4};  //int[] vetor = new vetor [5];
        //criar vetor é igual a criar um objeto
        System.out.println("Total de casas de  vetor "+ vetor.length);
      /*  for (int c=0; c<=5;c++)
        {
            System.out.println("Na posição "+ c + " temos o valor " + vetor[c] + " ");
        }*/
      
      for (int c=0; c<=vetor.length-1;c++)//vetor.lenght-1, vai até ao ultimo index
      {
          System.out.println("Na posição "+ c + " temos o valor " + vetor[c] + " ");
       
      }
      Scanner teclado = new Scanner(System.in);
      System.out.println("QUAL O ANO?? :: ");
      int ano = teclado.nextInt();
      String mes[]={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
      int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
      System.out.println("ANO DE " + ano);
      for (int i=0;i<mes.length;i++)
      {
          if ((ano%4==0) || (ano%400==0 && ano%100!=0))
          {
              tot[1]=29;
          } 
        
          System.out.println(mes[i] +" tem um total de "+ tot[i]);
      }
    }
    
    
    
}
