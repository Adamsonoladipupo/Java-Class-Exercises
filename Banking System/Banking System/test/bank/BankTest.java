package bank;

import Execptions.NegativeAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLSyntaxErrorException;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;

    @BeforeEach
    public void setUp(){
        bank = new Bank();

    }

    @Test
    public void bank_does_not_have_any_account_test(){
        assertEquals(0, bank.getCountAccounts());
    }

    @Test
    public void create_a_new_account_and_increase_number_of_created_acount_by_1_using_account_method_test(){
        Account account1 = new Account();
        account1.createAccount("password123", "wahab");
        bank.addAccount(account1);
        assertEquals(1, bank.getCountAccounts());
    }

    @Test
    public void create_two_new_account_and_increase_number_of_created_account_bank_method_test(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.createAccount("password123", "wahab");
        account2.createAccount("password1", "ola");
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getCountAccounts());
    }

    @Test
    public void create_account_and_deposit_100_into_the_account(){
        Account account1 = new Account();
        account1.createAccount("password123", "wahab");
        bank.addAccount(account1);
        assertEquals(1, bank.getCountAccounts());
        account1.deposit(100, account1.getAccountNumber());
        assertEquals(100, account1.getAccountBalance());
    }

    @Test
    public void deposit_negative_account_to_account1_test(){
        Account account1 = new Account();
        account1.createAccount("password123", "wahab");
        bank.addAccount(account1);
        assertEquals(1, bank.getCountAccounts());
        assertThrows(NegativeAmountException.class, () -> account1.deposit(-100, account1.getAccountNumber()));
        assertEquals(0, account1.getAccountBalance());
    }

    @Test
    public void create_and_deposite_200_and_300_to_ac0unt1_and_account2_test(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.createAccount("password123", "wahab");
        account2.createAccount("password1", "ola");
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getCountAccounts());
        account1.deposit(200, account1.getAccountNumber());
        account2.deposit(300, account2.getAccountNumber());
        assertEquals(200, account1.getAccountBalance());
        assertEquals(300, account2.getAccountBalance());
    }

    @Test
    public void checking_if_an_account_exit_test(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.createAccount("password123", "wahab");
        account2.createAccount("password1", "ola");
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getCountAccounts());
        bank.findAccountByAccountNumber("1");
        assertTrue(bank.isCheckAccountNumber("1"));
    }

    @Test
    public void transfer_200_from_account1_to_account_2_test(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.createAccount("password123", "wahab");
        account2.createAccount("password1", "ola");
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getCountAccounts());
        account1.deposit(500, account1.getAccountNumber());
        assertEquals(500, account1.getAccountBalance());
        bank.transfer(account1,"2",200,"password123");
        assertEquals(300, account1.getAccountBalance());
        assertEquals(200, account2.getAccountBalance());
    }

    @Test
    public void transfer_to_an_account_that_does_not_exit_test(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.createAccount("password123", "wahab");
        account2.createAccount("password1", "ola");
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getCountAccounts());
        account1.deposit(500, account1.getAccountNumber());
        assertEquals(500, account1.getAccountBalance());
        bank.transfer(account1,"3",200,"password123");
        assertEquals(300, account1.getAccountBalance());
        assertEquals(200, account2.getAccountBalance());
    }





}
