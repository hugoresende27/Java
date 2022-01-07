package broTutorials;
/*
Method Chaining is the practice of calling different methods in a single line instead of calling other methods with the
same object reference separately. Under this procedure, we have to write the object reference once and then call the
methods by separating them with a (dot.).
 */

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String name = "   Hugo";

        name = name.concat( " Resende   ");
        name = name.toLowerCase();
        name = name.trim();

        name = name.concat(" Tudo   ").toUpperCase().trim().concat(" numa linha");

        System.out.println(name);
    }
}
