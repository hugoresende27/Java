package broTutorials;
/*
construtor = special method para criar um objeto
 */
public class Main {

    public static void main(String[] args) {

        Humano homem = new Humano("Hugo",33,74.8);
        Humano mulher = new Humano("Rita",23,54.8);

        System.out.println(homem.nome);
        System.out.println(mulher.nome + "\t"+ mulher.idade);

        homem.comer();
        mulher.dormir();
        homem.beber();
    }
}
