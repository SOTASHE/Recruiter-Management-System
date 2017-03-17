/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;

import App.Orm.DaoCandidatesEntretien;
import App.Services.Ui.ConfirmeDialog;
import App.Services.Ui.FilljTableService;
import javax.swing.JOptionPane;

/**
 *
 * @author regragui
 */
public class CandidatsJob extends javax.swing.JFrame {
    
    private int idJob;
    
    /**
     * Creates new form Candidats
     */
    public CandidatsJob(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idJob = id;
        FilljTableService.displayCandidatesWithInterviewByJob(candidatesJTable,this.idJob);
        //active(true);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        candidatesJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editButton = new javax.swing.JToggleButton();
        deleteButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        candidatesJTable.setAutoCreateRowSorter(true);
        candidatesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        candidatesJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatesJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(candidatesJTable);

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Les Candidats");

        editButton.setText("Phase suivante");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Supprimer");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(ConfirmeDialog.getReponse(null,"Voulez vous vraiment supprimer le candidat",
                "Avertissement",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)) {
            int row = candidatesJTable.getSelectedRow();
            new DaoCandidatesEntretien().delete((Integer.parseInt(candidatesJTable.getValueAt(row,0).toString())),idJob);
            Refresh(idJob);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void Active(boolean b){
        editButton.setEnabled(b);
        deleteButton.setEnabled(b);
    }
    private void candidatesJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesJTableMouseClicked
        // TODO add your handling code here:
        if(candidatesJTable.getSelectedRow() != -1) {
            Active(true);
            boolean b = candidatesJTable.getValueAt(candidatesJTable.getSelectedRow(), 3).toString().equals("Validé") ; 
            if(b) editButton.setEnabled(false);
            else editButton.setEnabled(true);
        }
        else Active(false);
    }//GEN-LAST:event_candidatesJTableMouseClicked

            
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(ConfirmeDialog.getReponse(null,"Voulez vous vraiment passer l'enretien a l'etape suivante",
                "Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)) {
            int idCandidates = (int) candidatesJTable.getValueAt(candidatesJTable.getSelectedRow(),0) ;
            FilljTableService.nextInterviewPhase(idCandidates,idJob) ;
            Refresh(idJob);
        }
    }//GEN-LAST:event_editButtonActionPerformed
    
    private void Refresh(int idJob){
       candidatesJTable.clearSelection();
       candidatesJTable.removeAll();
       this.Active(false);
       FilljTableService.displayCandidatesWithInterviewByJob(candidatesJTable,idJob); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CandidatsJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandidatsJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandidatsJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandidatsJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable candidatesJTable;
    private javax.swing.JToggleButton deleteButton;
    private javax.swing.JToggleButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
