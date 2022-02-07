/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio14listas;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Susana
 */
public class Execicio14Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       List <String> lista = new ArrayList<>();
        
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Rui");
        lista.add("Ana");
        lista.add(2, "Marco");
        
        //lista.remove (1);
        
        for (String x: lista){
            System.out.println(x);
        }
        
         System.out.println(lista.size());
        
        
        lista.removeIf(x->x.charAt(0)=='M');
        
        System.out.println("--------------------");
         for (String x: lista){
            System.out.println(x);
        }
        
         System.out.println(lista.size());
        
         System.out.println("indexOf do Rui "+ lista.indexOf("Rui"));
         System.out.println("indexOf do Marco "+ lista.indexOf("Marco"));
         
         
         
        List <String> resultado = lista.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
        for (String x: resultado){
            System.out.println(x);
         
         
         
    }
    
}
