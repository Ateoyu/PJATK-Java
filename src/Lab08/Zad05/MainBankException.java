package Lab08.Zad05;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }
        Account account = createNewAccount();
        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if (!shouldWithdrawMoney) {
            endProgram();
        }
        System.out.println("How much do you want to withdraw?");
        try {
            double amount = getAmount();
            try {
                account.withdraw(amount);
            } catch (InsufficientResourcesException e) {
                System.out.println(e.getMessage());
            }
            System.out.printf("Thank you for using our service. Your current balance is %.2f $", account.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Account createNewAccount() throws IllegalArgumentException {
        try {
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            if (!isAlphabetic(name)) {
                throw new IllegalArgumentException("Name should contain only alphabetic characters.");
            } else if (name.isBlank()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            double initialAmount;
                System.out.println("How much do you want to put down to your account?");
                initialAmount = getAmount();

            return new Account(name, initialAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return createNewAccount();
        }
    }

    private static boolean isAlphabetic(String name) {
        char[] nameChars = name.toCharArray();
        for (char ch : nameChars) {
            if (!(ch >= 65 && ch <= 90) && !(ch >= 97 && ch <= 122)) { //ascii solution
                return false;
            }
        }
        return true;
    }

    private static double getAmount() throws IllegalArgumentException {
        if (!isAlphabetic(scanner.nextLine())) {
            double amountToPutDown = Double.parseDouble(scanner.nextLine());
            if (amountToPutDown < 0) {
                throw new IllegalArgumentException("Amount should be a positive number.");
            } else {
                return amountToPutDown;
            }
        } else {
            throw new IllegalArgumentException("Amount should be a number.");
        }
    }

    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }

    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("yes")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("no")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }
}
