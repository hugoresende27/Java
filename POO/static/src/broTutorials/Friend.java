package broTutorials;

public class Friend {

    String name;
    static int qtd; //static para ser ter acesso no main diretamente

    Friend ( String name){
        this.name = name;
        qtd++;
    }

    ///////////METODO STATIC PARA SER USADO NO MAIN
    static void mostrarAmigos(){
        System.out.println("Voce tem "+ qtd + " amigos");
    }
}
