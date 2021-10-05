/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Hugo

public class ClienteApp {
    
      public static void main(String[] args){
          
          ClienteVIP c1 =new ClienteVIP("xxxx","bairro de lata","12345");
          ClienteVIP c2 =new ClienteVIP("yyyy","bairro de amer","78909");
          
          System.out.println("Cliente 1"+c1.getNome()+c1.getEndereco()+c1.getCod());
          System.out.println("Cliente 2"+c2.getNome()+c2.getEndereco()+c2.getCod());
      }
}
*/
public class ClienteApp {
    
    public static void main(String[] args){
        
        
       ClienteVIP clientepf1 = new ClienteVIP("xxxxyz","bairro tal","1112121");
       
       
       PessoaNor clientepj1 = new PessoaNor("zzzzz","bairro tal tal","234243432");
        
       
        System.out.println("cliente pf dados:"+clientepf1.getNome() + " "+ clientepf1.getEndereco());
       
        System.out.println(clientepf1.toString());
        
        System.out.println(clientepj1.toString());
        
    }
    
    
}