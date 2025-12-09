package bank;

import Execptions.LowAccountBalanceException;
import Execptions.NegativeAmountException;
import Execptions.WrongPasswordException;

public class Account {
    private String accountName;
    private int genAccountNumber = 0;
    private String accountNumber;
    private int accountBalance;
    private String password ;

    Account(){
    }
    Account(String password, String accountName, String accountNumber){
        this.password = password;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

//    private String generateAccountNumber(int number){
//        String accNumber = String.valueOf(number+1);
//        return accNumber;
//    }

    public void createAccount(String password, String accountName) {
        this.password = password;
        this.accountName = accountName;
        this.accountNumber = String.valueOf(genAccountNumber+1);
        Account newAccount = new Account(password, accountName, accountNumber);
        genAccountNumber++;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount, String accountNumber) {
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
