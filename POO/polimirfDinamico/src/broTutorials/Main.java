package broTutorials;
/*
POLIMORFISMO = muitas-formas
Habilidade de um Objeto se identificar com mais do que um tipo
O Polimorfismo Estático se dá quando temos a mesma operação implementada várias vezes na mesma classe.
A escolha de qual operação será chamada depende da assinatura dos métodos sobrecarregados.
O Polimorfismo Dinâmico acontece na herança, quando a subclasse sobrepõe o método original.
Polimorfismo Dinâmico =  método escolhido se dá em tempo de execução e não mais em tempo de compilação.
O objeto vai ser criado durante a execução
class extends e metodos @Override
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Animal animal;  //Objeto animal da class Animal

        System.out.print("Qual o animal?");
        System.out.print("[1-CAO] | [2-GATO] --> ");
        int op = input.nextInt();

        if (op==1) {
            animal = new Cao();
            animal.speak();
        } else if (op==2) {
            animal = new Gato();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Animal inválido");
            animal.speak();
        }
    }
}
