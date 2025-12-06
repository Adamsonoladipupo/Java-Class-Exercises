//package bank;
//
//import Execptions.InvalidNegativeAmountException;
//import Execptions.InvalidPasswordException;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class BankTest {
//    Bank account1;
//    Bank account2;
//
//    @BeforeEach
//    public void setUp(){
//        account1 = new Bank();
//        account2 = new Bank();
//    }
//
//    @Test
//    public void bank_does_not_have_any_acount_test(){
//        assertEquals(0, account1.numberOfAccount());
//    }
//
//    @Test
//    public void create_a_new_account_test(){
//        account1.createAccount("Bayo", "0122222222", "PassWord123");
//        assertEquals(1, account1.numberOfAccount());
//    }
//
//    @Test
//    public void create_account_and_deposit_100_into_the_account(){
//        account1.createAccount("bayo", "0122222222", "password123");
//        assertEquals(1, account1.numberOfAccount());
//        account1.deposit(100, "0122222222");
//        assertEquals(100, account1.getAccountBalance());
//    }
//
//    @Test
//    public void deposit_negative_account_to_account1_test(){
//        account1.createAccount("bayo", "0122222222", "password123");
//        assertEquals(1, account1.numberOfAccount());
//        assertThrows(InvalidNegativeAmountException.class, () -> account1.deposit(-100, "0122222222"));
//    }
//
//
//    @Test
//    public void desposit_500_withdraw_300_remaining_200_balance_test(){
//        account1.createAccount("bayo", "0122222222", "password123");
//        assertEquals(1, account1.numberOfAccount());
//        account1.deposit(500, "0122222222");
//        assertEquals(500, account1.getAccountBalance());
//        account1.withdraw(300, "password123");
//        assertEquals(200, account1.getAccountBalance());
//    }
//
//    @Test
//    public void withdraw_500_with_a_wrong_password(){
//        account1.createAccount("bayo", "0122222222", "password123");
//        assertEquals(1, account1.numberOfAccount());
//        account1.deposit(500, "0122222222");
//        assertEquals(500, account1.getAccountBalance());
//        assertThrows(InvalidPasswordException.class, () ->account1.withdraw(500, "PASSWORD123"));
//        assertEquals(500, account1.getAccountBalance());
//    }
//
//    @Test
//    public void create_two_bank_accounts_account1_and_account2_test(){
//        account1.createAccount("Bayo", "0122222222", "PassWord123");
//        account1.createAccount("Dapo", "0133333333", "PassWord456");
//        assertEquals(2, account1.numberOfAccount());
//    }
//
//
//}
