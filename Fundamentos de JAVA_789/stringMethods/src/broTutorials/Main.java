package broTutorials;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name ="Bro";
        boolean resultado = name.equals("Bro");
        boolean resultado2 = name.equalsIgnoreCase("bRo");

        System.out.println(resultado2);

        ///////////////////////////
        int res = name.length();        //comprimento tipo int
        char res2 = name.charAt(0);     //char at index tipo char
        int res3 = name.indexOf("b");   //devolve o index em que está a letra "B"(não presente -1, case sense)
        String nomeB= "    espaço tbm conta como não    vazio!      ";
        boolean res4 = nomeB.isEmpty();  //true ou false se vazio ou não "";

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        ///////////////////////////////////////////////////////////////////
        String x = nomeB.toUpperCase();
        String y = nomeB.toLowerCase();
        String z = nomeB.trim();        //trim corta os espaços vazios
        String a = nomeB.replace('o','a');  //replace de 'o' com 'a'
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
