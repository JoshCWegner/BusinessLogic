
import java.util.Random;
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
public class IncorrectUsernameOrPassword {

    public static void main(String[] args) {
        String userInputUserName;
        String userInputPassword;
        String userNameToTest = "Josh123";
        String userInputPasswordToTest = "Summer$1";
        int userInputAccountNumber;
        String stringAccountNumber = "";
        int userInputAccountNumberAccountNumberTest = 456297;
        String userInputEmailAddress;
        String userInputEmailAddressToTest = "wegnerjosh@gmail.com";
        String action;
        int temporaryPassword = 0;
        String stringTemporaryPassword = "";
        String stringTemporaryPasswordToTest = "";
        int temporaryPasswordToTest = 0;
        double currentAccountBalance = 10328.37;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter in your Username");
        userInputUserName = scanner.nextLine();

        System.out.println("Enter your Password");
        userInputPassword = scanner.nextLine();

        if (!userInputUserName.equals(userNameToTest)) {
            System.out.println("===YOUR USERNAME IS INCORRECT===");

            System.out.println("Please enter in your Account Number");
            stringAccountNumber = scanner.nextLine();
            userInputAccountNumber = Integer.parseInt(stringAccountNumber);

            System.out.println("Please enter in your Email Address");
            userInputEmailAddress = scanner.nextLine();

            if (userInputAccountNumber == userInputAccountNumberAccountNumberTest
                    && userInputEmailAddress.equals(userInputEmailAddressToTest)) {
                System.out.println("===YOUR USERNAME=== " + userNameToTest);

                do {
                    System.out.println("Please enter in your Username");
                    userInputUserName = scanner.nextLine();

                    System.out.println("Please enter in you Password");
                    userInputPasswordToTest = scanner.nextLine();
                } while (!userInputUserName.equals(userInputUserName)
                        || !userInputPassword.equals(userInputPasswordToTest));

            } else {
                System.out.println("===NONE OF THE INFORMAITON YOU ENTERED IS CURRENTLY ON FILE===");
            }
        } else if (!userInputPassword.equals(userInputPasswordToTest)) {
            System.out.println("===YOUR PASSWORD IS INCORRECT===");

            System.out.println("Please enter in your Username");
            userInputUserName = scanner.nextLine();

            System.out.println("Please enter in your Account Number");
            stringAccountNumber = scanner.nextLine();
            userInputAccountNumber = Integer.parseInt(stringAccountNumber);

            System.out.println("Please enter in your Email Address");
            userInputEmailAddress = scanner.nextLine();

            if (userInputUserName.equals(userNameToTest)
                    && userInputAccountNumber == userInputAccountNumberAccountNumberTest
                    && userInputEmailAddress.equals(userInputEmailAddressToTest)) {
                temporaryPassword = random.nextInt(10000) + 99999;
                System.out.println("===TEMPORARY PASSWORD=== " + temporaryPassword);

                do {
                    System.out.println("Please enter in your Username");
                    userInputUserName = scanner.nextLine();

                    System.out.println("Enter your Temporary Password");
                    stringTemporaryPasswordToTest = scanner.nextLine();
                    temporaryPasswordToTest = Integer.parseInt(stringTemporaryPasswordToTest);

                    if (!userInputUserName.equals(userNameToTest)
                            && temporaryPassword != temporaryPasswordToTest) {
                        System.out.println("===YOUR USERNAME AND TEMPOARY PASSWORD DO NOT MATCH WHAT WE HAVE ON FILE===");
                        System.out.println("===KINDLY REVIEW YOUR USERNAME AND TEMPORARY PASSWORD AND RE-LOGIN===");
                    }

                } while (!userInputUserName.equals(userNameToTest)
                        && temporaryPassword == temporaryPasswordToTest);
            } else {
                System.out.println("===NONE OF THE INFORMAITON YOU ENTERED IS CURRENTLY ON FILE===");
            }
        }

        if (userInputUserName.equals(userNameToTest)) {
            if (temporaryPassword == temporaryPasswordToTest
                    || userInputPassword.equals(userInputPasswordToTest)) {
                System.out.println("===WELCOME===");
                System.out.println("===YOUR CURRENT ACCOUNT BALANCE=== $" + currentAccountBalance);
//===CALL PASSWORD METHOD HERE===

            }

        }
    }
}
