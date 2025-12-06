package bank;


import java.util.ArrayList;

public class Bank {
    private String name = "RoowahBank";
    private ArrayList <Account> accounts = new ArrayList<>();

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

    public void createAccount(String password, String accountName) {
        Account account = new Account(password, accountName);
        accounts.add(account);
    }

    public void transfer(Account fromAccount, Account toAccount, int amount, String password) {
        fromAccount.withdraw(amount, password);
        toAccount.deposit(amount);
    }

//    public int findAccount(Account findAccount) {
//        for (Account acc : accounts){
//            if(Object findAccount : acc){
//                return findAccount;
//            }
//        }
//        return ;
//    }
}
