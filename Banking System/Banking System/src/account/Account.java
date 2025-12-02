package account;

public class Account {
    private String accountNumber;
    private int accountBalance = 0;

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        if (amount < 0){throw new IllegalArgumentException("Invalid ammount");}
        accountBalance += amount;
    }

    public void withdraw(int amount) {
        if (amount > accountBalance) throw new IllegalArgumentException("Insufficient funds");
        if (amount < 0) throw new IllegalArgumentException("Invalid amount");
        accountBalance -= amount;
    }
}
