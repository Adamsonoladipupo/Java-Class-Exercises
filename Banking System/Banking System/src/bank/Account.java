package bank;

import Execptions.LowAccountBalanceException;
import Execptions.NegativeAmountException;
import Execptions.WrongPasswordException;

public class Account {
    private String accountName;
    private int accountNumber;
    private int accountBalance = 0;
    private String password ;

    Account(){
    }
    Account(String password, String accountName){
        this.password = password;
        this.accountName = accountName;
    }

    public int createAccount(String password, String accountName) {
        this.password = password;
        this.accountName = accountName;
        ++accountNumber;
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new NegativeAmountException("Negative amount inputted");
        }
        accountBalance += amount;
    }


    public void withdraw(int amount, String inputPassword) {
        if(amount < 0){
            throw new NegativeAmountException("Negative amount inputted");
        }
        if (!inputPassword.equals(password)){
            throw new WrongPasswordException("Wrong password");
        }
        if(amount > accountBalance){
            throw new LowAccountBalanceException("withdraw amount is more than account balance, insufficient funds");
        }
        accountBalance -= amount;
    }

    //helper methods for validating user input


}
