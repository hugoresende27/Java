/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Hugo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A media é igual a "+m);
        
        int numero =10;
        int valor = 4 + --numero;// numero--; //
        System.out.println(valor);  
        System.out.println(numero);//
        int teste = 1;
        //teste++;
        //++teste;
        //teste= 1 + teste++;
        teste = 1 + ++teste;
        System.out.format("teste::  %s\n",teste);
        
        int x = 4;
        int y = 7;
        x+=2; // x = x + 2
        y/=3;// y = y / 3
        System.out.format("o valor de x é %s\n" ,x);
        System.out.format("o valor de y é %s\n" ,y);
        
        float v = 8.592f;
        System.out.println("Para o valor "+v);
        int arb = (int) Math.floor(v);
        System.out.format("Arredondamento para baixo :: %s\n",arb);
        int arc = (int) Math.ceil(v);
        System.out.format("Arredondamento para cima :: %s\n",arc);
        int arabs = (int) Math.abs(v);
        System.out.format("Arredondamento absoluto :: %s\n",arabs);
        int arn = (int) Math.round(v);
        System.out.format("Arredondamento normal :: %s\n",arn);
        
        double ale = Math.random();
        int n = (int)(1 + ale * (60-1));
        System.out.println("o valor ale é "+n);
    }
    
}
