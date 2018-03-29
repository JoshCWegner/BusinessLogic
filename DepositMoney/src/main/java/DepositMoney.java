
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
public class DepositMoney {

    public static void main(String[] args) {
        double userInputDepositMoneyIntoAccount;
        String stringUserInputDepositMoneyIntoAccount = "";
        double accountBalance = 1234.56;
        double currentAccountBalance;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your ===CURRENT ACCOUNT BALANCE=== $" + accountBalance);

        do {
            System.out.println("How much would you like to deposit into your account, $100, $500, $1000");
            stringUserInputDepositMoneyIntoAccount = scanner.nextLine();
            userInputDepositMoneyIntoAccount = Double.parseDouble(stringUserInputDepositMoneyIntoAccount);

            if (userInputDepositMoneyIntoAccount > 100000) {
                System.out.println("The amount of money you enter in exceeds the maximum deposited amount");
                System.out.println("The ===MAXIMUM AMOUNT TO DEPOSIT IS $1,000,000");
                System.out.println("Please enter in a new dollar amount");
            }

        } while (userInputDepositMoneyIntoAccount > 1000000);

        currentAccountBalance = accountBalance + userInputDepositMoneyIntoAccount;
        System.out.println("===Thank you for your deposit===");
        System.out.println("===YOUR CURRENT ACCOUNT BALANCE=== $" + currentAccountBalance);
    }
}
