/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gbpis
 */
public class Conn {
    
    public Conn() {}
    
    public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "";
        String driverName = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão feito com sucesso");
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return connection;
    }
    
    public static boolean closeConnection() {
        try {
            Conn.getConnection().close();
            System.out.println("Conexão fechada com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
