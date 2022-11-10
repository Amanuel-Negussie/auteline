package main.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @BeforeEach
    void setUp(){

    }

    @Test
    @DisplayName("This will pass criteria for validating Pin")
    public void testValidatePIN() {
        Account test = new Account(12345, 54321, 1000, 1200);

        assertEquals(true, test.validatePIN(54321));
    }

    @Test
    public void testGetAvailableBalance() {
        Account test = new Account(12345, 54321, 2400, 3000);

        assertEquals(2400, test.getAvailableBalance(), 0);
    }

    @Test
    public void testGetTotalBalance() {
        Account test = new Account(12345, 54321, 600, 800);

        assertEquals(800, test.getTotalBalance(), 0);
    }

    @Test
    public void testCredit() {
        Account test = new Account(12345, 54321, 250, 300);

        test.credit(1000);

        assertEquals(1300, test.getTotalBalance(), 0);
    }

    @Test
    public void testDebit() {
        Account test = new Account(12345, 54321, 2000, 2200);

        test.debit(1800);

        assertEquals(200, test.getAvailableBalance(), 0);
    }

    @Test
    public void testGetAccountNumber() {
        Account test = new Account(12345, 54321, 2000, 2200);

        assertEquals(12345, test.getAccountNumber(), 0);
    }
}