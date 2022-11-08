/*package main.java;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemIntegrationTest {
    @Test
    @DisplayName("This will pass criteria for validating Pin")
    void withdrawWithinAvailableBalance() {
        ATM mobileATM = new ATM();
        Account test = new Account(12345, 54321, 1000, 1200);
        BankDatabase bankDatabase = new BankDatabase();
        boolean userAuthenticated;

        userAuthenticated = bankDatabase.authenticateUser(12345, 54321);
        if (userAuthenticated){
            mobileATM.run();
        }
        assertEquals(true, test.validatePIN(54321));
    }
}
*/