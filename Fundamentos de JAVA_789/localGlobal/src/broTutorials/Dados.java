package broTutorials;

import java.util.Random;

public class Dados {

    Random rand;        //vars globias ran e num, para serem usadas nos metodos abaixo sem serem
    int num = 0;        //passadas como parametros

    Dados(){
        rand = new Random();
        rolar();
    }

    void rolar(){
        num = rand.nextInt(6)+1;
        System.out.println(num);
    }
}
