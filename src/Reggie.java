import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String StudentID = "";
        String MenuChoice = "";
        Boolean Continue = true;
        SSN = SafeInput.getRegExString(in,"Pleae enter your Social Security Number","^\\d{3}-\\d{2}-\\d{4}$");
        StudentID = SafeInput.getRegExString(in,"Please enter your UC Student ID number","^(M|m)\\d{5}$");

        do{
            MenuChoice = SafeInput.getRegExString(in,"Would you like to Open, Save, View, or Quit","^[O|o|S|s|V|v|Q|q]");
             switch (MenuChoice) {
                 case "s":
                 case "S":
                     SSN = SSN;
                     StudentID = StudentID;
                     break;
                 case "v":
                 case "V":
                     System.out.println("Your Social Security Number is: " + SSN + " and your UC Student ID is: " + StudentID);
                     break;
                 case "o":
                 case "O":
                     SSN = SafeInput.getRegExString(in,"Pleae enter your Social Security Number","^\\d{3}-\\d{2}-\\d{4}$");
                     StudentID = SafeInput.getRegExString(in,"Please enter your UC Student ID number","^(M|m)\\d{5}$");
                     MenuChoice = SafeInput.getRegExString(in,"Would you like to Open, Save, View, or Quit","^[O|o|S|s|V|v|Q|q]");
                     break;
                 case "q":
                 case "Q":
                     Continue = false;
                     break;
             }
        }while(Continue);
    }
}
