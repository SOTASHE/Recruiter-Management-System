/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;

import com.alee.laf.WebLookAndFeel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony
 */
public class loginRec extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public loginRec() {
        initComponents();
    }
    
    public static void infoBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        center = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(getBounds());
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());

        center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        center.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 250, 216, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/icons/username.png"))); // NOI18N
        center.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 259, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/icons/padlock.png"))); // NOI18N
        center.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 332, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("RECRUTEUR LOGIN");
        center.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 172, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/icons/user.png"))); // NOI18N
        center.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 26, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(102, 102, 102));
        login.setText("Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        login.setIconTextGap(8);
        login.setInheritsPopupMenu(true);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        center.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 431, 105, 31));

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        center.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(center, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    
    public static boolean validate(String emailstr)
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailstr);
        return matcher.find();
    }
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        boolean b = validate(email.getText());
        if(!b)
        {
            JOptionPane.showMessageDialog(this,"cant log in");
        }
        else {
        dispose();
        new AfficheCandidat().setVisible(true);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(loginRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install(true);
                WebLookAndFeel.setDecorateAllWindows(true);
                new loginRec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel center;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
