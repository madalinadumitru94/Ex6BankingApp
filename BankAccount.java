package PrincipiileOOP.Ex6bankingapp;

public abstract class BankAccount {

    private int balance;

    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public abstract void withdraw(int amount);
    public abstract void deposit(int amount) throws OperationNotSupportedException;
}