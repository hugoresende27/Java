/*
 Pedir ao utilizador para inserir 3 números inteiros e 
encontrar/mostrar o maior número
 */
package exc1e2;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc1e2 {

    /**
     * @param args the command line arguments
     */
    static int  funMaior (int[] arr){
        int m=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]> m){
                m = arr[i];
            }
        }
        return m;
    }
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int nums[] = new int[3];
        int maior=0;
        for (int i=0; i<nums.length;i++){
            System.out.print("valor :: "+(i+1)+"-> ");
            nums[i] = input.nextInt();
        }
        for (int i=0; i<nums.length;i++){
            if (nums[i]> maior){
                maior = nums[i];
            }
        }
        System.out.println("MAIOR::"+maior);
        System.out.println("FUNÇÃO MAIOR:: "+funMaior(nums));
    }
    
}
