package JavaSession4;
import java.util.Scanner;

public class ArraySumPrinter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter number of columns :");
        int column = scanner.nextInt();

        int[][] array = new int[row][column];
        int sum = 0;

        System.out.println("Enter the matrix : ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
              array[i][j] = scanner.nextInt();
              sum += array[i][j];
            }
        }

        System.out.println("Sum of elements in 2D array :" + sum);
        scanner.close();

    }
}