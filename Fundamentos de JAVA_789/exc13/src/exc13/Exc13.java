/*
Desenvolva um programa que:
Pergunte o género da pessoa. Peça para digitar:
f ou F - feminino
m ou M - masculino
Default: Valor inválido!
Imprima a mensagem "É do sexo feminino ou masculino" conforme o caso.
 */
package exc13;

import java.util.Scanner;
//import java.lang.Character;
/**
 *
 * @author Hugo
 */
public class Exc13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o gênero? (M/F) --> ");
        String s = input.nextLine().toLowerCase();

        if (s.equals("f")){
            System.out.println("É do sexo Feminino! ");
        }
        else  if (s.equals("m")){
            System.out.println("É do sexo Masculino! ");
        }
        else{
            System.out.println("Sexo desconhecido");
        }
        
        System.out.print("Qual o gênero? (M/F) --> ");
        char sexo = Character.toLowerCase((input.next().charAt(0)));
  
        if (sexo=='f'){
            System.out.println("É do sexo Feminino! ");
        }
        else  if (sexo=='m'){
            System.out.println("É do sexo Masculino! ");
        }
        else{
            System.out.println("Sexo desconhecido");
        }
        
        System.out.print("Qual o gênero? (M/F) --> ");
        char sexo2 = Character.toLowerCase((input.next().charAt(0)));
        switch (sexo2){
            case 'f':
                System.out.println("Feminino");
                break;
            case 'm':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("E.T.");
                break;
        }
    }
    
}
