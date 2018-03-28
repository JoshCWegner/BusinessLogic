
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
public class NewUser {

    public static void main(String[] args) {
        String userInputFirstName;
        String userInputLastName;
        String userInputAddressStreetNumberAndName;
        String userInputAddressCity;
        String userInputAddressState;
        int userInputAddressZipCode;
        String stringUserInputAddressZipCode = "";
        String userInputEmailAddress;
        String userNameToTest = "Josh123";
        String userInputUserName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter in your First Name");
        userInputFirstName = scanner.nextLine();

        System.out.println("Please enter in your Last Name.");
        userInputLastName = scanner.nextLine();

        System.out.println("Please enter in your Street Address");
        userInputAddressStreetNumberAndName = scanner.nextLine();

        System.out.println("Please enter in your City");
        userInputAddressCity = scanner.nextLine();

        System.out.println("Please enter in your State");
        userInputAddressState = scanner.nextLine().toUpperCase();

        System.out.println("Please enter in your Zip Code");
        stringUserInputAddressZipCode = scanner.nextLine();
        userInputAddressZipCode = Integer.parseInt(stringUserInputAddressZipCode);

        System.out.println("Please enter in your Email Address");
        userInputEmailAddress = scanner.nextLine().toLowerCase();

        do {
            System.out.println("Please enter in your Username.");
            userInputUserName = scanner.nextLine();

            if (userInputUserName.equals(userNameToTest)) {
                System.out.println("===The Username you entered is already on file, please enter in a new Username.===");
            }

        } while (userInputUserName.equals(userNameToTest));

        System.out.println("===NAME/ADDRESS===");
        System.out.println(userInputFirstName + " " + userInputLastName);
        System.out.println(userInputAddressStreetNumberAndName);
        System.out.println(userInputAddressCity + "," + userInputAddressState + " " + userInputAddressZipCode);
        System.out.println("===EMAIL ADDRESS===");
        System.out.println(userInputEmailAddress);
        System.out.println("===USERNAME===");
        System.out.println(userInputUserName);
    }
}
