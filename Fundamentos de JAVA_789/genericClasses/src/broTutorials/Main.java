package broTutorials;
/*Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of
related methods, or with a single class declaration, a set of related types, respectively. Generics also provide
compile-time type safety that allows programmers to catch invalid types at compile time.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //4 classes genéricas com o metodo contrutor e metodo getvalue
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myStr = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());

        //classe genérica, apenas 1 class para todos os tipo de dados
        GenericClass<Integer,Integer> myInt2 = new GenericClass<>(69,33);
        GenericClass<Double,Double> myDouble2 = new GenericClass<>(36.14,99.66);
        GenericClass<Character,Character> myChar2 = new GenericClass<>('?','#');
        GenericClass<String,Character> myStr2 = new GenericClass<>("Hellllllllo",'%');

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
        System.out.println(myChar2.getValue());
        System.out.println(myStr2.getValue());

        //semelhante a criar um arraylist(tbm usa generic class o arrayList)
        ArrayList<String> myFriends = new ArrayList<>();
        ArrayList<Integer> myFriends2 = new ArrayList<>();

        //semelhante também á classe HashMap
        HashMap<Integer,String> user = new HashMap<>();


    }
}
