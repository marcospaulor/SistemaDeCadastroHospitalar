/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Login;

import sistemadecadastrohospitalar.DBConnection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gbpis
 */
public class Auth {
    public boolean validate(String username, String password, String function) {
        Connection connection = Conn.getConnection();
        PreparedStatement pst;
        ResultSet rs;

        try {
            String s = String.format("SELECT username, senha FROM %s where"
                    + " username=? AND senha=?", function);
            pst = connection.prepareStatement(s);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Login feito com sucesso!");
                Conn.closeConnection();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta!");
            }
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }
}
