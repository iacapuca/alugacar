package alugacar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSQLite{
    private static DatabaseSQLite instance;
    private Connection connection;

    private DatabaseSQLite() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:db/alugacar.db");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseSQLite getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseSQLite();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseSQLite();
        }

        return instance;
    }

    public void disconnect(Connection conn) {

    }
}
