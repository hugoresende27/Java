package broTutorials;

public class Pizza {

    /////////ATRIBUTOS GLOBAIS
    String massa;
    String molho;
    String queijo;
    String topping;

    //////////METODO CONSTRUTOR
    ////////METODO OVERLOADED SEM PARAMETROS
    Pizza(){

    }
    ////////METODO OVERLOADED SÓ COM MASSA
    Pizza(String massa){

        this.massa = massa;

    }
    ////////METODO OVERLOADED SEM TOPPING e SEM QUEIJO
    Pizza(String massa, String molho){

        this.massa = massa;
        this.molho = molho;

    }
    ////////METODO OVERLOADED SEM TOPPING
    Pizza(String massa, String molho, String queijo){

        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;

    }
    /////////METODO COMPLETO, 4 PARAMETROS
    Pizza(String massa, String molho, String queijo, String topping){

            this.massa = massa;
            this.molho = molho;
            this.queijo = queijo;
            this.topping = topping;

    }




}
