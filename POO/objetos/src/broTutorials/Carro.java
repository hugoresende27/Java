package broTutorials;

public class Carro {


    ////////////////ATRIBUTOS DO CARRO//////////////////////////
    String marca = "Audi";
    String modelo ="A1";
    int ano = 2012;
    String cor = "cinza";
    double preco = 14999.99;

    //////////////////METODOS DO CARRO//////////////////////////
    void conduzir(){
        System.out.println("Estás a conduzir");
    }
    //////////////////////
    void travar(){
        System.out.println("Estás a pisar o travão!");
    }
}
