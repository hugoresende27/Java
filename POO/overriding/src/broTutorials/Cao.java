package overriding;

public class Cao extends Animal{

    @Override //@Override não é obrigatório mas é boa prática
    void comunicar(){
        System.out.println("O cão ladra");

    }
}
