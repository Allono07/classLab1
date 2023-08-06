package ClassLab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingsAccountManager {
    public static void main(String[] args) {
        List<SavingsAccount> savingsAccountsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Savings Account #" + i);
            // ... Input prompts for attributes

            SavingsAccount savingsAccount = new SavingsAccount();

            savingsAccountsList.add(savingsAccount);
            System.out.println("Savings Account #" + i + " created successfully!\n");
        }

        System.out.println("Created Savings Account Records:");

        for (SavingsAccount savingsAccount : savingsAccountsList) {

        }

        System.out.print("Enter an Account Number to search: ");
        String searchAccountNumber = scanner.nextLine();

        boolean found = false;
        for (SavingsAccount savingsAccount : savingsAccountsList) {
            if (savingsAccount.getAccountNumber().equals(searchAccountNumber)) {
                // ... Display the found account's details
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Savings Account with Account Number " + searchAccountNumber + " not found.");
        }

        scanner.close();
    }
}


