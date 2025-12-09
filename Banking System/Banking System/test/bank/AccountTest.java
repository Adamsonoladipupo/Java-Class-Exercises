package bank;

import Execptions.LowAccountBalanceException;
import Execptions.NegativeAmountException;
import Execptions.WrongPasswordException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach
    public void setUp(){
        account = new Account();
    }

    @Test
    public void create_new_account(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
    }

    @Test
    public void account_balance_is_zero(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        assertEquals(0, account.getAccountBalance());
    }

    @Test
    public void deposit5h_int0_the_account_test(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        account.deposit(500, account.getAccountNumber());
        assertEquals(500, account.getAccountBalance());
    }

    @Test
    public void deposit_500_and_300_and_get_800_balance(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        account.deposit(500, account.getAccountNumber());
        assertEquals(500, account.getAccountBalance());
        account.deposit(300, account.getAccountNumber());
        assertEquals(800, account.getAccountBalance());
    }

    @Test
    public void deposit_negative_amount_throw_invalid_amount_test(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        assertThrows(NegativeAmountException.class, () -> account.deposit(-700,account.getAccountNumber()));
    }


    @Test
    public void deposit_700_and_withdraw_500_get_a_balance_of_200_test(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        account.deposit(700, account.getAccountNumber());
        assertEquals(700, account.getAccountBalance());
        account.withdraw(500, "password123");
        assertEquals(200, account.getAccountBalance());
    }

    @Test
    public void deposite_500_and_withdraw_200_with_a_wrong_password_test(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        account.deposit(500, account.getAccountNumber());
        assertEquals(500, account.getAccountBalance());
        assertThrows(WrongPasswordException.class, () -> account.withdraw(200, "password"));
    }


    @Test
    public void withdraw_negative_amount_to_throw_error_test(){

        account.createAccount("password123", "Wahab");
        account.deposit(100, account.getAccountNumber());
        assertEquals(100, account.getAccountBalance());
        account.withdraw(50, "password123");
        assertEquals(50, account.getAccountBalance());

    }

    @Test
    public void deposit_500_withdraw_600_t0_throw_error(){
        account.createAccount("password123", "Wahab");
        assertEquals("1", account.getAccountNumber());
        account.deposit(500, account.getAccountNumber());
        assertEquals(500, account.getAccountBalance());
        assertThrows(LowAccountBalanceException.class, () -> account.withdraw(600, "password123"));
        assertEquals(500, account.getAccountBalance());
    }

    @Test
    public void deposit_1000_withraw_200_then_withdraw_600_accountBalance_of_200_test(){
        account.createAccount("password123", "Wahab");
        account.deposit(1000, account.getAccountNumber());
        assertEquals(1000, account.getAccountBalance());
        account.withdraw(200, "password123");
        assertEquals(800, account.getAccountBalance());
        account.withdraw(600, "password123");
        assertEquals(200, account.getAccountBalance());

    }



}
