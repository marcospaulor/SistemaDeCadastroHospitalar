/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Med;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import sistemadecadastrohospitalar.DBConnection.Conn;
/**
 *
 * @author marco
 */
public class CreateDiagnosis {
    
    public void insert( String cpf_fk,int temperatura,String pressao,String sintoma
    ,String diagnostico,String prescricao){
        Statement statement;
        Connection connection = Conn.getConnection();
        try{
            String query = "INSERT INTO diagnostico(cpf_fk, temperatura,pressao, sintoma, diagnostico, prescricao)"
                    + " VALUES ('"+cpf_fk+"','"+temperatura+"','"+pressao+"','"+sintoma+"','"+diagnostico+"','"+prescricao+"')";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            Conn.getConnection();
        } catch (SQLException e){
            System.err.println("Erro: DAQUI " + e.getMessage());
        }
    }
}
