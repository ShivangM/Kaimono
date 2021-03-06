/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaimone;

import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nano
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        super("Kaimono | Bye Groceries");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        SubmitP = new javax.swing.JPanel();
        Submit = new javax.swing.JLabel();
        otp = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        key = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SubmitP1 = new javax.swing.JPanel();
        Submit1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        KaimonoH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        SubmitP.setBackground(new java.awt.Color(153, 153, 255));
        SubmitP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SubmitP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitPMouseClicked(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Baloo Da 2", 0, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("SUBMIT");

        javax.swing.GroupLayout SubmitPLayout = new javax.swing.GroupLayout(SubmitP);
        SubmitP.setLayout(SubmitPLayout);
        SubmitPLayout.setHorizontalGroup(
            SubmitPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Submit)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        SubmitPLayout.setVerticalGroup(
            SubmitPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        otp.setBackground(new java.awt.Color(153, 153, 255));
        otp.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        otp.setForeground(new java.awt.Color(255, 255, 255));
        otp.setText("Enter the 4 digit OTP sent to your email");
        otp.setBorder(null);
        otp.setEnabled(false);
        otp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otpMouseClicked(evt);
            }
        });
        otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpActionPerformed(evt);
            }
        });

        key.setBackground(new java.awt.Color(153, 153, 255));
        key.setFont(new java.awt.Font("Baloo Da 2", 0, 12)); // NOI18N
        key.setForeground(new java.awt.Color(255, 255, 255));
        key.setText("E nter your Username or Email");
        key.setBorder(null);
        key.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyMouseClicked(evt);
            }
        });
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baloo Da 2", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password");

        SubmitP1.setBackground(new java.awt.Color(153, 153, 255));
        SubmitP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SubmitP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitP1MouseClicked(evt);
            }
        });

        Submit1.setFont(new java.awt.Font("Baloo Da 2", 0, 14)); // NOI18N
        Submit1.setForeground(new java.awt.Color(255, 255, 255));
        Submit1.setText("BACK");

        javax.swing.GroupLayout SubmitP1Layout = new javax.swing.GroupLayout(SubmitP1);
        SubmitP1.setLayout(SubmitP1Layout);
        SubmitP1Layout.setHorizontalGroup(
            SubmitP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitP1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(Submit1)
                .addGap(29, 29, 29))
        );
        SubmitP1Layout.setVerticalGroup(
            SubmitP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitP1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(SubmitP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(SubmitP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 204));

        Image.setIcon(new javax.swing.ImageIcon("C:\\Users\\nano\\Documents\\NetBeansProjects\\Kaimono\\src\\main\\java\\kaimone\\groceries_290x290.png")); // NOI18N

        KaimonoH.setFont(new java.awt.Font("Baloo Da 2", 0, 30)); // NOI18N
        KaimonoH.setForeground(new java.awt.Color(255, 255, 255));
        KaimonoH.setText("Kaimono");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Image))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(KaimonoH)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(KaimonoH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitPMouseClicked
        if(key.getText().isBlank() || key.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
                conn con = new conn();

                //Creating account
                String check = "select * from userinfo where email = ? or username = ?";
                PreparedStatement st = con.c.prepareStatement(check);
                
                st.setString(1, key.getText());
                st.setString(2, key.getText());
                
                ResultSet rs = st.executeQuery();
                
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Email or Username is not Registered", "Error", JOptionPane.ERROR_MESSAGE);
                }       
                else{       
                    JOptionPane.showMessageDialog(null, "Email has been sent to you containing OTP");
                    this.otp.setEnabled(true);
                    this.Submit.setText("VERIFY");
                }
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_SubmitPMouseClicked

    private void otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otpActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void SubmitP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitP1MouseClicked
        LoginPage lp = new LoginPage();
        this.setVisible(false);
        lp.setVisible(true);
    }//GEN-LAST:event_SubmitP1MouseClicked

    private void keyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyMouseClicked
        this.key.setText("");
    }//GEN-LAST:event_keyMouseClicked

    private void otpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseClicked
        Random rn = new Random(9999);
        this.otp.setText("");
    }//GEN-LAST:event_otpMouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel KaimonoH;
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel Submit1;
    private javax.swing.JPanel SubmitP;
    private javax.swing.JPanel SubmitP1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField key;
    private javax.swing.JTextField otp;
    // End of variables declaration//GEN-END:variables
}
