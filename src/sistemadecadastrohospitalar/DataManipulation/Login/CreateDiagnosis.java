/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Login;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import sistemadecadastrohospitalar.AdmPage.Adm;
import sistemadecadastrohospitalar.DBConnection.Conn;
/**
 *
 * @author marco
 */
public class CreateDiagnosis {
    
    public void insert(Adm fk_cpf,String temperatura,String pressao,String sintomas
    ,String diagnostico,String prescricao){
        Statement statement;
        Connection connection = Conn.getConnection();
        try{
            String query = String.format("INSERT INTO diagnosis(fk_cpf,temp,pressure"
                    +",sintomas,diagnostico,prescricao,fk_paciente) VALUES"
                    +"('%s','%s','%s','%s','%s')",fk_cpf, temperatura,pressao,
                    sintomas,diagnostico,prescricao);
            statement = connection.createStatement();
            statement.executeQuery(query);
            Conn.getConnection();
        } catch (SQLException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
