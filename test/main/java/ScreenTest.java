package main.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


class ScreenTest {

    @BeforeEach
    void setUp(){

    }
    @Test
    public void getMessage() {
        Screen screen = new Screen();

        assertEquals("Welcome", screen.getMessage("Welcome"));
    }

    @Test
    public void getDollarAmount() {
        Screen screen = new Screen();

        assertEquals("$1,000.00", screen.getDollarAmount(1000));
    }
}