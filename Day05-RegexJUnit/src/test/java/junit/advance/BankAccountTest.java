package junit.advance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount sbi = new BankAccount(10000);
    @Test
    void deposit() {
        sbi.deposit(10000);
        assertEquals(20000,sbi.getBalance());
    }

    @Test
    void withdraw() {
        sbi.deposit(10000);
        assertTrue(sbi.withdraw(20000));
        assertFalse(sbi.withdraw(1));

    }

    @Test
    void getBalance() {
        assertEquals(10000,sbi.getBalance());
    }
    @AfterEach
    void tearDown(){
        System.out.println("✅ Test Passed !!");
    }
}