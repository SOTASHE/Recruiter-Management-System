/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;

import com.alee.laf.WebLookAndFeel;
import java.awt.*;

/**
 *
 * @author Sony
 */
public class mainRecruit extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    AfficheCandidat candidat;
    Clients clt;
    employes emp;
    jobEnCours job;
    statistics stat;
    /**
     * Creates new form mainRecruit
     */
    public mainRecruit() {
        this.setResizable(false);
        initComponents();
        candidat = new AfficheCandidat();
        clt = new Clients();
        emp = new employes();
        job = new jobEnCours();
        stat = new statistics();
        
        dynamic.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        dynamic.add(candidat,c);
        c.gridx = 0;
        c.gridy = 0;
        dynamic.add(clt,c);
        c.gridx = 0;
        c.gridy = 0;
        dynamic.add(emp,c);
        c.gridx = 0;
        c.gridy = 0;
        dynamic.add(job,c);
        c.gridx = 0;
        c.gridy = 0;
        dynamic.add(stat,c);
        candidat.setVisible(true);
        clt.setVisible(false);
        emp.setVisible(false);
        job.setVisible(false);
        stat.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recruitment = new javax.swing.JPanel();
        fixMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        statistics = new javax.swing.JButton();
        clients = new javax.swing.JButton();
        employes = new javax.swing.JButton();
        dashbord = new javax.swing.JButton();
        cndEnCours = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dynamic = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(981, 560));

        statistics.setText("Statistiques");
        statistics.setIconTextGap(20);
        statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsActionPerformed(evt);
            }
        });

        clients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/clients.png"))); // NOI18N
        clients.setText("  Clients");
        clients.setIconTextGap(15);
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });

        employes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/employe.png"))); // NOI18N
        employes.setText("  Employes");
        employes.setIconTextGap(15);
        employes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employesActionPerformed(evt);
            }
        });

        dashbord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/dashboard.png"))); // NOI18N
        dashbord.setText("Tableau de bord");
        dashbord.setIconTextGap(20);
        dashbord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashbordActionPerformed(evt);
            }
        });

        cndEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/jobsearch.png"))); // NOI18N
        cndEnCours.setText("Job en cours");
        cndEnCours.setIconTextGap(20);
        cndEnCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cndEnCoursActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/logout.png"))); // NOI18N
        jButton1.setText("Sign out");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(20);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cndEnCours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statistics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashbord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dashbord)
                .addGap(40, 40, 40)
                .addComponent(cndEnCours)
                .addGap(40, 40, 40)
                .addComponent(employes)
                .addGap(40, 40, 40)
                .addComponent(clients)
                .addGap(40, 40, 40)
                .addComponent(statistics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout fixMenuLayout = new javax.swing.GroupLayout(fixMenu);
        fixMenu.setLayout(fixMenuLayout);
        fixMenuLayout.setHorizontalGroup(
            fixMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fixMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fixMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixMenuLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        fixMenuLayout.setVerticalGroup(
            fixMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixMenuLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        dynamic.setMaximumSize(new java.awt.Dimension(780, 540));
        dynamic.setMinimumSize(new java.awt.Dimension(780, 540));

        javax.swing.GroupLayout dynamicLayout = new javax.swing.GroupLayout(dynamic);
        dynamic.setLayout(dynamicLayout);
        dynamicLayout.setHorizontalGroup(
            dynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        dynamicLayout.setVerticalGroup(
            dynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout recruitmentLayout = new javax.swing.GroupLayout(recruitment);
        recruitment.setLayout(recruitmentLayout);
        recruitmentLayout.setHorizontalGroup(
            recruitmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recruitmentLayout.createSequentialGroup()
                .addComponent(fixMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dynamic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        recruitmentLayout.setVerticalGroup(
            recruitmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fixMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dynamic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recruitment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recruitment, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        candidat.setVisible(false);
        clt.setVisible(true);
        emp.setVisible(false);
        job.setVisible(false);
        stat.setVisible(false);
    }//GEN-LAST:event_clientsActionPerformed

    private void employesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employesActionPerformed
        candidat.setVisible(false);
        clt.setVisible(false);
        emp.setVisible(true);
        job.setVisible(false);
        stat.setVisible(false);
    }//GEN-LAST:event_employesActionPerformed

    private void dashbordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashbordActionPerformed
        candidat.setVisible(true);
        clt.setVisible(false);
        emp.setVisible(false);
        job.setVisible(false);
        stat.setVisible(false);
    }//GEN-LAST:event_dashbordActionPerformed

    private void cndEnCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cndEnCoursActionPerformed
        candidat.setVisible(false);
        clt.setVisible(false);
        emp.setVisible(false);
        job.setVisible(true);
        stat.setVisible(false);
    }//GEN-LAST:event_cndEnCoursActionPerformed

    private void statisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsActionPerformed
        candidat.setVisible(false);
        clt.setVisible(false);
        emp.setVisible(false);
        job.setVisible(false);
        stat.setVisible(true);
    }//GEN-LAST:event_statisticsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new loginRec().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainRecruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainRecruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainRecruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainRecruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install(true);
                WebLookAndFeel.setDecorateAllWindows(true);
                new mainRecruit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clients;
    private javax.swing.JButton cndEnCours;
    private javax.swing.JButton dashbord;
    private javax.swing.JPanel dynamic;
    private javax.swing.JButton employes;
    private javax.swing.JPanel fixMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel recruitment;
    private javax.swing.JButton statistics;
    // End of variables declaration//GEN-END:variables
}
