package JavaSession4B;
import java.util.Scanner;

public class DigitsSum {
        public static int sumDigits(String str) {
            int sum = 0;

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(Character.isDigit(ch)) {

                    int digit = Character.getNumericValue(ch);
                    sum += digit;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Input: ");
            String input = sc.next();

            System.out.println(sumDigits(input));
            sc.close();
        }
    }