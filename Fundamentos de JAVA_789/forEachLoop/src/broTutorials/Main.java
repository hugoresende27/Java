package broTutorials;
/*
for-each = For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.
MENOS PASSOS, MAIS READABLE, MENOS FLEXIBLE
for (DataType x : lista) {sout(x)};

 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] animais = {"gato", "cão", "rato", "pomba"};
        //para cada String i de animais
        for (String i: animais) {
            System.out.println(i);  //posso imprimir i diretamente porque é do tipo String
        }

///////////////////////////////////////////////////////////////////////////////
        ArrayList<String> zoo = new ArrayList<String>();

        zoo.add("Zebra");
        zoo.add("Leão");
        zoo.add("Puma");
        zoo.add("Hiena");
        for (String x: zoo){
            System.out.println(x);
        }



    }
}
