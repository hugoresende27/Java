package overriding;
/*
How overriding is different from overloading?
In method overloading, methods must have the same name and different signatures. OVERLOADING = NOME = ASSINATURA !=
In method overriding, methods must have the same name and same signature. OVERRIDING = NOME = ASSINATURA =
 */
public class Main {

    public static void main(String[] args) {
        Cao boby = new Cao();

        boby.comunicar(); //este metodo foi overriding na classe Cao, apesar de tbm existir na classe Animal
    }
}
