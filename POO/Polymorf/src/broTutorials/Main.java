package broTutorials;

/*
POLIMORFISMO = muitas-formas
Habilidade de um Objeto se identificar com mais do que um tipo
O Polimorfismo Estático se dá quando temos a mesma operação implementada várias vezes na mesma classe.
A escolha de qual operação será chamada depende da assinatura dos métodos sobrecarregados.
O Polimorfismo Dinâmico acontece na herança, quando a subclasse sobrepõe o método original.
Agora o método escolhido se dá em tempo de execução e não mais em tempo de compilação.
A escolha de qual método será chamado depende do tipo do objeto que recebe a mensagem.
 */

public class Main {

    public static void main(String[] args) {
        Carro car = new Carro();
        Barco boat = new Barco();
        Bike bike = new Bike();

        //ARRAY DataType Veiculos
        Veiculo[] garagem1 = {car,boat,bike};

        //LOOP PARA PERCORRER TODOS OS ELEMENTOS
        for (Veiculo x : garagem1){
            x.go();     //x é cada elemento do array, posso usar o metodo go()
        }
    }

}
