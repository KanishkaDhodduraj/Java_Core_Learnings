package JavaSession3;
import java.util.Scanner;
public class FibonacciSeriesPrinter {

    public static void main (String[] args) {
        Scanner sc = new Scanner ( System.in );
        final int SERIES_COUNT = 5;                      //First 5 fibonacci numbers

        System.out.println ("First " + " " + SERIES_COUNT + " Fibonacci Numbers : ");

        int firstNumber  = 0 ;
        int secondNumber = 1 ;

        if ( SERIES_COUNT > 0 ) {
            System.out.println( "First Number : " + firstNumber );
        }
        if (SERIES_COUNT > 1){
            System.out.println( "Second Number : " + secondNumber );
        }

        for ( int i = 2 ; i < SERIES_COUNT ; i++ ) {
           int nextNumber = firstNumber + secondNumber ;
           System.out.println(nextNumber + "  ");
           firstNumber  = secondNumber ;
           secondNumber = nextNumber ;
        }
        System.out.println();
        sc.close();
    }
}
