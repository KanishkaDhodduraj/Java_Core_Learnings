package JavaSession3;
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers : ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        //Using if-else ladder
        int largestNumber;
        if ( firstNumber >= secondNumber && firstNumber >= thirdNumber ) {
           largestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }

        System.out.println("Largest Number : " + largestNumber);
    }

}
