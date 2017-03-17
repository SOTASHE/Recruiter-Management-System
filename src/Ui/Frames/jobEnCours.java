/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;

import App.Dao.DaoJobs;
import App.Services.Linkedin.CandidatesSortByRateService;
import App.Services.Ui.ConfirmeDialog;
import App.Services.Ui.ServiceJobEnCours;
import OrmMapping.Candidates;
import OrmMapping.Jobs;
import com.alee.laf.WebLookAndFeel;
import java.util.List;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class jobEnCours extends javax.swing.JPanel {

    /**
     * Creates new form jobEnCours
     */
    
    public jobEnCours() {
        initComponents();
        ServiceJobEnCours.displayJobs(JobsTable);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JobsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVisualiser = new javax.swing.JButton();
        btnValider = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(850, 570));
        setMinimumSize(new java.awt.Dimension(850, 570));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JobsTable.setAutoCreateRowSorter(true);
        JobsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JobsTable.setName("CurrentJobs"); // NOI18N
        JobsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JobsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JobsTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Offre d'emploi");

        btnVisualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/eye.png"))); // NOI18N
        btnVisualiser.setText("Visualiser");
        btnVisualiser.setEnabled(false);
        btnVisualiser.setIconTextGap(15);
        btnVisualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualiserActionPerformed(evt);
            }
        });

        btnValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/checked.png"))); // NOI18N
        btnValider.setText("Valider");
        btnValider.setEnabled(false);
        btnValider.setIconTextGap(20);
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        radio.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jRadioButton1.setText("en cours");

        radio.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("tous");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        radio.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jRadioButton5.setText("valide");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVisualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(694, 694, 694)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(468, 468, 468)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Activate(boolean b) {
        btnValider.setEnabled(b);
        btnVisualiser.setEnabled(b);
    } 
    
    private int getIdJob() {
        return (int) JobsTable.getValueAt(JobsTable.getSelectedRow(),0) ;
    }
    
    private void JobsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JobsTableMouseClicked
        if(JobsTable.getSelectedRow() != -1) {
            if(JobsTable.getValueAt(JobsTable.getSelectedRow(),2).toString().equals("Validé")) {
                btnVisualiser.setEnabled(true);
                btnValider.setEnabled(false);
            }   
            else Activate(true);
        }
        else Activate(false) ;
    }//GEN-LAST:event_JobsTableMouseClicked

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        if(ConfirmeDialog.getReponse(null,"Voulez Vous vraiment valider ce job", "Information",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)) {
            if(ServiceJobEnCours.VerifierPhaseValide(getIdJob())) {
                int Row = JobsTable.getSelectedRow() ;
                new DaoJobs().updateStatus(Integer.parseInt(JobsTable.getValueAt(Row,0).toString()));
                Refresh();
            }
            else {
                JOptionPane.showMessageDialog(null,"Impossible de valider ce Job, Merci de valider à tout les candidats","Erreur",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnValiderActionPerformed

    private void Refresh() {
        JobsTable.setValueAt("Validé", JobsTable.getSelectedRow(),2);
    }
    
    private void btnVisualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualiserActionPerformed
       
        this.FenetreCandidat(this.getIdJob()) ;
    }//GEN-LAST:event_btnVisualiserActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
    private void FenetreCandidat(int idJob) {
        CandidatsJob C = new CandidatsJob(idJob) ;
        C.setResizable(false);
        // mainRecruit.getFrame().setEnabled(false);
        C.setVisible(true);
        //mainRecruit.getFrame().setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JobsTable;
    private javax.swing.JButton btnValider;
    private javax.swing.JButton btnVisualiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup radio;
    // End of variables declaration//GEN-END:variables
}
