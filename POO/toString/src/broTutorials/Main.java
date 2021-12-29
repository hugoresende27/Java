package broTutorials;
/*
toString() = metodo especial que retorno uma string q representa o objeto
 */

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro); //vai imprimir o endereço de memória do carro broTutorials.Carro@6d03e736

        System.out.println(carro.toString());//metodo toString foi overwrite
        System.out.println(carro);  //deste modo posso imprimir os dados(ver metodo toString() na classe Carro)
    }
}
