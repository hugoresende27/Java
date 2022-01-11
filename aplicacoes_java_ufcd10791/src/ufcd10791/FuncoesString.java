package ufcd10791;

public class FuncoesString {

    public static void main(String[] args) {

        String original = "   abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(5,10);
        String s05 = original.substring(2);

        System.out.println("ORIGINAL :: "+original);
        System.out.println("LOWER:: "+s01);
        System.out.println("UPPER:: "+s02);
        System.out.println("TRIM:: "+s03);
        System.out.println("SUB(5,10)::"+s04);
        System.out.println("SUB(5)::"+s05);

    }
}