package JavaSession4B;
import java.util.Scanner;

public class WordCounter {
    public static int countWord(String sentence) {
        if( sentence == null || sentence.trim().isEmpty()){
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = sc.nextLine();
        System.out.println("Number of words : " + countWord(str));

        sc.close();
    }
}