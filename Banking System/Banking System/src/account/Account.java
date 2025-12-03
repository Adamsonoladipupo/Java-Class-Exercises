package account;

public class Account {
    private String accountNumber;
    private int accountBalance = 0;

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        validateNegativeInput(amount);
        accountBalance += amount;
    }


    public void withdraw(int amount) {
        validateNegativeInput(amount);
        ValidateLowerThanaccountBalance(amount);
        accountBalance -= amount;
    }

    // helper methods for validating user input
    public void validateNegativeInput(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Invalid amount");
        }
    }
    public void ValidateLowerThanaccountBalance(int amount){
        if (amount > accountBalance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
}
