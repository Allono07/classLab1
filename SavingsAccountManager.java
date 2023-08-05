import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingsAccountManager {
    public static void main(String[] args) {

        List<SavingsAccount> savingsAccountsList = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Savings Account #" + i);
            System.out.print("Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Account Holder Name: ");
            String accountHolderName = scanner.nextLine();

            System.out.print("Balance: ");
            double balance = Double.parseDouble(scanner.nextLine());

            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();

            System.out.print("Interest Rate: ");
            double interestRate = Double.parseDouble(scanner.nextLine());

            System.out.print("Is Interest Compounded Monthly (true/false): ");
            boolean isInterestCompoundedMonthly = Boolean.parseBoolean(scanner.nextLine());


            SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolderName, balance, accountType,
                    interestRate, isInterestCompoundedMonthly);


            savingsAccountsList.add(savingsAccount);
            System.out.println("Savings Account #" + i + " created successfully!");
            System.out.println();
        }


        System.out.println("Created Savings Account Records:");
        for (SavingsAccount savingsAccount : savingsAccountsList) {
            System.out.println("Account Number: " + savingsAccount.getAccountNumber());
            System.out.println("Account Holder Name: " + savingsAccount.getAccountHolderName());
            System.out.println("Balance: " + savingsAccount.getBalance());
            System.out.println("Account Type: " + savingsAccount.getAccountType());
            System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
            System.out.println("Is Interest Compounded Monthly: " + savingsAccount.isInterestCompoundedMonthly());
            System.out.println("--------------------------------------------");
        }
    }
}

