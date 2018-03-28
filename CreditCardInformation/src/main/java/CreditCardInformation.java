
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
public class CreditCardInformation {

    public static void main(String[] args) {
        String userEnterInCreditCardNumber;
        int userEnterInCreidtCardNumberExpirationDateMonth;
        String stringUserEnterInCreidtCardNumberExpirationDateMonth = "";
        int userEnterInCreidtCardNumberExpirationDateYear;
        String stringUserEnterInCreidtCardNumberExpirationDateYear = "";
        int userUserEnterInCreidtCardCVVCode;
        String stringUserUserEnterInCreidtCardCVVCode = "";
        int accountNumberForUserAfterCreditCardInfoValid;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("Please enter in your 16-Digit Credit Card Number.");
            userEnterInCreditCardNumber = scanner.nextLine();

            System.out.println("Please enter in the 2-digit Month");
            stringUserEnterInCreidtCardNumberExpirationDateMonth = scanner.nextLine();
            userEnterInCreidtCardNumberExpirationDateMonth = Integer.parseInt(stringUserEnterInCreidtCardNumberExpirationDateMonth);

            System.out.println("Please enter in the 2-digit Year");
            stringUserEnterInCreidtCardNumberExpirationDateYear = scanner.nextLine();
            userEnterInCreidtCardNumberExpirationDateYear = Integer.parseInt(stringUserEnterInCreidtCardNumberExpirationDateYear);

            System.out.println("Please enter in the 3-digit CVV Code that is on the back of your Credit Card");
            stringUserUserEnterInCreidtCardCVVCode = scanner.nextLine();
            userUserEnterInCreidtCardCVVCode = Integer.parseInt(stringUserUserEnterInCreidtCardCVVCode);

            if (userEnterInCreditCardNumber.length() != 16
                    || userEnterInCreidtCardNumberExpirationDateMonth > 12
                    || userEnterInCreidtCardNumberExpirationDateYear < 20) {
                System.out.println("===ERROR=== CREDIT CARD INFORMATION NOT-VALID");
                System.out.println("Please review your Credit Card Information below before resubmitting this it");
                System.out.println("Credit Card Number: " + userEnterInCreditCardNumber);
                System.out.println("Credit Card Expiration Date: " + stringUserEnterInCreidtCardNumberExpirationDateMonth + "/" + stringUserEnterInCreidtCardNumberExpirationDateYear);
                System.out.println("CVV Code: " + stringUserUserEnterInCreidtCardCVVCode);
            }
        } while (userEnterInCreditCardNumber.length() != 16 || userEnterInCreidtCardNumberExpirationDateMonth > 12
                || userEnterInCreidtCardNumberExpirationDateYear < 20 || stringUserUserEnterInCreidtCardCVVCode.length() != 3);

        System.out.println("===ALL OF YOUR CREDIT CARD INFORMATION HAS BEEN VERIFIED===");
        accountNumberForUserAfterCreditCardInfoValid = random.nextInt(10000) + 99999;
        System.out.println("Below is your Account Number");
        System.out.println("Account Number: " + accountNumberForUserAfterCreditCardInfoValid);
    }

}
