package broTutorials;
/*
The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share
the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks,
and nested classes. The static keyword belongs to the class than an instance of the class
Why do we use static?
Use static when you want to provide class level access to a method, i.e. where the method should be callable without
an instance of the class. Static methods don't need to be invoked on the object and that is when you use it.
Example: your Main() is a static and you don't create an object to call it.
 */

import java.util.Scanner;

public class aulaSusanaFuncoes {

    static void mostra(int x){
        System.out.println("O maior é o "+x);
    }

    static int soma(int a,int b,int c){
        if (a>b && a>c){        //se a maior do que b e a maior do q c
            return a;
        }else if (b>c){ //neste teste já sei q a não é maior do que b
            return b;
        }else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        System.out.println("NUM1-> ");
        a = input.nextInt();
        System.out.println("NUM2-> ");
        b = input.nextInt();
        System.out.println("NUM3-> ");
        c = input.nextInt();

        //System.out.println("Maior:: "+soma(a,b,c));
        mostra(soma(a,b,c));
    }
}
