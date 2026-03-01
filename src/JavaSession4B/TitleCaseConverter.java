package JavaSession4B;
import java.util.Scanner;

public class TitleCaseConverter {
    public static String toTitlecase (String sentence) {

        if(sentence == null || sentence.trim().isEmpty()){
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < words.length ; i++){
            String word = words[i];

            if(word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
            }
            if(i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String str = sc.nextLine();

        System.out.println("Output : " + toTitlecase(str));
        sc.close();

    }
}