package broTutorials;
/*
METODO = bloco de código executado quando chamado
primeira letra lowercase
METODO OVERLOAD = mesmo nome, número ou DataType de parametros diferentes, a assinatura é o nome e os parametros
 */

public class Main {

    public static void main(String[] args) {

        String nome = "Bro";
        int idade = 33;
	    hello(nome,idade);


        int x = 3;
        double y = 4.1;
        int z = 7;
        //soma é uma função overload, difere na chamada conforme o numero de parametros usados ou o DATATYPE dos params
        System.out.println(soma(x,y));
        System.out.println(soma(x,y,z));
        System.out.println(soma(x,y,z,x));
        System.out.println(soma(1.5,31.9,12.5,5));


    }

    ////tem de ser static porque o main é static
    static void hello (String n, int i) {
        System.out.println("Hello "+ n+" tens "+i+" anos");
    }

    ///////////////////////////////////////////////////////////////////
    //função com retorno
    static int soma(int a, int b){
        return a+b;
    }
    ///////////////////////////////////////////////////////////////////
    //metodos overload, numero de parametros diferentes
    static int soma(int a, int b,int c){    //recebe 3 parametros
        return a+b+c;
    }
    static int soma(int a, int b,int c, int d){
        return a+b+c*d;
    }
    ///////////////////////////////////////////////////////////////////
    //metodos overload, DataType de parametros diferentes
    static double soma(double a, double b){
        return a+b;
    }
    static double soma(double a, double b,double c){    //recebe 3 parametros
        return a+b+c;
    }
    static double soma(double a, double b,double c, double d){
        return a+b+c*d;
    }



}
