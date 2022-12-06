package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class DepositSlotTest {

    @BeforeEach
    void setUp(){

    }
    @Test
    public void isEnvelopeReceived() {
        DepositSlot deposit = new DepositSlot();

        assertTrue(deposit.isEnvelopeReceived());
    }
}