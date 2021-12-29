package broTutorials;

public class Humano {

    ////////////////ATRIBUTOS//////////////////////
    String nome;
    int idade;
    double peso;

    ////////////////MÉTODOS//////////////////////
    Humano(String nome, int idade, double peso){   //contrutor por defeito

        this.nome = nome;   //keyword this.
        this.idade = idade;
        this.peso = peso;
    }
    /////////////////////
    void comer(){
        System.out.println(this.nome+ " está a comer");
    }
    /////////////////////
    void dormir(){
        System.out.println(this.nome+ " está a dormir");
    }
    /////////////////////
    void beber(){
        System.out.println(this.nome+ " está a beber");
    }
}
