package JavaSession4;
import java.util.Scanner;

public class ArrayElementsSumPrinter {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] num = new int[size];
        int sum = 0;

        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++) {
            num[i] = sc.nextInt();
            sum += num[i];

        }

        System.out.println("Sum of elements in array : " + sum);

        sc.close();

    }
}