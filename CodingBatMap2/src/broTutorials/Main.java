package broTutorials;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String letras[] = new String[4];
        letras[0]="a";
        letras[1]="b";
        letras[2]="a";
        letras[3]="b";

        String letras2[] = new String[4];
        letras2[0]="a";
        letras2[1]="bb";
        letras2[2]="a";
        letras2[3]="bb";

        String letras3[] = new String[5];
        letras3[0]="a";
        letras3[1]="b";
        letras3[2]="a";
        letras3[3]="c";
        letras3[4]="b";

        System.out.println(word0(letras));
        System.out.println(wordLen(letras2));
        System.out.println(wordMultiple(letras3));


    }
    /*

    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
    but for this problem the value is simply 0.

    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
    word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */
    public static Map<String, Integer> word0(String[] strings) {
       Map<String,Integer> mapa = new HashMap<>();
       for (String s: strings){
           mapa.put(s,0);
       }
       return mapa;
    }
    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    and the value is that string's length.
    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String,Integer> mapa = new HashMap<>();
        for (String s: strings){
            mapa.put(s,s.length());
        }
        return mapa;
    }
    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
    if that string appears 2 or more times in the array.
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String,Integer> contagem = new HashMap<>();
        Map<String,Boolean> mapa = new HashMap<>();
        for (int i=0; i<strings.length; i++){

            String chave = strings[i];  //chave = 0, 1, 2 , 3
            if (contagem.containsKey(chave)){
                int val = contagem.get(chave);
                val++;
                contagem.put(chave,val);
            } else {
                contagem.put(chave,1);
            }

            mapa.put(chave, contagem.get(chave)>=2);
        }
        return mapa;
    }
}
