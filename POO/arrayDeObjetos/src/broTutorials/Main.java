package broTutorials;

public class Main {

    public static void main(String[] args) {
        //EXEMPLO DE ALGUNS ARRAYS NORMAIS
        int[] numbs = new int[3];
        char[] letras = new char[4];
        String[] palavras = new String[5];

        ///////////////////ARRAY DE OBJETOS Comida COM NOME armazem
        Comida[] armazem = new Comida[3];

        Comida arca1 = new Comida("Pizza");
        Comida arca2 = new Comida("Vegetais");
        Comida arca3 = new Comida("Peixe");

        armazem[0] = arca1;
        armazem[1] = arca2;
        armazem[2] = arca3;

        System.out.println(armazem[0].nome);    //retorna nome de arca1

        //////////////////OUTRA MANEIRA PARA PREENCHER O ARRAY armazens :
        Comida[] armazens = {arca1,arca2,arca3};

        System.out.println(armazens[2].nome);
    }
}
