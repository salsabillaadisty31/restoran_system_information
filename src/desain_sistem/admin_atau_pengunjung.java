/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desain_sistem;

/**
 *
 * @author ACER
 */
public class admin_atau_pengunjung extends javax.swing.JFrame {

    /**
     * Creates new form admin_atau_pengunjung
     */
    public admin_atau_pengunjung() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnadmin = new javax.swing.JButton();
        btnkasir = new javax.swing.JButton();
        btnabout = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\"Di Restoran Anak Rantau\"");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 30));

        jLabel2.setFont(new java.awt.Font("Broadway", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELAMAT DATANG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/admin2.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/nasipadang.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 210, 160));

        btnadmin.setBackground(new java.awt.Color(255, 255, 204));
        btnadmin.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnadmin.setText("ADMIN");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, -1));

        btnkasir.setBackground(new java.awt.Color(255, 255, 204));
        btnkasir.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnkasir.setText("KASIR");
        btnkasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkasirActionPerformed(evt);
            }
        });
        jPanel1.add(btnkasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, -1));

        btnabout.setBackground(new java.awt.Color(255, 255, 204));
        btnabout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/INFORMASI.png"))); // NOI18N
        btnabout.setText("ABOUT");
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });
        jPanel1.add(btnabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        btnkeluar.setBackground(new java.awt.Color(255, 255, 204));
        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.jpg"))); // NOI18N
        btnkeluar.setText("KELUAR");
        jPanel1.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/backgroundd.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
      dispose();
      new login().setVisible(true);
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkasirActionPerformed
      dispose();
      new pilihan_kasir().setVisible(true);
    }//GEN-LAST:event_btnkasirActionPerformed

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
    dispose();
     new desain_about().setVisible(true);
    }//GEN-LAST:event_btnaboutActionPerformed

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
            java.util.logging.Logger.getLogger(admin_atau_pengunjung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_atau_pengunjung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_atau_pengunjung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_atau_pengunjung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_atau_pengunjung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btnkasir;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
