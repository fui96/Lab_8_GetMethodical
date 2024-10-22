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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double Decimal = 0.0;
        Decimal = SafeInput.getDouble(in, "Please enter a decimal");
        System.out.println("The decimal you chose is " + Decimal);
    }
}
