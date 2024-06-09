package PrincipiileOOP.Ex6bankingapp;

import java.util.Objects;

public class Client {

    private String firstName;
    private String lastName;

    private BankAccount[] accounts;

    private int numberOfAccounts;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[100];
    }

    public boolean addAccount(BankAccount account){
        this.accounts[numberOfAccounts] = account;
        this.numberOfAccounts++;
        return true;

    }

    public void listAccounts(){
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public void deposit (int amount, String accountNumber){
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().toString().equals(accountNumber)) {
                accounts[i].deposit(amount);
                //accounts[i].setBalance(accounts[i].getBalance()+amount);
                return;
            }
        }
        System.out.println("Contul" + accountNumber + " nu a fost gasit");
    }

    public void withdraw (int amount, String accountNumber){
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().toString().equals(accountNumber)) {
                accounts[i].withdraw(amount);
                //accounts[i].setBalance(accounts[i].getBalance()+amount);
                return;
            }
        }
        System.out.println("Contul" + accountNumber + " nu a fost gasit");
    }

    public void checkAccountDetails(String accountNumber){
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().toString().equals(accountNumber)) {
                System.out.println(accounts[i].toString());
                return;
            }
        }
        System.out.println("Contul" + accountNumber + " nu a fost gasit");
    }
}


