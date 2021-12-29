package broTutorials;

public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return this.nome + "\t"+ this.idade +"\n";
    }
}
