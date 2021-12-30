/*
SUPER = The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 */
public class Main {

    public static void main(String[] args) {
        Heroi hero1 = new Heroi("Batman",42,"$$$");
        Heroi hero2 = new Heroi("SuperMan",32,"FORÇA");

        //System.out.println(hero1.nome);
        //System.out.println(hero1.idade);
        //System.out.println(hero1.poder);

        System.out.println(hero1.toString());   //toString() não é preciso
        System.out.println(hero2);
    }
}
