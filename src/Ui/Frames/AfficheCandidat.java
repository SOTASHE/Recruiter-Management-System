/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;
import App.Orm.DaoCandidates;
import App.Orm.DaoJobs;
import App.Services.Linkedin.CandidatesSortByRateService;
import App.Services.Mail.MailService;
import App.Services.Ui.PatternService;
import App.Services.Ui.ServiceAfficheCandidat;
import OrmMapping.Candidates;
import OrmMapping.Jobs;
import java.awt.Color;
import java.awt.TextField;
import java.text.DateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Sony
 */
public class AfficheCandidat extends javax.swing.JPanel {
  
    DaoCandidates candidates = new DaoCandidates();
    DaoJobs daoJobs = new DaoJobs() ;
    int idJob ;
    DateFormat df = DateFormat.getDateInstance() ;  
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

        setMaximumSize(new java.awt.Dimension(850, 560));
        setMinimumSize(new java.awt.Dimension(850, 560));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 560));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField4.setForeground(java.awt.Color.gray);
        jTextField4.setText("ex:Rabat");
        jTextField4.setToolTipText("");
        jTextField4.setDisabledTextColor(java.awt.Color.lightGray);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        secondaire.setForeground(java.awt.Color.gray);
        secondaire.setText("ex:Laravel,Php");
        secondaire.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                secondaireFocusLost(evt);
            }
        });
        secondaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondaireMouseClicked(evt);
            }
        });

        chercher.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        chercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/search.png"))); // NOI18N
        chercher.setText("Chercher");
        chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherActionPerformed(evt);
            }
        });

        inviter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        inviter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/envelope.png"))); // NOI18N
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

        principale.setForeground(java.awt.Color.gray);
        principale.setText("ex:C#,C++");
        principale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                principaleFocusLost(evt);
            }
        });
        principale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principaleMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Job");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Competences secondaires");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Ville");

        tCandidat.setAutoCreateRowSorter(true);
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(81, 81, 81))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principale, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(secondaire, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(chercher))
                        .addComponent(jLabel1))
                    .addGap(34, 34, 34))
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inviter)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(839, Short.MAX_VALUE)))
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inviter)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(121, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(87, 87, 87)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean EnvoiMessge() {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        return  JOptionPane.showConfirmDialog(tCandidat,MailService.BodyMessage("(nom)","(Job)")
                ,"Message",dialogButton) == JOptionPane.YES_OPTION ;
    }
    
    private void Mail() {
       JOptionPane.showInputDialog(tCandidat,MailService.BodyMessage("(nom)","(Job)")) ;
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
            Candidates c = new Candidates() ;
            c.setLinkedinUrl("https://www.linkedin.com/in/ilias-naamane-a0bab3b0/");
            //CandidatesComparatorService.TestRuby(c) ;
            if(FieldValidate()) {
                ActivateButton(false);
                ServiceAfficheCandidat.displaySearchCandidates(tCandidat, getCandidat());
            }
            else JOptionPane.showMessageDialog(tCandidat,"Vous avez inserer des données non valides","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException n) {
            JOptionPane.showMessageDialog(tCandidat,"Veuillez spécifier un Job","ErreJOptionPaneur",JOptionPane.WARNING_MESSAGE);
        }
        /*catch(JSONException j) {
            JOptionPane.showMessageDialog(tCandidat,"Erreur Librairie LinkedIn scraper manquante","ErreJOptionPaneur",JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
         // JOptionPane.showMessageDialog(tCandidat,ex.getMessage(),"ErreJOptionPaneur",JOptionPane.WARNING_MESSAGE);
        } catch (InterruptedException ex) {
           JOptionPane.showMessageDialog(tCandidat,ex.getMessage(),"ErreJOptionPaneur",JOptionPane.WARNING_MESSAGE);
        }
        catch (ClassFormatError ex) {
           JOptionPane.showMessageDialog(tCandidat,"Ruby non instalé","Erreur",JOptionPane.WARNING_MESSAGE);
        }*/
        // Logger.getLogger(AfficheCandidat.class.getName()).log(Level.SEVERE, null, ex);

    }//GEN-LAST:event_chercherActionPerformed

    private void inviterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviterActionPerformed
        if(EnvoiMessge()){
            int[] Rows;
            Rows = tCandidat.getSelectedRows();
            for(int rowid = 0 ; rowid < Rows.length ; rowid++){
                String email = (String) tCandidat.getValueAt(rowid, 4);
                String name = (String) tCandidat.getValueAt(rowid, 1);
                int idCandidate = (int) tCandidat.getValueAt(rowid,0) ;
                try{
                    
                   MailService.sendMail("Convocation pour passage d'entretien",
                   MailService.BodyMessage(name,getJobName(idJob)),email) ;
                  //Mail();
                    JOptionPane.showMessageDialog(tCandidat,"Message Envoyé à Mr(MMe) "+name,"Success",
                        JOptionPane.INFORMATION_MESSAGE);
                    ServiceAfficheCandidat.insertCandidateEntretien(idCandidate,idJob);
                   
                }
                catch(Exception Me){
                    JOptionPane.showMessageDialog(tCandidat,"Message Nom Envoyé à Mr(MMe) "+name+"\n" +
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

    
    private void PlaceHolder(String Text,Color C,JTextField T) {
        T.setText(Text);
        T.setForeground(C); 
    }
    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().equals("")) {
           PlaceHolder("ex:Rabat",Color.GRAY,jTextField4);
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
       if(jTextField4.getText().equals("ex:Rabat")) {
             PlaceHolder("",Color.BLACK,jTextField4);
        }
    }//GEN-LAST:event_jTextField4MouseClicked

    private void principaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principaleMouseClicked
         if(principale.getText().equals("ex:C#,C++")) {
             PlaceHolder("",Color.BLACK,principale);
        }
    }//GEN-LAST:event_principaleMouseClicked

    private void principaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_principaleFocusLost
       if(principale.getText().equals("")) {
           PlaceHolder("ex:C#,C++",Color.GRAY,principale);
        }
    }//GEN-LAST:event_principaleFocusLost

    private void secondaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondaireMouseClicked
       if(secondaire.getText().equals("ex:Laravel,Php")) {
             PlaceHolder("",Color.BLACK,secondaire);
       }
    }//GEN-LAST:event_secondaireMouseClicked

    private void secondaireFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondaireFocusLost
        if(secondaire.getText().equals("")) {
           PlaceHolder("ex:Laravel,Php",Color.GRAY,secondaire);
        }
    }//GEN-LAST:event_secondaireFocusLost
    
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
    private List getCandidat() throws NullPointerException{
        List L = null;
        Jobs j = (Jobs) jobs.getSelectedItem();
        idJob = j.getId();
        L = CandidatesSortByRateService.sortCandidates(idJob, principale.getText(), secondaire.getText());
        return L ;
      
           //  JOptionPane.showMessageDialog(tCandidat,"Veuillez specifier un Job","Erreur",JOptionPane.WARNING_MESSAGE);
           
        
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
