/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Hugo
 */
public class ClienteVIP extends Cliente {   //extends, herança da classe Cliente    

        private String cod;
        
        public ClienteVIP(String nome,String endereco,String cod){
            super(nome,endereco);//super para herdar da classe Cliente nome e endereco
            this.cod=cod;
        }
        
        public String getCod() {
            return cod;
        }

         public void setCod(String cod) {
            this.cod = cod;
        }
        
        
}
