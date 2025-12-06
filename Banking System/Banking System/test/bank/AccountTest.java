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
        assertEquals(1, account.createAccount("password123", "Wahab"));
    }

    @Test
    public void account_balance_is_zero(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        assertEquals(0, account.getAccountBalance(1));
    }

    @Test
    public void deposit5h_int0_the_account_test(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        account.deposit(500, 1);
        assertEquals(500, account.getAccountBalance(1));
    }

    @Test
    public void deposit_500_and_300_and_get_800_balance(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        account.deposit(500, 1);
        assertEquals(500, account.getAccountBalance(1));
        account.deposit(300, 1);
        assertEquals(800, account.getAccountBalance(1));
    }

    @Test
    public void deposit_negative_amount_throw_invalid_amount_test(){
        account.createAccount("password123", "Wahab");
        assertEquals(1,account.getNumberOfAccountCreated());
        assertThrows(NegativeAmountException.class, () -> account.deposit(-700, 1));
    }


    @Test
    public void deposit_700_and_withdraw_500_get_a_balance_of_200_test(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        account.deposit(700, 1);
        assertEquals(700, account.getAccountBalance(1));
        account.withdraw(1,500, "password123");
        assertEquals(200, account.getAccountBalance(1));
    }

    @Test
    public void deposite_500_and_withdraw_200_with_a_wrong_password_test(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        account.deposit(500, 1);
        assertEquals(500, account.getAccountBalance(1));
        assertThrows(WrongPasswordException.class, () -> account.withdraw(1,200, "password"));
        assertEquals(500, account.getAccountBalance(1));
    }


    @Test
    public void withdraw_negative_amount_to_throw_error_test(){

        account.createAccount("password123", "Wahab");
        assertEquals(1,account.getNumberOfAccountCreated());
        account.deposit(100, 1);
        assertEquals(100, account.getAccountBalance(1));
        account.withdraw(1, 50, "password123");
        assertEquals(50, account.getAccountBalance(1));

    }

    @Test
    public void deposit_500_withdraw_600_t0_throw_error(){
        assertEquals(1, account.createAccount("password123", "Wahab"));
        account.deposit(500, 1);
        assertEquals(500, account.getAccountBalance(1));
        assertThrows(LowAccountBalanceException.class, () -> account.withdraw(1,600, "password123"));
        assertEquals(500, account.getAccountBalance(1));
    }

    @Test
    public void deposit_1000_withraw_200_then_withdraw_600_accountBalance_of_200_test(){
        account.createAccount("password123", "Wahab");
        assertEquals(1, account.getNumberOfAccountCreated());
        account.deposit(1000,1);
        assertEquals(1000, account.getAccountBalance(1));
        account.withdraw(1,200, "password123");
        assertEquals(800, account.getAccountBalance(1));
        account.withdraw(1,600, "password123");
        assertEquals(200, account.getAccountBalance(1));

    }



}
