package broTutorials;

public class Main {

    public static void main(String[] args) {
        //arrays têm de ter o mesmo tipo de dados
	    String [] carros = {"Camaro","Corvette","Tesla"};
        carros[0] = "Mustang";
        for (int i=0; i< carros.length; i++){
            System.out.println(carros[i]);
        }
        /////////////////////////////////////////////////
        //outra forma de criar arrays
        String[] carrosB = new String[3];

        carrosB[0]="Camaro";
        carrosB[1]="Corvette";
        carrosB[2]="Tesla";

        for (int i=0; i< carrosB.length; i++){
            System.out.println(carrosB[i]);
        }

    }
}
