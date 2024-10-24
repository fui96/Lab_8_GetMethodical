import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FavInt = 0;
        Double FavDouble = 0.0;
        FavInt = SafeInput.getInt(in,"Please enter your favorite integer");
        FavDouble = SafeInput.getDouble(in,"Please enter your favorite double");
        System.out.println("Your favorite integer is  " + FavInt +" and your favorite double is  " + FavDouble);

    }
}
