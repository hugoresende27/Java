package broTutorials;
/*
os getters = (RETURN var)tem por objetivo retornar o valor que lhe foi pedido, mas de forma a não prejudicar
a integridade do dado em si.
e os setters = (VOID) recebe como argumento uma informação, que pode ser qualquer tipo de dados suportados pela linguagem.
Dessa forma, não haverá o risco de ocorrerem acessos indevidos.
atributos da classe vão estar private, são acedidos por getters e setters
 */
public class Main {

    public static void main(String[] args) {
        Carro car1 = new Carro("Audi","R8",2021);

        System.out.println(car1);//metodo toString for override na classe para print do output
        //System.out.println(car1.modelo);//modelo has private access NÃO FUNCIONA
        System.out.println("GET MODELO:: "+car1.getModelo());
        //car1.ano = 2021;//ano' has private access NÃO FUNCIONA, ano é private
        car1.setAno(1999);
        System.out.println("SET ANO:: "+car1.getAno());
    }
}
