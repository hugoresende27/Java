package broTutorials;
/*
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with
an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of
another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values,
or the same type, like: String keys and String values:
semelhante a array's, mas usa uma chave que pode ser do tipo String por exemplo, par de informação CHAVE : VALOR
 */

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //hasmap <datatype chave,datatype value> nome_mapa = new HashMap <dt,dt>
        HashMap <String,String> paises = new HashMap <String,String>();

        //adicionar valores
        paises.put("PORTUGAL","Lisboa");
        paises.put("ESPANHA","Madrid");
        paises.put("INDIA","Nova Deli");
        paises.put("ANGOLA","Maputo");
        paises.put("RUSSIA","Moscovo");
        paises.put("CHINA","Beijing");

        System.out.println("TUDO:: "+paises);
        //remover por key
        paises.remove("RUSSIA");
        System.out.println("sem RUSSIA:: "+paises);
        //devolve o valor da chave passada no parametro
        System.out.println("valor CHINA:: "+paises.get("CHINA"));
        //tamanho do mapa paises
        System.out.println("TAMANHO:: "+paises.size());
        //substituir, replace()
        paises.replace("PORTUGAL","Brenha");
        System.out.println("Nova capital PT:: "+paises);
        //verificar se uma chave existe no hashmap
        System.out.println(" CONTAINSKEY(ESPANHA)::"+paises.containsKey("ESPANHA"));
        //verificar se um valor existe no hashmap
        System.out.println(" CONTAINSVALUE(Nova Deli)::"+paises.containsValue("Nova Deli"));
        //imprimir com FOREACH
        for (String i : paises.keySet()){
            //paises.get(i) vai devolver os valores, i é a chave
            System.out.println(i +" --> "+ paises.get(i));

        }
        //apagar tudo, clear()
        paises.clear();
        System.out.println(paises);


    }

}
