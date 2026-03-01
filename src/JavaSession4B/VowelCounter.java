package JavaSession4B;
import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String str) {

        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the String : ");
            String str = sc.nextLine();

            System.out.println("Vowels : " + countVowels(str));

            sc.close();
        }
}