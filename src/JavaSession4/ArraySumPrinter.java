package JavaSession4;
import java.util.Scanner;

public class ArraySumPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter number of columns :");
        int column = scanner.nextInt();

        int[][] array1 = new int[row][column];
        System.out.println("Enter elements of the first array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        int[][] array2 = new int[row][column];
        System.out.println("Enter elements of the second array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of 2D array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println((array1[i][j] + array2[i][j]) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}