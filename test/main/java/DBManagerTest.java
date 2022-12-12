package main.database;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


class DBManagerTest {
    @BeforeEach
    void setUp(){

    }

    @Test
    public void DBConnect() {
        DBManager secureDB = new DBManager();;
        secureDB.connect();
        assertTrue(secureDB.getConnection() != null);
    }
}
