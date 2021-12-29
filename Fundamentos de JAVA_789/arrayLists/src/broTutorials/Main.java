package broTutorials;
/*
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and
removed from an ArrayList whenever you want.
ARRAY TAMANHO FIXO, ARRAYLIST POSSO ALTERAR A SUA DIMENSÃO
 */
//
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //arraylist <datatype(wrapper classes> var = new ArrayList<DataType>();
        ArrayList <String> lista = new ArrayList<String>();

        lista.add("kiwi");
        lista.add("pera");
        lista.add("maça");

        lista.set(0,"Morangos"); //.set(index,"string")
        lista.remove(2);
        //lista.clear();

        for (int i=0; i<lista.size(); i++){//para arraylist uso .size() em vez de length
            System.out.println(lista.get(i));   //lista.get(i) para arraylist
        }

/////////////////////////////// arraylist 2D --- matrizes com arraylists/////////////////////////////////

        //Dynamic list of lists, posso mudar o tamanho das listas a qql momento durante
        //o runtime

        //listaCompras tipo lista dentro de listas
        ArrayList <ArrayList<String>> listaCompras = new ArrayList();

        //////////////////////////////////
        ArrayList <String> listaVeg = new ArrayList<String>();

        listaVeg.add("Broculo");
        listaVeg.add("Tomate");
        listaVeg.add("Alface");

        //////////////////////////////////
        ArrayList <String> listaFru = new ArrayList<String>();

        listaFru.add("Kiwi");
        listaFru.add("Pera");
        listaFru.add("Maca");

        //////////////////////////////////
        ArrayList <String> listaBeb = new ArrayList<String>();

        listaBeb.add("Cola");
        listaBeb.add("7Up");
        listaBeb.add("Compal");

        //////////////////////////////////
        listaCompras.add(listaFru);
        listaCompras.add(listaVeg);
        listaCompras.add(listaBeb);

        System.out.println(listaCompras);
        System.out.println(listaCompras.get(0).get(0));     //vai ler o elemento 0 da lista 0
        System.out.println(listaCompras.get(1).get(1));


    }
}
