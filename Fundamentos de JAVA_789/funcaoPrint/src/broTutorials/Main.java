package broTutorials;
/*
printf() = %[flags][precision][width][conversion character]
flags = -: left-justify
        +:
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf("%d Isto é uma string formatada", 123);

        boolean myBoolean = true; //%b
        char myChar = '@';        //%c
        String myString ="Bro you my hero";   //%s
        int myInt = 50;           //%d
        double myDouble = 1000;   //%f

        System.out.printf("\nBOOLEAN:: %b", myBoolean);
        System.out.printf("\nCHARS:: %c", myChar);
        System.out.printf("\nSTRING:: %30s", myString); //imprime o minimo de 10 chars//-10 alinha à esquerda
        System.out.printf("\nINT:: %d", myInt);
        System.out.printf("\nDOUBLE:: %,f", myDouble); //20 justifica á direita //, aparece um , em vez de .

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //final não posso mais mudar o valor da var
        final double pi = 3.14159;
        //pi = 4;
        System.out.println(pi);
    }
}
