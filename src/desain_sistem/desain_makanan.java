package desain_sistem;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class desain_makanan extends javax.swing.JFrame {
String sql;

    public desain_makanan() {
        initComponents();
        
        Tampilkan_Data();
       
    }
    private void Kosongkan_Form(){
        jtxkode.setEditable(true);
        jtxkode.setText(null);
        jtxnama.setText(null);
        jtxharga.setText(null);
    }
        private void Tampilkan_Data() {
            DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Makanan");
            model.addColumn("Nama Makanan");
            model.addColumn("Harga Makanan");
           
                       
            try {
                String sql="SELECT * FROM `makanan`";
                java.sql.Connection conn=(Connection) koneksi.configDB();
                java.sql.Statement stm=conn.createStatement();
                java.sql.ResultSet res=stm.executeQuery(sql);
                while (res.next()){
                    model.addRow(new Object[]{
                        res.getString(1), 
                        res.getString(2),
                        res.getString(3),
                       
                        
                        });
                }
                tabmakanan.setModel(model);
            } catch (SQLException e) {
                System.out.println("Error : " + e.getMessage());
            
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxkode = new javax.swing.JTextField();
        jtxnama = new javax.swing.JTextField();
        jtxharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabmakanan = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        jtxcari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Menu Makanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kode Makanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Makanan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Harga Makanan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 30));
        jPanel1.add(jtxkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 230, 30));
        jPanel1.add(jtxnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 230, 30));
        jPanel1.add(jtxharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 230, 30));

        tabmakanan.setBackground(new java.awt.Color(255, 204, 102));
        tabmakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabmakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabmakananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabmakanan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 620, 250));

        btnsimpan.setBackground(new java.awt.Color(255, 255, 204));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/simpan.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 110, 40));

        btnedit.setBackground(new java.awt.Color(255, 255, 204));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.jpg"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 110, 40));

        btnhapus.setBackground(new java.awt.Color(255, 255, 204));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.jpg"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 110, 40));

        btnbatal.setBackground(new java.awt.Color(255, 255, 204));
        btnbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon silang2.jpg"))); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 110, 40));

        btnkeluar.setBackground(new java.awt.Color(255, 255, 204));
        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.jpg"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 110, 40));

        btncari.setBackground(new java.awt.Color(255, 255, 204));
        btncari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon cari.jpg"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jPanel1.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 40));
        jPanel1.add(jtxcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background login_1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
         try {
        sql = "INSERT INTO `makanan` VALUES ('"+jtxkode.getText()+"','"+jtxnama.getText()+"','"+jtxharga.getText()+"')";
        java.sql.Connection conn=(Connection) koneksi.configDB();
        java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "proses simpan berhasil");
        Tampilkan_Data();
        Kosongkan_Form();
    }catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    try {
        String sql = "UPDATE `makanan` SET kode_makanan='"+jtxkode.getText()
                +"',nama_makanan='"+jtxnama.getText()
                +"',harga_makanan='"+jtxharga.getText()
                +"' WHERE kode_makanan ='"+jtxkode.getText()+"'";
        java.sql.Connection conn=(Connection) koneksi.configDB();
        java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "EDIT DATA BERHASIL");
        Tampilkan_Data();
        Kosongkan_Form();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
       Kosongkan_Form();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
        sql="DELETE FROM `makanan` WHERE kode_makanan='"+jtxkode.getText()+"'";
        java.sql.Connection conn=(Connection) koneksi.configDB();
        java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        Tampilkan_Data();
    Kosongkan_Form();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
     dispose();
    new menu_admin().setVisible(true);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
     try {
        DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Makanan");
            model.addColumn("Nama Makanan");
            model.addColumn("Harga Makanan");
           
        String sql="SELECT * FROM `makanan` WHERE `kode_makanan` like '%"+jtxcari.getText()+"%'"
                +"or `nama_makanan`like '%"+jtxcari.getText()+"%'";
         java.sql.Connection conn=(Connection) koneksi.configDB();
                java.sql.Statement stm=conn.createStatement();
                java.sql.ResultSet res=stm.executeQuery(sql);
           while (res.next()){
                    model.addRow(new Object[]{
                        res.getString(1), 
                        res.getString(2),
                        res.getString(3)
                        
                        });
                }
                tabmakanan.setModel(model);
    }catch (HeadlessException | SQLException e) {
        
    }
    }//GEN-LAST:event_btncariActionPerformed

    private void tabmakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabmakananMouseClicked
   int jTable1 = tabmakanan.getSelectedRow();
        String a = tabmakanan.getValueAt(jTable1, 0).toString();
        String b = tabmakanan.getValueAt(jTable1, 1).toString();
        String c = tabmakanan.getValueAt(jTable1, 2).toString();
       
        
        jtxkode.setText(a);
        jtxnama.setText(b);
        jtxharga.setText(c);
    }//GEN-LAST:event_tabmakananMouseClicked

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
            java.util.logging.Logger.getLogger(desain_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desain_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desain_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desain_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desain_makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxcari;
    private javax.swing.JTextField jtxharga;
    private javax.swing.JTextField jtxkode;
    private javax.swing.JTextField jtxnama;
    private javax.swing.JTable tabmakanan;
    // End of variables declaration//GEN-END:variables
}
