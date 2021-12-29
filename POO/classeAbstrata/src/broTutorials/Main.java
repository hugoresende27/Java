package broTutorials;
/*
Pode-se dizer que as classes ABSTRACT servem como “modelo” para outras classes que dela herdem, não podendo ser
instanciada por si só. Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada
herdando dela e então instanciar essa nova classe. Os métodos da classe abstrata devem então serem sobrescritos nas
classes filhas.
Usa se por questões de segurança
 */

public class Main {

    public static void main(String[] args) {

        //Veiculo veic = new Veiculo(); //Veiculo é uma classe abstract, não pode ser instanciada
        Carro car1 = new Carro();

        car1.go();
    }
}
