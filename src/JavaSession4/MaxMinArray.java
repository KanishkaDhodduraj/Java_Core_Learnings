package JavaSession4;
import java.util.Scanner;

public class MaxMinArray {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i < num; i++ ) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i = 1 ; i < num ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum value of array : " + max);
        System.out.println("Minimum value of array : " + min);
        sc.close();
    }
}