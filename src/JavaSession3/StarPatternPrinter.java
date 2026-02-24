package JavaSession3;
import java.util.Scanner;

public class StarPatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printStarPattern(rows);
        }

        scanner.close();
    }
    public static void printStarPattern(int rows) {
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns (stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}