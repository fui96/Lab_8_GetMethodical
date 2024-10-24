import java.util.Scanner;


public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Year = 0;
        int Month = 0;
        int Day = 0;
        int Hour = 0;
        int Minute = 0;
        Year = SafeInput.getRangedInt(in,"Please enter the year you were born",1950,2015);
        Month = SafeInput.getRangedInt(in,"Please enter the month you were born",1,12);
        switch (Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Day = SafeInput.getRangedInt(in,"Please enter the day you were born",1,31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Day = SafeInput.getRangedInt(in,"Please enter the day you were born",1,30);
                break;
            case 2:
                Day = SafeInput.getRangedInt(in,"Please enter the day you were born",1,29);
                break;

        }
        Hour = SafeInput.getRangedInt(in,"Please enter the hour you were born",1,24);
        Minute = SafeInput.getRangedInt(in,"Please enter the minute you were born",1,60);
        System.out.println("You were born " + Month + " " + Day + " " + Year + " at " + Hour + " o'clock and " + Minute + " minutes ");
    }
}
