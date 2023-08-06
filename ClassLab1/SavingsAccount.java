package ClassLab1;

public class SavingsAccount extends BankAccount {
    double interestRate;
    boolean isInterestCompoundedMonthly;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, String accountType,
                          double interestRate, boolean isInterestCompoundedMonthly) {
        super(accountNumber, accountHolderName, balance, accountType);
        this.interestRate = interestRate;
        this.isInterestCompoundedMonthly = isInterestCompoundedMonthly;
    }

    public SavingsAccount() {

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isInterestCompoundedMonthly() {
        return isInterestCompoundedMonthly;
    }

    public void setInterestCompoundedMonthly(boolean interestCompoundedMonthly) {
        isInterestCompoundedMonthly = interestCompoundedMonthly;
    }
}
