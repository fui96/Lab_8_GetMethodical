import java.util.Scanner;

public class DevTest {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter first name ");
        lastName = SafeInput.getNonZeroLenString(in, "Enter last name ");
        System.out.println("\n Your full name is " + firstName + " " + lastName);
    }*/

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Age = 0;
        Age = SafeInput.getInt(in, "Please enter your age");
        System.out.println("You are "+Age +" years old");
    }*/
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double Decimal = 0.0;
        Decimal = SafeInput.getDouble(in, "Please enter a decimal");
        System.out.println("The decimal you chose is " + Decimal);
    }*/
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int within = 0;
        within = SafeInput.getRangedInt(in, "Please enter a number between 1 and 10", 1,10);
        System.out.println("Your number between 1 and 10 is " + within);

   }*/
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double within = 0.0;
        within = SafeInput.getRangedDouble(in,"Please enter a decimal between 0 and 1", 0,1);
        System.out.println("The decimal you chose is " + within);
    }*/
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean Cont = null;
        Cont = SafeInput.getYNConfirm(in, "Would you like to continue? [y/n]");
        System.out.println("You have chosen continue "+ Cont);
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PhoneNumber = "";
        PhoneNumber = SafeInput.getRegExString(in,"Please enter a phone number","^\\d{3}-\\d{3}-\\d{4}");
        System.out.println("the phone number is: " + PhoneNumber);


    }
}
