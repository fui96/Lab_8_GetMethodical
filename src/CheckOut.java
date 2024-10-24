import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean Cont = true;
        Double Total = 0.0;
        do{
            Double Item = 0.0;
            Item = SafeInput.getRangedDouble(in,"Please enter the price of your item",.50,10.00);
            Total = Total + Item;
            Cont = SafeInput.getYNConfirm(in,"Do you want to continue? (Y/N)");
        }while(Cont);
        System.out.printf("Your Total is %.2f\n", Total );
        System.out.println("Thanks for shopping at the 10 Dollar Store!!");
    }
}
