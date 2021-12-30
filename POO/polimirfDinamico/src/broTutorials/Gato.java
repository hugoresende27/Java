package broTutorials;

public class Gato extends Animal{

    @Override   //boa pratica @Override
    public void speak(){
        System.out.println("Gato faz miau");
    }
}
