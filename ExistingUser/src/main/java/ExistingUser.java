
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author softwareguild
 */
public class ExistingUser {

    public static void main(String[] args) {
        String userInputUserName;
        String userInputPasswordForUserName;
        double accountBalance = 5494.54;
        String userNameToTest = "Josh123";
        String userInputPasswordToTest = "Summer$1";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter in your UserName");
            userInputUserName = scanner.nextLine();

            System.out.println("Enter in your Password");
            userInputPasswordForUserName = scanner.nextLine();

            if (!userInputUserName.equals(userNameToTest)
                    && !userInputPasswordForUserName.equals(userInputPasswordToTest)) {
                System.out.println("Your ===USERNAME===" + userInputUserName + "===INCORRECT===");
                System.out.println("Your ===PASSWORD===" + userInputPasswordForUserName + "===INCORRECT===");
                System.out.println("===Please review your ===USERNAME/PASSWORD=== and login again===");
            }

        } while (!userInputUserName.equals(userNameToTest)
                && !userInputPasswordForUserName.equals(userInputPasswordToTest));

        System.out.println("===WELCOME===");
        System.out.println("===CURRENT ACCOUNT BALANCE $" + accountBalance + "===");
    }
}
