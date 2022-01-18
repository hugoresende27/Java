/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

/**
 *
 * @author Hugo
 */
public class ComparaAreas {
    
    public static void compArea (double area1,double area2){
        //System.out.println(area1>area2 ? "\nArea X maior\n" : "\nArea Y maior\n");
        if (area1 > area2){
            System.out.println("Area X maior \n");
        } else if (area2> area1){
            System.out.println("Area Y maior\n");  
        } else {
            System.out.println("IGUAIS\n");
        }
    }
    public static double compPer (double per1,double per2){
     //System.out.println(area1>area2 ? "\nArea X maior\n" : "\nArea Y maior\n");
     if (per1 > per2){
         return per1;
     } else if (per2> per1){
         return per2; 
     } else {
         return 0;
     }
 }
}
