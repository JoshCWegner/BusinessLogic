
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
public class Password {

    public static void main(String[] args) {
        String userInputPasswordForUserName;
        int userInputPasswordForUserNameToUpperCase = 0;
        int userInputPasswordForUserNameToLowerCase = 0;
        int userInputPasswordForUserNameIsNumber = 0;
        int userInputPasswordForUserNameSpecialCharacter = 0;
        String userInputPasswordForUserNameToVerifyPassword;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter in your password.");
            System.out.println("It needs to be at least 6 Characters");
            System.out.println("With at least One Uppercase Letter and One Lowercase Letter");
            System.out.println("Along with at least one Number and at least one Special Character(#, $ % &, !).");
            userInputPasswordForUserName = scanner.nextLine();
            System.out.println("Please enter in your password again for verification purposes");
            userInputPasswordForUserNameToVerifyPassword = scanner.nextLine();
            char[] userInputPasswordForUserNameToCharArray = userInputPasswordForUserName.toCharArray();
            for (int i = 0; i < userInputPasswordForUserName.length(); i++) {
                if (Character.isUpperCase(userInputPasswordForUserNameToCharArray[i])) {
                    userInputPasswordForUserNameToUpperCase++;
                } else if (Character.isLowerCase(userInputPasswordForUserNameToCharArray[i])) {
                    userInputPasswordForUserNameToLowerCase++;
                } else if (Character.isDigit(userInputPasswordForUserNameToCharArray[i])) {
                    userInputPasswordForUserNameIsNumber++;
                } else {
                    userInputPasswordForUserNameSpecialCharacter++;
                }
            }
            if (userInputPasswordForUserName.length() <= 5
                    || userInputPasswordForUserNameIsNumber == 0
                    || userInputPasswordForUserNameSpecialCharacter == 0
                    || userInputPasswordForUserNameToLowerCase == 0
                    || userInputPasswordForUserNameToUpperCase == 0) {
                System.out.println("===INVALID PASSWORD===");
            } else if (!userInputPasswordForUserName.equals(userInputPasswordForUserNameToVerifyPassword)) {
                System.out.println("===INVALID PASSWORD===");
                System.out.println("===YOUR PASSWORDS DO NOT MATCH===");
            }
        } while (userInputPasswordForUserNameIsNumber == 0
                || userInputPasswordForUserNameToLowerCase == 0
                || userInputPasswordForUserNameToUpperCase == 0
                || userInputPasswordForUserNameSpecialCharacter == 0
                || userInputPasswordForUserName.length() < 5
                || !userInputPasswordForUserName.equals(userInputPasswordForUserNameToVerifyPassword));
        System.out.println("===VALID PASSWORD===");
    }
}
