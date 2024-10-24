import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String UserName = "";
        UserName = SafeInput.getNonZeroLenString(in,"Please enter your user name");
        System.out.println("Your username is " + UserName);
    }
}
