package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank bank;

    @BeforeEach
    public void setUp(){
        bank = new Bank();
    }

    @Test
    public void bank_does_not_have_any_acount_test(){
        assertEquals(0, bank.numberOfAccount());
    }

    @Test
    public void create_a_new_account_test(){
        bank.createAccount("Bayo", 012222222, "PassWord123");
        assertEquals(1, bank.numberOfAccount());
    }


}
