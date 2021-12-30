package objetos;
/*
objeto = um exemplar/instancia de uma classe que pode ter atributos ou metodos

 */

public class Main {

    public static void main(String[] args) {
        Carro meuBote = new Carro();
        Carro teuBote = new Carro();

        System.out.println(meuBote.marca+"\t"+ meuBote.modelo); //meuBote vai ser igual a teuBote

        System.out.println(meuBote.marca+"\t"+ teuBote.modelo);

        meuBote.conduzir();

    }
}
