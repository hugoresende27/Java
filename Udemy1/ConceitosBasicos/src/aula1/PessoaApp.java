/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Hugo
 */
public class PessoaApp {
    
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(1,"Hugo");
        Pessoa p2 = new Pessoa(2,"Rita");
        Pessoa p3 = new Pessoa(3,"Lola");
        
        System.out.println("O nome de p1 é "+p1.getNome());
        System.out.println("O nome de p2 é "+p2.getNome());
        p2.setNome("Zé");
        System.out.println("O nome de p2 é "+p2.getNome());
    }
    
}
