package bank;


import java.util.ArrayList;

public class Bank {
    private String name = "RoowahBank";
    private ArrayList <Account> accounts = new ArrayList<>();
    private Account account;

    Bank (){

    }
    Bank(String name){
        this.name = name;
    }

    public int getCountAccounts() {
        return accounts.size();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void createAccount(String password, String accountName, String accountNumber) {
        Account account = new Account(password, accountName, accountNumber);
        accounts.add(account);
    }

    public boolean isCheckAccountNumber(String accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return true;
            }
        }
        return false;
    }

    public Account findAccountByAccountNumber(String accountNumber) {
        for (Account account : accounts){
            return account;
        }
        return null;
    }

    public void transfer(Account fromAccount, String toAccount, int amount, String password) {
        fromAccount.withdraw(amount, password);
        if (!isCheckAccountNumber(toAccount)){
            throw new IllegalArgumentException("Sorry account does not exit");
        }
        findAccountByAccountNumber(toAccount).deposit(amount, toAccount);

    }

}
