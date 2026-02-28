package JavaSession4;

import java.util.Scanner;

public class Pattern3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input : ");
        int num = sc.nextInt();

        int[] starsPerRow = new int[num];
        for(int i = 0 ; i < num ; i++) {
            starsPerRow[i] = num - i;
        }

        for(int i = 0 ; i < num ; i++) {
            for(int j = 0 ; j < starsPerRow[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}