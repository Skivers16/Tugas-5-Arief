/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylaundry;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Mylaundry_login extends javax.swing.JFrame {

    /**
     * Creates new form mylaundry_login
     */
    public Mylaundry_login() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnClose1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(255, 255, 255));
        btnClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose1.setText("X");
        btnClose1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose1MouseClicked(evt);
            }
        });
        jPanel3.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylaundry/laundry-basket.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, 100));

        jLabel2.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MyLaundry");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 300, 80));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylaundry/key.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 90, 70));

        txtUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 153, 153));
        txtUsername.setText("Masukan Username");
        txtUsername.setBorder(null);
        txtUsername.setOpaque(false);
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 260, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 270, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylaundry/user.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 70));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 510, 20));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 153, 153));
        txtPassword.setText("Masukan Password");
        txtPassword.setBorder(null);
        txtPassword.setOpaque(false);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 260, 30));

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setLabel("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 410, 50));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 270, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnClose1MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         
        String user="admin";
        String pass="admin";
        
        String username = txtUsername.getText();
         String password = txtPassword.getText();
   
     if (username.equals(user) && password.equals(pass)){
         this.setVisible(false);
         new mylaundry_payment().setVisible(true);
     }
     else { 
         javax.swing.JOptionPane.showMessageDialog(null, "Username dan Password salah");
         txtUsername.setText("");
         txtPassword.setText("");
         
     }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Mylaundry_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mylaundry_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
