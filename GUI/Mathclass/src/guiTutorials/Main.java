package guiTutorials;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x = 3.64;
        double y = -10;
        double z = 10;

        double ma = Math.max(x,y);
        double mi = Math.min(x,y);
        double ab = Math.abs(y);
        double ra = Math.sqrt(z);
        double rn = Math.round(x);
        double fl = Math.floor(x);

        System.out.println("MAX:: "+ ma + "\tMIN:: "+ mi
                        +"\tABS:: "+ ab + "\tRAIZ:: "+ ra
                        +"\tROUND::"+ rn+ "\tFLOOR:: "+fl);
        /////////////////// HIPOTENUSA /////////////////////////

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira lado x -->");
        x = scanner.nextDouble();
        System.out.print("Insira lado y -->");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("HIPOTENUSA:: "+z);
        scanner.close();
    }
}
