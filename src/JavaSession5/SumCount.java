package JavaSession5;
import java.util.Scanner;

public class SumCount {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Enter target : ");
            int target = sc.nextInt();

            int count = 0;

            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (arr[i] + arr[j] == target) {
                        count++;
                    }
                }
            }
            System.out.println("Number of pairs : " + count );
            sc.close();
        }
    }