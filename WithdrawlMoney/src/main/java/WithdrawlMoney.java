
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
public class WithdrawlMoney {

    public static void main(String[] args) {
        String userInputAddressStreetNumberAndNameCurrentlyOnFile = "5444 Logan Ave So.";
        String userInputAddressCity = "Minneapolis";
        String userInputAddressState = "MN";
        int userInputAddressZipCode = 55419;
        String userInputEmailAddress = "wegnerjosh@gmail.com";
        double accountBalance = 1234.56;
        double currentAccountBalance;
        double withdrawlAmountFromUser;
        String stringWithdrawlAmountFromUser = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===ACCOUNT BALANCE=== " + accountBalance);
            System.out.println();

            System.out.println("How much do you want to Withdrawl from your Account");
            System.out.println("Enter in the Withdrawl Amount below");
            stringWithdrawlAmountFromUser = scanner.nextLine();
            withdrawlAmountFromUser = Double.parseDouble(stringWithdrawlAmountFromUser);

            currentAccountBalance = accountBalance - withdrawlAmountFromUser;

            if (currentAccountBalance < 0) {
                System.out.println("===ERROR===");
                System.out.println("You are currently trying to withdrawl more money that is in your account");
            }

        } while (currentAccountBalance < 0);

        System.out.println("The Withdrawl of $" + withdrawlAmountFromUser + " is currently processing.");
        System.out.println("It may take up to 6 weeks for you to receive the amount of $" + withdrawlAmountFromUser);
        System.out.println("To the Address below that we currently have on file");
        System.out.println("===CURRENT ACCOUNT BALANCE=== " + currentAccountBalance);
        System.out.println("Once your withdrawl has been successfully processed you will recieve an email at the email address that we "
                + " currently have on file which is " + userInputEmailAddress);
        System.out.println("You will receive a check within 5-7 Business Days at the address below that we currently have on file.");
        System.out.println(userInputAddressStreetNumberAndNameCurrentlyOnFile);
        System.out.println(userInputAddressCity + ", " + userInputAddressState + " " + userInputAddressZipCode);
    }

}
