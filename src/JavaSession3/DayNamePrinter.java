package JavaSession3;

public class DayNamePrinter {
    public static void main (String[] args){
        final int DAY_VALUE = 4;

        String dayName = getDayName(DAY_VALUE);
        System.out.println("Day " + DAY_VALUE + " is : " + dayName);
    }

    public static String getDayName(int day) {
        switch(day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";

        }
    }
}