package ufcd0791;

import java.util.Scanner;

public class Main {

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
    }
}
