import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt){
        int retInt = 0;
        Boolean Valid = false;

        do{
            System.out.print("\n" +prompt + ": ");
            if(pipe.hasNextInt()){
                retInt = pipe.nextInt();
                pipe.nextLine();
                Valid = true;
            }
            else{
                System.out.println("Invalid input");
                Valid = false;
                pipe.next();
            }
        }while(!Valid);
        return retInt;
    }
    public static double getDouble(Scanner pipe, String prompt){
        Double retDouble = 0.0;
        Boolean Valid = false;
        do{
            System.out.print("\n" +prompt + ": ");
            if(pipe.hasNextDouble()){
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                Valid = true;
            }
            else{
                System.out.println("Invalid input");
                Valid = false;
                pipe.next();
            }
        }while(!Valid);
        return retDouble;
    }
}
