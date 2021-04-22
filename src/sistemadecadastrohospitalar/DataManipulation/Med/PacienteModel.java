/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.DataManipulation.Med;

/**
 *
 * @author marco
 */
public class PacienteModel {
    private String nome;
    private String tipo_sang;

    public PacienteModel(String nome, String tipo_sang) {
        this.nome = nome;
        this.tipo_sang = tipo_sang;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the tipo_sang
     */
    public String getTipo_sang() {
        return tipo_sang;
    }
    
    
}
