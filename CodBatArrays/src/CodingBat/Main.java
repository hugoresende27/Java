package CodingBat;

public class Main {

    public static void main(String[] args) {

        firstLast6 ex1 = new firstLast6();
        System.out.println("FIRSTLAST6");
        System.out.println(ex1.fun1(new int[]{1,2,6}));
        System.out.println(ex1.fun1(new int[]{6,1,2,3}));
        System.out.println(ex1.fun1(new int[]{13,6,1,2,3}));

        sameFirstLast ex2 = new sameFirstLast();
        System.out.println("SAMEFIRSTLAST");
        System.out.println(ex2.fun1(new int[]{1,2,3}));
        System.out.println(ex2.fun1(new int[]{1,2,3,1}));
        System.out.println(ex2.fun1(new int[]{1,2,1}));

        commonEnd ex3 = new commonEnd();
        System.out.println("COMMONEND");
        System.out.println(ex3.fun1(new int[]{1,2,3},new int[]{7,3}));
        System.out.println(ex3.fun1(new int[]{1,2,3},new int[]{7,3,2}));
        System.out.println(ex3.fun1(new int[]{1,2,3},new int[]{1,3}));

        sum3 ex4 = new sum3();
        System.out.println("SUM3");
        System.out.println(ex4.fun1(new int[]{1,2,3}));

        rotateLeft3 ex5 = new rotateLeft3();
        System.out.println("ROTATELEFT3");
        int a[] = {1,2,3}; //array a original
        int b[] = ex5.fun1(a);  //array b vai receber o array a com fun1 aplicada
        for (int i=0; i< b.length; i++){        //loop para imprimir
            System.out.println(b[i]);
        }



    }
}
