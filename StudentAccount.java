
package PrincipiileOOP.Ex6bankingapp;

public class StudentAccount extends BankAccount{

    private int maxDepositAmount;

    public StudentAccount(String accountNumber, int maxDepositAmount) {
        super(accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public int getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void setMaxDepositAmount(int maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance() ){
            System.out.println("Fonduri insuficiente");
        } else {
            setBalance(getBalance()-amount);
        }
    }

    @Override

    public void deposit(int amount) throws OperationNotSupportedException {
        if (amount > maxDepositAmount ){
            throw new OperationNotSupportedException("Nu poti depune mai mult decat "+ maxDepositAmount);
        } else {
            setBalance(getBalance()+amount);
        }
    }


    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                "balance=" + getBalance() +
                "acccount number=" + getAccountNumber() +
                '}';
    }
}
