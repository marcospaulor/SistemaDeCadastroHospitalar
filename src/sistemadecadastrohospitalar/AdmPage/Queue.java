package sistemadecadastrohospitalar.AdmPage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import sistemadecadastrohospitalar.DBConnection.Conn;
import sistemadecadastrohospitalar.DataManipulation.Adm.QueueModel;
import sistemadecadastrohospitalar.MedPage.Med;

/**
 *
 * @author Alexandy
 */
public class Queue extends javax.swing.JFrame {

    public Queue() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        queueTable = new javax.swing.JTable();
        btnArea = new javax.swing.JPanel();
        qBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        queueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        queueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queueTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(queueTable);

        qBackBtn.setText("Voltar");
        qBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnAreaLayout = new javax.swing.GroupLayout(btnArea);
        btnArea.setLayout(btnAreaLayout);
        btnAreaLayout.setHorizontalGroup(
            btnAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAreaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(qBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );
        btnAreaLayout.setVerticalGroup(
            btnAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(qBackBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnArea.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("Fila de Pacientes");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qBackBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_qBackBtnActionPerformed

    private void queueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queueTableMouseClicked
        // TODO add your handling code here:
        int rowSelecionada = queueTable.getSelectedRow();
        String cpf = (String)queueTable.getValueAt(rowSelecionada, 1);
        Med med = new Med();
        med.getPaciente(cpf);
        med.setVisible(true);
    }//GEN-LAST:event_queueTableMouseClicked

    public void insertQueueRow(Object dados) {
        
        int totalRows = queueTable.getRowCount();
        DefaultTableModel queueRow = (DefaultTableModel) queueTable.getModel();
        Object[] result = (Object[]) dados;

        for(int i=0; i<totalRows; i++ ) {
            if(queueTable.getModel().getValueAt(i, 1).equals(result[1])) {
                JOptionPane.showMessageDialog(null, "Paciente jé está na fila", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        queueRow.addRow((Object[]) dados);
    }
    public void verifyWhoLogged(String function){
        if(function == "med"){
            showQueue();
        }
    }
    public ArrayList<QueueModel> createQueue(){
        ArrayList<QueueModel> queueList = new ArrayList<>();
        Connection conn;
        Statement stmt;
        ResultSet rs;
        try {
            conn = Conn.getConnection();
            String query = "SELECT * FROM fila";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            QueueModel model;
            while (rs.next()) {
                model = new QueueModel(rs.getString("nome"),rs.getString("cpf"),rs.getInt("senha"));
                queueList.add(model);
            }
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
        }
        
        return queueList;
    }
    public void showQueue(){
        ArrayList<QueueModel> list = createQueue();
        DefaultTableModel model = (DefaultTableModel)queueTable.getModel();
        Object [] row = new Object[4];
        
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNome();
            row[1] = list.get(i).getCpf();
            row[2] = list.get(i).getSenha();
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton qBackBtn;
    private javax.swing.JTable queueTable;
    // End of variables declaration//GEN-END:variables
}
