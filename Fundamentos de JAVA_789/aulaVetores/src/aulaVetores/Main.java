package aulaVetores;
/*
Vetores em JAVA são estruturas homógeneas de dados.
Cada item é chamado de elemento.
Cada elemento possui uma posição
 */
public class Main {

    public static void main(String[] args) {
    /////////// VETOR 1 ///////////////////////////
        int n[]=new int[4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;

        for (int i=0; i<n.length;i++){
            System.out.print(n[i]+" | ");
        }

    /////////// VETOR 2 ///////////////////////////
        int n2[] = {33,55,88,22};

        for (int i=0; i<n2.length;i++){
            System.out.print(n2[i]+" | ");
        }

    /////////// VETOR 3 ///////////////////////////
        int vetor[] = new int[4];


    }
}
