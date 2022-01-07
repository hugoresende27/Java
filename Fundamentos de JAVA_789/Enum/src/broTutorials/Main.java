package broTutorials;
/*
A Java Enum is a special Java type used to define collections of constants. More precisely, a Java enum type is a
special kind of Java class. An enum can contain constants, methods etc. Java enums were added in Java 5.
 */

enum Planetas {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANUS(7),
    NEPTUNO(8),
    PLUTÃO(9);

    int num;

    Planetas(int n){
        this.num = n;
    }
}

public class Main {

    public static void main(String[] args) {

        //instanciação de enum
        Planetas meuPlaneta1 = Planetas.TERRA;
        Planetas meuPlaneta2 = Planetas.MARTE;
        Planetas meuPlaneta3 = Planetas.NEPTUNO;
        Planetas meuPlaneta4 = Planetas.PLUTÃO;

        System.out.print("Planeta 1--> ");
        habitavel(meuPlaneta1);
        System.out.print("Planeta 2--> ");
        habitavel(meuPlaneta2);
        System.out.print("Planeta 3--> ");
        habitavel(meuPlaneta3);
        System.out.print("Planeta 4--> ");
        habitavel(meuPlaneta4);
    }

    static void habitavel(Planetas p){

        switch (p){
            case TERRA:
                System.out.println("PODE HABITAR AQUI");
                System.out.println("PLANETA #" + p.num);
                break;
            case MARTE:
                System.out.println("Chance de viver aqui");
                System.out.println("PLANETA #" + p.num);
                break;
            default:
                System.out.println("Não habitável");
                System.out.println("PLANETA #" + p.num);
                break;
        }
    }
}
