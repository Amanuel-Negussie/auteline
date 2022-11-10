package main.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankDatabaseTest {
    @BeforeEach
    void setUp(){

    }
    @Test
    public void testAuthenticateUser() {
        BankDatabase bank = new BankDatabase();

        assertTrue(bank.authenticateUser(12345, 54321));
    }

    @Test
    public void testGetAvailableBalance() {
        BankDatabase bank = new BankDatabase();

        assertEquals(1000, bank.getAvailableBalance(12345), 0);
    }

    @Test
    public void testGetTotalBalance() {
        BankDatabase bank = new BankDatabase();

        assertEquals(200, bank.getAvailableBalance(98765), 0);
    }

    @Test
    public void testCredit() {
        BankDatabase bank = new BankDatabase();

        bank.credit(12345, 1000);

        assertEquals(2200, bank.getTotalBalance(12345), 0);

    }

    @Test
    public void testDebit() {
        BankDatabase bank = new BankDatabase();

        bank.debit(98765, 10);

        assertEquals(190, bank.getTotalBalance(98765), 0);
    }
}