/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaarraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Hugo
 */
public class AulaArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <String> lista1 = new ArrayList<>();
        String[] pessoas={"hugo","emauel","teixeira","antonio","carlos"};
        
        lista1.add("hugao");
        lista1.add(0,"Susana");//só faz sentido usar a posição se ela existir
        
        lista1.remove("hugao");
        lista1.remove(0);
        
        for (int i=0; i<5;i++){
            lista1.add(Integer.toString(i));
        }
        for (String x:pessoas){
            lista1.add(x);
        }
        lista1.removeIf(y->y.charAt(0)=='h');//função lambda
        if  (lista1.contains("hugo")) lista1.add("RESENDE");
        
      //  for (int i=0; i<lista1.size();i++){
          //  System.out.println(lista1.get(i));
       // }
        
        for (String x:lista1){
            System.out.println
        ("INDEX:: "+lista1.indexOf(x)+"\tELEMENTO:: "+x);
        }
        
        System.out.println("Elemento q não existe:: "+lista1.indexOf(99));
        System.out.println("Index of 8:: "+lista1.indexOf(8));
        System.out.println("Index of carlos:: "+lista1.indexOf("carlos"));
        System.out.println("SIZE::"+lista1.size());
        System.out.println(lista1.get(7));
        
        
        List <String> lista2 = 
                lista1.stream().
                filter(x->x.startsWith("a")).
              //  filter(x->x.contains("u")).
                collect(Collectors.toList());
   
        System.out.println("LISTA FINAL\n");
        for (String x:lista2){
            System.out.println(x);
        }
    }
    
}
