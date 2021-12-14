/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author Hugo
 */
public class Media {
    float medias(float soma,float teste){
        return soma/teste;
    }
    String aprov(float nota){
        if (nota>=9.5){
            return "Passou";
        }else if(nota >= 8.5){
            return "recuperation";
        } else {
            return "Raposa";
        }
    }
}
