package broTutorials;
/*
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes
that belong together, which makes your code more readable and maintainable.
To access the inner class, create an object of the outer class, and then create an object of the inner class:
 */

public class Main {

    public static void main(String[] args) {

        //iniciar classe de fora
        Outside fora = new Outside();
        //iniciar inner class
        Outside.Inside dentro = fora.new Inside();
        //print das vars da classe fora(x) e dentro(y)
        System.out.println(fora.x + dentro.y);
        //metodo cumprimentar na inner class dentro
        dentro.cumprimentar();
    }
}
