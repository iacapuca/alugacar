package alugacar.dao;

import alugacar.database.DatabaseSQLite;
import alugacar.models.PessoaFisica;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public void save(PessoaFisica pf) throws SQLException {
        try {
            String sql = "INSERT INTO cliente(nome, cpf, cnh) VALUES(?,?,?)";
            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, pf.getNome());
            pstm.setString(2, pf.getCpf());
            pstm.setString(3, pf.getCnh());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
