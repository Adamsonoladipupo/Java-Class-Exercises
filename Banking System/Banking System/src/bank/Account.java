package bank;

import Execptions.LowAccountBalanceException;
import Execptions.NegativeAmountException;
import Execptions.WrongPasswordException;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int accountNumber;
    private int accountBalance = 0;
    private String password ;

    ArrayList <Object> accountList = new ArrayList<>();

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
        accountList.add(accountNumber);
        return accountNumber;
    }

    public int getNumberOfAccountCreated(){
        return accountList.size();
    }

    public int getAccountBalance(int accountNumber) {
        return accountBalance;
    }

    public void deposit(int amount, int accountNumber) {
        if(amount < 0){
            throw new NegativeAmountException("Negative amount inputted");
        }
        accountBalance += amount;
    }


    public void withdraw(int accountNumber, int amount, String inputPassword) {
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
