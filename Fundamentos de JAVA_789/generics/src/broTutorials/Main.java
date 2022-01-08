package broTutorials;
/*
Generics are a facility of generic programming that were added to the Java programming language in 2004 within version
J2SE 5.0. They were designed to extend Java's type system to allow "a type or method to operate on objects of various
types while providing compile-time type safety".[1] The aspect compile-time type safety was not fully achieved, since
it was shown in 2016 that it is not guaranteed in all cases
não preciso de criar multiplas versões de classe para cada tipo de dados
 */

public class Main {

    public static void main(String[] args) {

        //4 tipos de array diferentes, wrapper class
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5, 4.4, 3.6, 1.2, 3.4};
        Character[] charArray = {'H', 'U', 'G', 'O'};
        String[] strArray = {"Olá", "Pessoal"};

        /*
        //1 metodo para cada tipo de dados de array
        System.out.print("Inteiros-> ");
        mostraArrayInts(intArray);
        System.out.print("\nDoubles-> ");
        mostraArrayInts(doubleArray);
        System.out.print("\nChars-> ");
        mostraArrayInts(charArray);
        System.out.print("\nStrings-> ");
        mostraArrayInts(strArray);
         */

        //metodo getFirst escrito apenas uma vez dá para qualquer tipo de dados
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(strArray));

        /////////////////////////// EXEMPLO 2 ///////////////////////////////////////
        /*  vários Objetos de tipos diferentes, partilham o mesmo metodo draw
        Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new Item();
        Tree tree = new Tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);
         */

    }


/*      UM METODO PARA CADA TIPO DE DADOS
    public static void mostraArrayInts(Integer[] arr){
        for (Integer x : arr){
            System.out.print(x+" | ");
        }
    }

    public static void mostraArrayInts(Double[] arr){
        for (Double x : arr){
            System.out.print(x+" | ");
        }
    }
    public static void mostraArrayInts(Character[] arr){
        for (Character x : arr){
            System.out.print(x+" | ");
        }
    }

    public static void mostraArrayInts(String[] arr){
        for (String x : arr){
            System.out.print(x+" | ");
        }
    }
 */
    //metodo generico com tipo de dados Thing ou T
    public static <Thing> void mostraArray(Thing[] arr){
        for (Thing x : arr){
            System.out.println(x+" # ");
        }
    }

    //metodo get primeiro elemento, return do tipo Thing ou T com elemento [0] do array
    public static <Thing> Thing getFirst(Thing[] arr){
        return arr[0];
    }

    ///////////////////////////// EXEMPLO 2 ///////////////////////////////////
    // metodo draw escrito apenas uma vez, tipo Thing
    /*
    public static <Thing> void draw(Thing x){
        x.draw();
    }
     */

}
