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
    public static int getRangedInt(Scanner pipe, String prompt, int low , int high){
        int retInt = 0;
        Boolean Valid = false;
        do{
            System.out.print("\n" +prompt + ": ");
            if(pipe.hasNextInt()){
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt >= low && retInt <= high){
                    Valid = true;
                }
                else{
                    System.out.println("Invalid input, please enter a value within the range");
                }
            }
            else{
                System.out.println("Invalid input, please enter an integer");
                pipe.next();
            }
        }while(!Valid);

        return retInt;
    }
    public static Double getRangedDouble(Scanner pipe, String prompt, double low , double high){
        Double retDouble = 0.0;
        Boolean Valid = false;

        do {
            System.out.print("\n" +prompt + ": ");
            if(pipe.hasNextDouble()){
                Double FloatRet;
                FloatRet = pipe.nextDouble();
                pipe.nextLine();
                if (FloatRet >= low && FloatRet <= high){
                    Valid = true;
                    retDouble = FloatRet;
                }
                else{
                    System.out.println("Invalid input, please enter a value within the range");
                }
            }
            else{
                System.out.println("Invalid input, please enter a double");
                pipe.next();
            }
        }while(!Valid);

        return retDouble;
    }
    public static Boolean getYNConfirm(Scanner pipe, String prompt){
        Boolean retBool = null;
        String FloatRet;
        Boolean Valid = false;
        do{
            System.out.print("\n" +prompt + ": ");
            if(pipe.hasNext()){
                FloatRet = pipe.next();
                pipe.nextLine();
                if(FloatRet.toUpperCase().equals("Y")){
                    retBool = true;
                    Valid = true;
                }
                else if (FloatRet.toUpperCase().equals("N")){
                    retBool = false;
                    Valid = true;
                }
                else{
                    System.out.println("Invalid Input, please enter a valid value");
                    Valid = false;
                }
            }
            else{
                System.out.println("Invalid input, try again");
            }
        }while(!Valid);
        return retBool;
    }
}
