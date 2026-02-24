package JavaSession4;
import java.util.Scanner;

public class EvenOddCounter {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements :");
        for(int i = 0 ; i < size ; i++){
            arr[i] =sc.nextInt();
        }

        int evenCount  = 0;
        int oddCount = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count in an array : " + evenCount);
        System.out.println("Odd count in an array : " + oddCount);


        sc.close();
    }
}
