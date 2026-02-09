package simpleBank;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankTest {
    private final String username = "newroot";
    private final String password = "Password5*";

    @Test
    void testThatYouCanConnectToTaDatabase(){

        try(Connection connection =
            SimpleBank.connectToDatabase(username, password)){
            assertNotNull(connection);
            assertTrue(connection.isValid(3));

        }catch (SQLException ex){
            assertNull(ex);
        }
    }


    @Test
    void testCanCreateTable(){
        String query = """
            CREATE TABLE IF NOT EXISTS account (
            id BIGINT PRIMARY KEY,
            account_number VARCHAR(50) UNIQUE NOT NULL,
            balance DECIMAL (15, 2) DEFAULT 0.00);""";
        try(Connection connection = SimpleBank.connectToDatabase(username, password)){
            SimpleBank.createTable(query, connection);
            assertNotNull(connection);
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables(null,null,
                    "account", new String[]{"TABLE"});
            boolean isTableExists = resultSet.next();
            assertTrue(isTableExists);
        }catch (SQLException ex){
            ex.printStackTrace();
            assertNull(ex);
        }

    }

}