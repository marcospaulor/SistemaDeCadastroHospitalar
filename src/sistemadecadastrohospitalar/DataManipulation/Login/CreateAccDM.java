/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Login;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import sistemadecadastrohospitalar.DBConnection.Conn;

/**
 *
 * @author gbpis
 */
public class CreateAccDM {
    
    public void insert(String name, String surname, String username,
            String password, String function) {
        Statement statement;
        Connection connection = Conn.getConnection();
        try {
            String query = String.format("INSERT INTO %s(nome, sobrenome,"
                    + " username, senha) VALUES('%s', '%s', '%s', '%s')", 
                    "Administração".equals(function) ? "adm" : "med", name,
                    surname, username, password);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            Conn.getConnection();
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
