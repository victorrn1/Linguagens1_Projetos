package br.com.victornicolaus.helloinsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloInsert {

    public static void main(String[] args) {

        try {
            Connection conexao = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tblalunos (nome, idade, ra) VALUES (?, ?,? );";
            PreparedStatement ps;
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "Dexava");
            ps.setInt(2, 15);
            ps.setString(3, "19.00529-7");
            
            if (ps.execute()) {
                System.out.println("Erro");
            } else {
                System.out.println("Parabains");
            }

        } catch (SQLException ex) {
            Logger.getLogger(HelloInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
