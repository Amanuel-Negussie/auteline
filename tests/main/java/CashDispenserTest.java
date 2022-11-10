package main.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CashDispenserTest {
    @BeforeEach
    void setUp(){

    }

    @Test
    public void test1IsSufficientCashAvailable() {
        CashDispenser dispenser = new CashDispenser();

        assertTrue(dispenser.isSufficientCashAvailable(400));
    }

    @Test
    public void test2IsSufficientCashAvailable() {
        CashDispenser dispenser = new CashDispenser();

        assertFalse(dispenser.isSufficientCashAvailable(20000));
    }

}