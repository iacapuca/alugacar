package alugacar.dao;

import alugacar.database.DatabaseSQLite;

import java.sql.Connection;
import java.sql.SQLException;

public class Cliente {
    private final Connection conn;

    public Cliente() {
        try {
            this.conn = DatabaseSQLite.getInstance().getConnection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
