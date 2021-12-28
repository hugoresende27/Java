package broTutorials;

public class Main {

    public static void main(String[] args) {
	// Array 2D, array de arrays, matriz
        String[][] carros = new String[3][3];

        carros[0][0] = "Renault";
        carros[0][1] = "Audi";
        carros[0][2] = "Seat";
        carros[1][0] = "Citroen";
        carros[1][1] = "Ranger";
        carros[1][2] = "Ford";
        carros[2][0] = "Fiat";
        carros[2][1] = "Ferrari";
        carros[2][2] = "Tesla";

        for (int i=0; i<carros.length; i++){        //para percorrer uma matriz, 2 loops for
            for (int j=0; j<carros[i].length; j++){ //j vai até carros[i].length, comprimento da linha
                System.out.print(carros[i][j]+"\t|\t");
            }
            System.out.println();
        }
        //////////////////////////////////////////////////////////
        String [][] carros2 = {{"Fiat","Mustang","Silverado"},
                               {"Mustang","Ranger","Ferrari"},
                               {"Lambo","Tesla","Audi"}};

        for (int i=0; i<carros2.length; i++){        
            for (int j=0; j<carros2[i].length; j++){
                System.out.print(carros2[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }
}
