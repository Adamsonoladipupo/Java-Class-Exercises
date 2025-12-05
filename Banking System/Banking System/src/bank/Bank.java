package bank;

import Execptions.InvalidNegativeAmountException;
import Execptions.InvalidPasswordException;

public class Bank {
    private int accounts = 0;
    private String accountNumber;
    private String password;
    private String accountName;
    private int accountBalance;

    Bank(){

    }
    Bank(String accountName, String accountNumber, String password){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.password = password;
    }


    public int numberOfAccount() {
        return accounts;
    }

    public void createAccount(String name, String accountNumber, String password) {
        accounts++;
    }

    public void deposit(int amount, String accountNumber) {
        validateNegativeInput(amount);
        accountBalance += amount;
    }

    public int getAccountBalance() {
        return accountBalance;

    }

    public void withdraw(int amount, String password) {
        validatingIncorrectPassword(password);
        accountBalance -= amount;
    }

    // helper methods for validating user input
    public void validateNegativeInput(int amount){
        if (amount < 0){
            throw new InvalidNegativeAmountException("Invalid amount");
        }
    }
    public void ValidateLowerThanaccountBalance(int amount){
        if (amount > accountBalance) throw new InvalidNegativeAmountException("Insufficient funds");

    }
    public void validatingIncorrectPassword(String inputPassword){
        if (!inputPassword.equals(this.password)){
            throw new InvalidPasswordException("Incorrect password");
        }
    }

}
