package Heranca;
/*
HERANCA = usar palavra extends na classe
As classes que recebem a herança do pai tem acesso aos seus metodos e atributos, não sendo preciso reescrever código
 */

public class Main {

    public static void main(String[] args) {

        Car carro = new Car();

        carro.go();
        System.out.println("SPEED::"+carro.velocidade);
        System.out.println("PORTAS::"+carro.portas);

        /////////////////////////////////////////////////////////
        Bike bici = new Bike();

        bici.stop();
        System.out.println("SPEED::"+bici.velocidade);
        System.out.println("PEDAIS::" +bici.pedais);


    }
}
