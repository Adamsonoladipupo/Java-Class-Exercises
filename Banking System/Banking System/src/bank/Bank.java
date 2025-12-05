package bank;

public class Bank {
    private int accounts = 0;

    public int numberOfAccount() {
        return accounts;
    }

    public void createAccount(String name, int accountNumber, String password) {
        accounts++;
    }
}
