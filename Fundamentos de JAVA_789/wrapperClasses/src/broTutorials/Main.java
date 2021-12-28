package broTutorials;

public class Main {

    public static void main(String[] args) {
        /*
wrapper class Os Wrapper são conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer conversões
em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos, ou seja, é feita um embrulho
de streams que são fluxo de dados através de canais.Sendo assim, existe uma classe Wrapper para cada tipo primitivo identificado
pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula. Essa regra de declaração é aplicada a todos os tipos,
exceto aos que são char classificados como Character e boolean como Boolean.

    PRIMITIVE -- WRAPPER
    boolean     Boolean
    char        Character
    int         Integer
    double      Double

    autoboxing = automatic conversion
    unboxing = reverse of autoboxing

    DADOS PRIMITIVOS SÃO MAIS RÁPIDOS QUE AS WRAPPER CLASSES
      */
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro"; //String é reference data type

        if (a==true) {
            System.out.println("VERDADEIRO");
        }
        if (b=='@'){
            System.out.println("VERDADEIRO");
        }

    }
}
