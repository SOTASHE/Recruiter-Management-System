/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;
import App.Orm.DaoCandidates;
import App.Orm.DaoJobs;
import App.Services.CandidatesComparatorService;
import App.Services.CandidatesSortByRateService;
import App.Services.FilljTableService;
import App.Services.MailService;
import App.Services.PatternService;
import OrmMapping.Candidates;
import OrmMapping.Jobs;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import com.alee.laf.WebLookAndFeel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.json.JSONException;
/**
 *
 * @author Sony
 */
public class AfficheCandidat extends javax.swing.JPanel {
  
    DaoCandidates candidates = new DaoCandidates();
    DaoJobs daoJobs = new DaoJobs() ;
    int idJob ;
    /**
     * Creates new form AfficheCandidat
     */
    public AfficheCandidat() {
        initComponents();
        Refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        secondaire = new javax.swing.JTextField();
        chercher = new javax.swing.JButton();
        inviter = new javax.swing.JButton();
        jobs = new javax.swing.JComboBox<>();
        principale = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCandidat = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 540));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField4.setToolTipText("");

        chercher.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        chercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/icons/search.png"))); // NOI18N
        chercher.setText("Chercher");
        chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherActionPerformed(evt);
            }
        });

        inviter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        inviter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/icons/envelope.png"))); // NOI18N
        inviter.setText("Inviter a passer l'entretien");
        inviter.setEnabled(false);
        inviter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviterActionPerformed(evt);
            }
        });

        jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Job");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Competences secondaires");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Ville");

        tCandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCandidatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCandidat);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Competences principaux");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(principale, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(secondaire, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chercher)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inviter))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(792, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chercher)
                    .addComponent(secondaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(principale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inviter)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(146, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean EnvoiMessge() {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        return  JOptionPane.showConfirmDialog(tCandidat,MailService.BodyMessage("(nom)","(Job)")
                ,"Message",dialogButton) == JOptionPane.YES_OPTION ;
       
    }
     private String getJobName(int idJob) {
        List L = daoJobs.findById(idJob) ;
        return ((Jobs)L.get(0)).getProfil() ;
    }
    
    private void ActivateButton(boolean b) {
        inviter.setEnabled(b);
    }
     private boolean FieldValidate() {
        boolean b1,b2,b3 ;
        if(!(b1=PatternService.validateVille(jTextField4.getText()))) jTextField4.setText("");
        if(!(b2=PatternService.validateSkills(principale.getText()))) principale.setText("");
        if(!(b3=PatternService.validateSkills(secondaire.getText()))) secondaire.setText("");
        return b1 && b2 && b3 ;
    }
    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed
        try {
            //CandidatesComparatorService.TestRuby(new Candidates("https://www.linkedin.com/in/ilias-naamane-a0bab3b0/")) ;
            if(FieldValidate()) {
                ActivateButton(false);
                FilljTableService.displaySearchCandidates(tCandidat, getCandidat());
            }
            else JOptionPane.showMessageDialog(tCandidat,"Vous avez inserer des données non valides","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(tCandidat, e.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_chercherActionPerformed

    private void inviterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviterActionPerformed
        if(EnvoiMessge()){
            int[] Rows;
            Rows = tCandidat.getSelectedRows();
            for(int rowid = 0 ; rowid < Rows.length ; rowid++){
                String email = (String) tCandidat.getValueAt(rowid, 4);
                String name = (String) tCandidat.getValueAt(rowid, 1);
                try{
                    
                    MailService.sendMail("Convocation pour passage d'entretien",
                    MailService.BodyMessage(name,getJobName(idJob)),email) ;
                    JOptionPane.showMessageDialog(tCandidat,"Message Envoyé à Mr/MMe/Mlle."+name,"Success",
                        JOptionPane.INFORMATION_MESSAGE);
                }
                catch(MessagingException Me){
                    JOptionPane.showMessageDialog(tCandidat,"Message Nom Envoyé à Mr/MMe/Mlle "+name+"\n" +
                        "Veullez Verifier la connexion internet","Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_inviterActionPerformed

    private void jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsActionPerformed

    }//GEN-LAST:event_jobsActionPerformed

    private void tCandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCandidatMouseClicked
        if(tCandidat.getSelectedRow() != -1) {
            ActivateButton(true);
        }
        else ActivateButton(false) ;
    }//GEN-LAST:event_tCandidatMouseClicked
 public void Refresh(){
       jobs.removeAllItems();
       DaoJobs dj = new DaoJobs();
       List L = dj.getCurrentJobs();
       for(Object o : L){
           Jobs j = (Jobs) o;
           jobs.addItem(j);   
       }
    }
  /**
     * @param args the command line arguments
     */
    private List getCandidat() {
        Jobs j = (Jobs) jobs.getSelectedItem();
        idJob = j.getId();
        List L = CandidatesSortByRateService.sortCandidates(idJob, principale.getText(), secondaire.getText());
        return L ;
    } 
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chercher;
    private javax.swing.JButton inviter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<Jobs> jobs;
    private javax.swing.JTextField principale;
    private javax.swing.JTextField secondaire;
    private javax.swing.JTable tCandidat;
    // End of variables declaration//GEN-END:variables
}
