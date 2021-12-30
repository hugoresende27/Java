/*
static = modificador pode ser aplicado a vars metodos ou classes
a classe que contem o static é dona desse static
static é partilhado
 */
public class Main {

    public static void main(String[] args) {

        Friend amigo1 = new Friend("Bro");
        Friend amigo2 = new Friend("To");
        Friend amigo3 = new Friend("Ze");
        Friend amigo4 = new Friend("Lo");
        Friend amigo5 = new Friend("Mo");

        //System.out.println(Friend.qtd);//qtd é uma static var

        Friend.mostrarAmigos(); //metodo static para mostrar qtd de amigos

        //Math mat = new Math();
        //mat.round(559);
        Math.round(99.5);
    }
}
