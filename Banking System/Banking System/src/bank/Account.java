package bank;

import Execptions.InvalidNegativeAmountException;
import Execptions.InvalidPasswordException;

public class Account {
    private String accountNumber;
    private int accountBalance = 0;
    private String password = "password123";

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        validateNegativeInput(amount);
        accountBalance += amount;
    }


    public void withdraw(int amount, String inputPassword) {
        validatingIncorrectPassword(inputPassword);
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
        if (amount > accountBalance) throw new InvalidNegativeAmountException("Insufficient funds");

    }
    public void validatingIncorrectPassword(String inputPassword){
        if (!inputPassword.equals(password)){
            throw new InvalidPasswordException("Incorrect password");
        }
    }
}
