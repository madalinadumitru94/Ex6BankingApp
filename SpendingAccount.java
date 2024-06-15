package PrincipiileOOP.Ex6bankingapp;

public class SpendingAccount extends BankAccount {

    private int maxWithdrawalAmount;

    public SpendingAccount(String accountNumber, int maxWithdrawalAmount) {
        super(accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(int maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public void withdraw(int amount) throws OperationNotSupportedException {
        if (amount > getBalance() + maxWithdrawalAmount){
            throw new OperationNotSupportedException("Nu poti retrage mai mult decat "+ maxWithdrawalAmount);
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void deposit(int amount) {
        setBalance(getBalance()+amount);
    }


    @Override
    public String toString() {
        return "SpendingAccount{" +
                "maxWithdrawalAmount=" + maxWithdrawalAmount +
                "balance=" + getBalance() +
                "acccount number=" + getAccountNumber() +
                '}';
    }
}