/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastrohospitalar.AdmPage;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemadecadastrohospitalar.DataManipulation.Adm.OperacoesAdm;

/**
 *
 * @author gbpis
 */
public class Adm extends javax.swing.JFrame {

    /**
     * Creates new form Adm
     */
    public Adm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administração - (Sistema de Cadastro Hospitalar)");
        setupInic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerArea = new javax.swing.JPanel();
        patientArea = new javax.swing.JPanel();
        pNameLabel = new javax.swing.JLabel();
        pNameTF = new javax.swing.JTextField();
        pRGLabel = new javax.swing.JLabel();
        pRGTF = new javax.swing.JTextField();
        pCPFLabel = new javax.swing.JLabel();
        pCPFTF = new javax.swing.JTextField();
        pAddressLabel = new javax.swing.JLabel();
        pAddressTF = new javax.swing.JTextField();
        bloodTypeLabel = new javax.swing.JLabel();
        bloodTypeCB = new javax.swing.JComboBox<>();
        birthdayLabel = new javax.swing.JLabel();
        birthdayFTF = new javax.swing.JFormattedTextField();
        paymentMethodL = new javax.swing.JLabel();
        paymentCB = new javax.swing.JComboBox<>();
        companionArea = new javax.swing.JPanel();
        cNameLabel = new javax.swing.JLabel();
        cNameTF = new javax.swing.JTextField();
        cRGLabel = new javax.swing.JLabel();
        cRGTF = new javax.swing.JTextField();
        cCPFLabel = new javax.swing.JLabel();
        cCPFTF = new javax.swing.JTextField();
        cAddressLabel = new javax.swing.JLabel();
        cAddressTF = new javax.swing.JTextField();
        btnArea = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchPatientArea = new javax.swing.JPanel();
        searchPatientLabel = new javax.swing.JLabel();
        searchPatientTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));
        registerArea.setLayout(new java.awt.GridLayout(1, 0));

        patientArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Paciente"));

        pNameLabel.setText("Nome");

        pRGLabel.setText("RG");

        pCPFLabel.setText("CPF");

        pAddressLabel.setText("Endereço");

        bloodTypeLabel.setText("Tipo Sanguíneo");

        bloodTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+" }));

        birthdayLabel.setText("Data de Nascimento");

        birthdayFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        paymentMethodL.setText("Forma de Pagamento");

        paymentCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de Crédito / Débito", "Plano de Saúde" }));

        javax.swing.GroupLayout patientAreaLayout = new javax.swing.GroupLayout(patientArea);
        patientArea.setLayout(patientAreaLayout);
        patientAreaLayout.setHorizontalGroup(
            patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientAreaLayout.createSequentialGroup()
                        .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pNameLabel)
                            .addComponent(pRGLabel)
                            .addComponent(pCPFLabel))
                        .addGap(28, 28, 28)
                        .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(pCPFTF)
                            .addComponent(pRGTF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientAreaLayout.createSequentialGroup()
                        .addComponent(pAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientAreaLayout.createSequentialGroup()
                        .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthdayLabel)
                            .addComponent(bloodTypeLabel)
                            .addComponent(paymentMethodL))
                        .addGap(18, 18, 18)
                        .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodTypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthdayFTF)
                            .addComponent(paymentCB, 0, 1, Short.MAX_VALUE))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        patientAreaLayout.setVerticalGroup(
            patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNameLabel)
                    .addComponent(pNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pRGLabel)
                    .addComponent(pRGTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pCPFLabel)
                    .addComponent(pCPFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pAddressLabel)
                    .addComponent(pAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodTypeLabel)
                    .addComponent(bloodTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthdayFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(patientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentMethodL)
                    .addComponent(paymentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        registerArea.add(patientArea);

        companionArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acompanhante"));

        cNameLabel.setText("Nome");

        cRGLabel.setText("RG");

        cCPFLabel.setText("CPF");

        cAddressLabel.setText("Endereço");

        javax.swing.GroupLayout companionAreaLayout = new javax.swing.GroupLayout(companionArea);
        companionArea.setLayout(companionAreaLayout);
        companionAreaLayout.setHorizontalGroup(
            companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companionAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(companionAreaLayout.createSequentialGroup()
                        .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNameLabel)
                            .addComponent(cRGLabel)
                            .addComponent(cCPFLabel))
                        .addGap(28, 28, 28)
                        .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cRGTF)
                            .addComponent(cCPFTF)))
                    .addGroup(companionAreaLayout.createSequentialGroup()
                        .addComponent(cAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        companionAreaLayout.setVerticalGroup(
            companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companionAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameLabel)
                    .addComponent(cNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cRGLabel)
                    .addComponent(cRGTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCPFLabel)
                    .addComponent(cCPFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(companionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAddressLabel)
                    .addComponent(cAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        registerArea.add(companionArea);

        insertBtn.setText("Inserir");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        btnArea.add(insertBtn);

        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        btnArea.add(editBtn);

        deleteBtn.setText("Excluir");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        btnArea.add(deleteBtn);

        searchPatientArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        searchPatientLabel.setText("Pesquisar Paciente");

        searchPatientTF.setToolTipText("Insira o CPF");

        searchBtn.setText("Pesquisar");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Voltar");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPatientAreaLayout = new javax.swing.GroupLayout(searchPatientArea);
        searchPatientArea.setLayout(searchPatientAreaLayout);
        searchPatientAreaLayout.setHorizontalGroup(
            searchPatientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPatientAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPatientLabel)
                .addGap(18, 18, 18)
                .addComponent(searchPatientTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
        searchPatientAreaLayout.setVerticalGroup(
            searchPatientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPatientAreaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(searchPatientAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPatientLabel)
                    .addComponent(searchBtn)
                    .addComponent(backBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPatientArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerArea, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(searchPatientArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    OperacoesAdm operacoesadm = new OperacoesAdm();
    
    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed

        switch(operacoesadm.modoEdicao()) {
            
            case 0:
                System.out.println(operacoesadm.modoEdicao());
                System.out.println("entrou em inserir");
                operacoesadm.inserirDadosPacientes(pNameTF.getText(), pRGTF.getText(), 
                    pCPFTF.getText(), pAddressTF.getText(), (String)bloodTypeCB.getSelectedItem(),
                    birthdayFTF.getText(), (String)paymentCB.getSelectedItem());

                if(!cNameTF.getText().trim().isEmpty()) {
                    operacoesadm.inserirDadosAcompanhante(cNameTF.getText(), cRGTF.getText(), 
                        cCPFTF.getText(), cAddressTF.getText(), pCPFTF.getText());
                }
                cleanAdmFields();
                break;
                
            case 1: 
                System.out.println("entrou em editar");
                operacoesadm.editarDadosPaciente(pNameTF.getText(), pRGTF.getText(), 
                    pCPFTF.getText(), pAddressTF.getText(), (String)bloodTypeCB.getSelectedItem(),
                    birthdayFTF.getText(), (String)paymentCB.getSelectedItem());

                if(!cNameTF.getText().trim().isEmpty()) {
                    operacoesadm.editarDadosAcompanhante(cNameTF.getText(), cRGTF.getText(), 
                        cCPFTF.getText(), cAddressTF.getText(), pCPFTF.getText());
                }
                
                operacoesadm.modoEdicaoDesligado();
                setupPesquisa();
                break;
        }
        
    }//GEN-LAST:event_insertBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       
        if(operacoesadm.excluir(pCPFTF.getText())) {
            cleanAdmFields();
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        operacoesadm.modoEdicaoLigado();
        setupEdicao();
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        cleanAdmFields();
        
        ArrayList<String> dados_paciente = (ArrayList<String>) operacoesadm.pesquisar(searchPatientTF.getText());
        ArrayList<String> dados_acompanhante = (ArrayList<String>) operacoesadm.pesquisarAcompanhante(searchPatientTF.getText());
        
        if(dados_paciente == null) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado!");
        }else {
            pNameTF.setText(dados_paciente.get(0));
            pRGTF.setText(dados_paciente.get(1));
            pCPFTF.setText(dados_paciente.get(2));
            pAddressTF.setText(dados_paciente.get(3));
            bloodTypeCB.setSelectedItem(dados_paciente.get(4));
            birthdayFTF.setText(dados_paciente.get(5));
            paymentCB.setSelectedItem(dados_paciente.get(6));
            
            setupPesquisa();
        }
        
        if(dados_acompanhante == null) {
            System.out.println("Usuário não possui acompanhantes");
        }else{
            cNameTF.setText(dados_acompanhante.get(0));
            cRGTF.setText(dados_acompanhante.get(1));
            cCPFTF.setText(dados_acompanhante.get(2));
            cAddressTF.setText(dados_acompanhante.get(3));
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setupInic();
        cleanAdmFields();
    }//GEN-LAST:event_backBtnActionPerformed

    public void cleanAdmFields() {
        pNameTF.setText("");
        pRGTF.setText("");
        pCPFTF.setText("");
        pAddressTF.setText("");
        bloodTypeCB.setSelectedItem("A-");
        birthdayFTF.setText("");
        paymentCB.setSelectedItem("Dinheiro");
        
        cNameTF.setText("");
        cRGTF.setText("");
        cCPFTF.setText("");
        cAddressTF.setText("");
    }
    
    private void setupInic() {
        
        pNameTF.setEditable(true);
        pRGTF.setEditable(true);
        pCPFTF.setEditable(true);
        pAddressTF.setEditable(true);
        bloodTypeCB.setEnabled(true);
        birthdayFTF.setEditable(true);
        paymentCB.setEnabled(true);
        insertBtn.setEnabled(true);   
        
        cNameTF.setEditable(true);
        cRGTF.setEditable(true);
        cCPFTF.setEditable(true);
        cAddressTF.setEditable(true);
        
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        backBtn.setEnabled(false);
        
        operacoesadm.modoEdicaoDesligado();
    }
    
    private void setupEdicao() {
        
        pNameTF.setEditable(true);
        pRGTF.setEditable(true);
        pCPFTF.setEditable(false);
        pAddressTF.setEditable(true);
        bloodTypeCB.setEnabled(true);
        birthdayFTF.setEditable(true);
        paymentCB.setEnabled(true);
        insertBtn.setEnabled(true);   
        
        cNameTF.setEditable(true);
        cRGTF.setEditable(true);
        cCPFTF.setEditable(true);
        cAddressTF.setEditable(true);

        insertBtn.setEnabled(true);
        editBtn.setEnabled(false);
    }
    
    private void setupPesquisa() {
                    
        pNameTF.setEditable(false);
        pRGTF.setEditable(false);
        pCPFTF.setEditable(false);
        pAddressTF.setEditable(false);
        bloodTypeCB.setEnabled(false);
        birthdayFTF.setEditable(false);
        paymentCB.setEnabled(false);
        insertBtn.setEnabled(false);   
        
        cNameTF.setEditable(false);
        cRGTF.setEditable(false);
        cCPFTF.setEditable(false);
        cAddressTF.setEditable(false);

        editBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        backBtn.setEnabled(true);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JFormattedTextField birthdayFTF;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JComboBox<String> bloodTypeCB;
    private javax.swing.JLabel bloodTypeLabel;
    private javax.swing.JPanel btnArea;
    private javax.swing.JLabel cAddressLabel;
    private javax.swing.JTextField cAddressTF;
    private javax.swing.JLabel cCPFLabel;
    private javax.swing.JTextField cCPFTF;
    private javax.swing.JLabel cNameLabel;
    private javax.swing.JTextField cNameTF;
    private javax.swing.JLabel cRGLabel;
    private javax.swing.JTextField cRGTF;
    private javax.swing.JPanel companionArea;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel pAddressLabel;
    private javax.swing.JTextField pAddressTF;
    private javax.swing.JLabel pCPFLabel;
    private javax.swing.JTextField pCPFTF;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JTextField pNameTF;
    private javax.swing.JLabel pRGLabel;
    private javax.swing.JTextField pRGTF;
    private javax.swing.JPanel patientArea;
    private javax.swing.JComboBox<String> paymentCB;
    private javax.swing.JLabel paymentMethodL;
    private javax.swing.JPanel registerArea;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel searchPatientArea;
    private javax.swing.JLabel searchPatientLabel;
    private javax.swing.JTextField searchPatientTF;
    // End of variables declaration//GEN-END:variables
}
