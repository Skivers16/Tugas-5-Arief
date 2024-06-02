/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylaundry;

import javax.swing.JFrame;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.logging.Level;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author p
 */
public class Mylaundry_admin extends javax.swing.JFrame {

   
    int total;
    /**
     * Creates new form cobalagi
     */
    public Mylaundry_admin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tbl_transaksi();
        kosong();
    }
    
    private void tbl_transaksi(){
    
       try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn ("NO");
            model.addColumn ("Nama");
            model.addColumn ("Tanggal");
            model.addColumn ("Jenis Cuci");
            model.addColumn ("Berat");
            model.addColumn ("Total");
            
            
            

              int no=1;
              String sql= " select * from payment";
              java.sql.Connection conn=(Connection)Config.configDB();
              java.sql.Statement stm=conn.createStatement();
              java.sql.ResultSet res=stm.executeQuery(sql);

              while (res.next()){

                  model.addRow(new Object[]{no++, res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            txtTable.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private void kosong(){
        JenisCuci.setSelectedItem("Pilih");
        txtBerat.setText("");
        txtHarga.setText("");
        txtTotal.setText("");
        txtNama.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JenisCuci = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylaundry/laundry-basket.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, 92));

        jLabel2.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("MyLaundry");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 248, 45));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("H I S T O R Y  T R A N S A K S I");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 295, -1));

        txtTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Tanggal", "Jenis Cuci", "Berat (kg)", "Total"
            }
        ));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTable);
        if (txtTable.getColumnModel().getColumnCount() > 0) {
            txtTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            txtTable.getColumnModel().getColumn(0).setMaxWidth(10);
            txtTable.getColumnModel().getColumn(1).setResizable(false);
            txtTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 790, 110));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Total");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        txtNama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 238, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Nama");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        JenisCuci.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JenisCuci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Cuci Kering", "Cuci Basah", "Cuci Setrika", " " }));
        JenisCuci.setOpaque(false);
        JenisCuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisCuciActionPerformed(evt);
            }
        });
        jPanel3.add(JenisCuci, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 238, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Jenis Cuci");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        txtBerat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeratActionPerformed(evt);
            }
        });
        txtBerat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBeratKeyReleased(evt);
            }
        });
        jPanel3.add(txtBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 238, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Berat");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 238, -1));

        txtHarga.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        jPanel3.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 90, -1));

        btnSimpan.setBackground(new java.awt.Color(204, 255, 255));
        btnSimpan.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(0, 153, 153));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSimpan.setOpaque(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 189, 40));

        btnCancel1.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel1.setText("Cancel");
        btnCancel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel1.setOpaque(false);
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 189, 40));

        btnHapus.setBackground(new java.awt.Color(255, 204, 204));
        btnHapus.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHapus.setOpaque(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 189, 40));

        btnRefresh.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 153, 153));
        btnRefresh.setText("Transaksi");
        btnRefresh.setBorder(null);
        btnRefresh.setOpaque(false);
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        jPanel3.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 100, 40));

        btnRefresh1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(0, 153, 153));
        btnRefresh1.setText("Refresh");
        btnRefresh1.setBorder(null);
        btnRefresh1.setOpaque(false);
        btnRefresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefresh1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRefresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 100, 40));

        btnLogout.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setOpaque(false);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtBeratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeratKeyReleased
        int berat = Integer.parseInt(txtBerat.getText());
        int harga = Integer.parseInt(txtHarga.getText());
        total = berat*harga;
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtBeratKeyReleased

    private void txtBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeratActionPerformed
        int berat = Integer.parseInt(txtBerat.getText());
        int harga = Integer.parseInt(txtHarga.getText());
        total = berat*harga;
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtBeratActionPerformed

    private void JenisCuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisCuciActionPerformed
        if(JenisCuci.getSelectedItem().equals("Cuci Kering")){
            txtHarga.setText("4000");
        } else if(JenisCuci.getSelectedItem().equals("Cuci Basah")){
            txtHarga.setText("5000");
        } else if(JenisCuci.getSelectedItem().equals("Cuci Setrika")){
            txtHarga.setText("6000");
        } else {
            txtHarga.setText("0");
        }
    }//GEN-LAST:event_JenisCuciActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        int baris = txtTable.rowAtPoint(evt.getPoint());
        String username = txtTable.getValueAt(baris, 1).toString();
        txtNama.setText(username);
        String tgl = txtTable.getValueAt(baris, 2).toString();
        
        String jeniscuci = txtTable.getValueAt(baris, 3).toString();
        JenisCuci.setSelectedItem(jeniscuci);
        String  berat = txtTable.getValueAt(baris, 4).toString();
        txtBerat.setText(berat);
        String  Total = txtTable.getValueAt(baris, 5).toString();
        txtTotal.setText(Total);

    }//GEN-LAST:event_txtTableMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Update Data ini?","Confirmation",JOptionPane.YES_NO_OPTION);
         try {
            String sql ="UPDATE payment SET jenis_cuci = '"+JenisCuci.getSelectedItem()+"', berat = '"+txtBerat.getText()+"',total= '"+txtTotal.getText()+"' WHERE username = '"+txtNama.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        JenisCuci.setSelectedItem("Pilih");
        txtBerat.setText("");
        txtHarga.setText("");
        txtTotal.setText("");
        txtNama.setText("");
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            
            
            
            String sql ="delete from payment where username='"+txtNama.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus data ini ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
       }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        
        tbl_transaksi();
        kosong();
                 } 
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        this.setVisible(false);
        new mylaundry_payment().setVisible(true);
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnRefresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefresh1MouseClicked
        this.setVisible(false);
        new Mylaundry_admin().setVisible(true);
    }//GEN-LAST:event_btnRefresh1MouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        this.setVisible(false);
        new Mylaundry_login().setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Mylaundry_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mylaundry_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mylaundry_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JenisCuci;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTable txtTable;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
