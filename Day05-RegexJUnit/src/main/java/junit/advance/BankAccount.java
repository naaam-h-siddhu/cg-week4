package junit.advance;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(balance>= amount){
            balance-=amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }
}
