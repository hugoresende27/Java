package codingbatstrings;
/*
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class countHi {

    public static int countHi(String str) {
        int cont=0;
        for (int i=0; i<=str.length()-2;i++){
            if (str.substring(i,i+2).equals("hi")){
                cont ++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
    }

}
