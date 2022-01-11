package ufcd10791;

public class FuncoesString {

    public static void main(String[] args) {

        String original = "   abcde ZZFGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(5,10);
        String s05 = original.substring(2);
        String s06 = original.replace("a","69");

        System.out.println("ORIGINAL :: "+original);
        System.out.println("LOWER:: "+s01);
        System.out.println("UPPER:: "+s02);
        System.out.println("TRIM:: "+s03);
        System.out.println("SUB(5,10)::"+s04);
        System.out.println("SUB(5)::"+s05);
        System.out.println("REPLACE(a,69)::"+s06);


        System.out.println("Lastindexof::"+original.lastIndexOf("E"));
        System.out.println("indexof::"+original.indexOf("Z"));

        String [] s10 = original.split(" ",original.length());//vai separar a cada " " em branco

        for (String x : s10){
            System.out.println("SPLIT::"+x);
        }


        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String a : arrOfStr)
            System.out.println(a);


    }
}