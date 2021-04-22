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
public class DiagnosticoModelTable {
    private int temperatura;
    private String pressao, sintoma, diagnostico;

    public DiagnosticoModelTable(int temperatura, String pressao, String sintoma, String diagnostico) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.sintoma = sintoma;
        this.diagnostico = diagnostico;
    }

    /**
     * @return the temperatura
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * @return the pressao
     */
    public String getPressao() {
        return pressao;
    }

    /**
     * @return the sintoma
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }
    
    
}
