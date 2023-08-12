package ClassLab1;

public class SavingsAccount extends BankAccount {
    double interestRate;
    boolean isInterestCompoundedMonthly;




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
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
