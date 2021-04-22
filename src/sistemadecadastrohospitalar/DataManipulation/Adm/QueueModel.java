/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Adm;

/**
 *
 * @author marco
 */
public class QueueModel {
    String nome,cpf;
    int senha;

    public QueueModel(String nome, String cpf, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getSenha() {
        return senha;
    }
    
    
}
