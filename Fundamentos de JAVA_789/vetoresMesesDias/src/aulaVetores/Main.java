package aulaVetores;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ler o ano
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //vetores meses e dias
        String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};

        //teste de bissexto ou não
        if( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ) {
            System.out.println(year + " é bissexto.");
            dias[1] = 29;   //se bissexto fevereiro tem 29 dias
        }
        else{
            System.out.println(year + " não é bissexto");
        }

        //print dos meses com os dias respectivos
        for (int i=0; i<meses.length; i++){
            System.out.println("O mês "+meses[i]+ " tem "+ dias[i]+" dias");
        }

    }
}
