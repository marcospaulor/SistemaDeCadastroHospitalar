package sistemadecadastrohospitalar.DataManipulation.Adm;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemadecadastrohospitalar.DBConnection.Conn;


public class OperacoesAdm {
    
    Statement statement;
    Connection connection = Conn.getConnection();
    
    public void inserirDadosPacientes(String nome, String rg, String cpf, String endereco, 
            String tipo_sang, String data_nasc, String pagamento) {
        

        try {
            String query = "INSERT INTO pacientes (nome, rg, cpf, endereco, tipo_sang,"
                    + "data_nasc, pagamento) VALUES ('" + nome + "','" + rg + "','"
                    + cpf + "','" + endereco + "','" + tipo_sang + "','" + data_nasc +
                    "','" + pagamento + "')";
            
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Cadastro do paciente feito com sucesso!");
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
            
        }catch(SQLException e) {
            if(e.getErrorCode() == 1062) {
                System.out.println(e.getMessage());
                System.out.println("Erro: CPF já cadastrado!");
                JOptionPane.showMessageDialog(null, "CPF já cadastrado");
            }else{
                System.out.println("Erro ao inserir dados do paciente: " + e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }
        
        Conn.closeConnection();
    }
    
    public void inserirDadosAcompanhante(String nome, String rg, String cpf, 
            String endereco, String cpf_paciente) {
        
        try {
            String query = "INSERT INTO acompanhantes (nome, rg, cpf, endereco, cpf_paciente)"
                    + "VALUES ('" + nome + "','" + rg + "','" + cpf + "','" + endereco + 
                    "','" + cpf_paciente + "')";
            
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Cadastro do acompanhante feito com sucesso");
            
        }catch(SQLException e) {
            System.out.println("Erro ao inserir dados do acompanhante: " + e.getMessage());            
        }
        
        Conn.closeConnection();
    }
    
    /**
     *
     * @param cpf
     * @return
     */
    public ArrayList pesquisar(String cpf) {
        
        try{
            String query = "SELECT * FROM pacientes WHERE cpf = " + "'" + cpf + "'";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            rs.next();

            ArrayList<String> dados_paciente = new ArrayList<>();
            dados_paciente.add(rs.getString("nome"));
            dados_paciente.add(rs.getString("rg"));
            dados_paciente.add(rs.getString("cpf"));
            dados_paciente.add(rs.getString("endereco"));
            dados_paciente.add(rs.getString("tipo_sang"));
            dados_paciente.add(rs.getString("data_nasc"));
            dados_paciente.add(rs.getString("pagamento"));
            
            Conn.closeConnection();
            return dados_paciente;

        }catch(SQLException e){
            System.out.println("Erro na consulta: " + e.getMessage());
            Conn.closeConnection();
            return null;
        }
    }
    
    public ArrayList pesquisarAcompanhante(String cpf) {
        
        try{
            String query_ac = "SELECT * FROM acompanhantes WHERE cpf_paciente = " + "'" + cpf + "'";
            statement = connection.createStatement();
            ResultSet rs_ac = statement.executeQuery(query_ac);
            rs_ac.next();

            ArrayList<String> dados_acompanhante = new ArrayList<>();
            dados_acompanhante.add(rs_ac.getString("nome"));
            dados_acompanhante.add(rs_ac.getString("rg"));
            dados_acompanhante.add(rs_ac.getString("cpf"));
            dados_acompanhante.add(rs_ac.getString("endereco"));
            
            Conn.closeConnection();
            return dados_acompanhante;

        }catch(SQLException e){
            if(e.getErrorCode() == 0) {
                Conn.closeConnection();
                return null;
            }else{
                System.out.println("Erro ao consultar acompanhante: " + e.getMessage());
                Conn.closeConnection();
                return null;
            }   
        }
    }
    
    public void editarDadosPaciente(String nome, String rg, String cpf, String endereco, 
            String tipo_sang, String data_nasc, String pagamento) {
        
        try{
            String query = "UPDATE pacientes SET nome = " + "'" + nome + "'" + ", rg = " + "'" + rg + "'" +
                    ", cpf = " + "'" + cpf + "'" + ", endereco = " + "'" + endereco + "'" + ", tipo_sang = " +
                    "'" + tipo_sang + "'" + ", data_nasc = " + "'" + data_nasc + "'" + ", pagamento = " + 
                    "'" + pagamento + "'" + " WHERE cpf = " + "'" + cpf + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Cadastro do paciente atualizado!");
            JOptionPane.showMessageDialog(null, "Cadastro atualizado!");
            
        }catch(SQLException e){
            System.out.println("Erro ao atualizar cadastro do paciente: " + e.getMessage());
        }
        
        Conn.closeConnection();
        
    }
    
    public void editarDadosAcompanhante(String nome, String rg, String cpf, 
            String endereco, String cpf_paciente) {
        
        try {
            String query = "UPDATE acompanhantes SET nome = " + "'" + nome + "'" +
                    ", rg = " + "'" + rg + "'" + ", cpf = " + "'" + cpf + "'" + 
                    ", endereco = " + "'" + endereco + "' WHERE cpf_paciente = " + 
                    "'" + cpf_paciente + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Cadastro do acompanhante atualizado!");
            
        }catch(SQLException e){
            System.out.println("Erro ao atualizar cadastro do acompanhante!" + e.getMessage());
        }
        
    }
    
    private int modo = 0;
    public int modoEdicaoLigado() {
        this.modo = 1;
        return this.modo;
    }
    
    public int modoEdicaoDesligado() {
        this.modo = 0;
        return this.modo;
    }
    
    public int modoEdicao() {
        return this.modo;
    }
    
    public boolean excluir (String cpf) {
        
        int confirmResult = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(confirmResult == JOptionPane.YES_OPTION) {
            try {
                String query = "DELETE FROM pacientes WHERE cpf = '" + cpf + "'";
                statement = connection.createStatement();
                statement.executeUpdate(query);
                System.out.println("Cadastro do paciente excluido!");
                Conn.closeConnection();
                return true;
            
            }catch(SQLException e) {
                System.out.println("Erro ao excluir: " + e.getMessage());
                Conn.closeConnection();
                return false;
            }
            
        }else{
            System.out.println("Exclusão cancelada!");
            Conn.closeConnection();
            return false;
        } 
    }
    
    private int senha = 1;
    public Object addQueue(String nome, String cpf) {
        
        Object[] queueData = new Object[]{nome, cpf, this.senha};
        this.senha++;
        return queueData;  
        
    }
    
    public int ageCalc(String dataNasc) {
    
        try {
            
            int year = Integer.parseInt(dataNasc.substring(6, 10));
            int month = Integer.parseInt(dataNasc.substring(3, 5));
            int day = Integer.parseInt(dataNasc.substring(0, 2));
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, month, day);
            int age = Period.between(birth, today).getYears();
            return age;
            
        }catch(NumberFormatException e) {
            
            System.out.println("Erro ao calcular idade: " + e.getMessage());
            return 0;
        }
}
    
    
    
}    

    


