package broTutorials;
/*
The classic word-count algorithm: given an array of strings, return a Map<String,
Integer> with a key for each different string, with the value the number of times that string appears in the array.
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> mapa = new HashMap<>();

        for (String s: strings){
            if (!mapa.containsKey(s)){
                mapa.put(s,1);
            }
            else{
                int cont = mapa.get(s);
                mapa.put(s,cont+1);
            }
        }
        return mapa;
    }
    public static void main(String[] args) {
        String arrS1[] = new String[]{"a","b","a","c","b"};
        System.out.println(wordCount(arrS1));
    }
}
