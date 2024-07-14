package desain_sistem;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class minum extends javax.swing.JFrame {
String sql;
String pilihan="";
int harga_minuman;
int jml_harga;
int bayar,beli,harga;
    public minum() {
        initComponents();
     Tampilkan_Data();
       
    }
    private void Kosongkan_Form(){
        jtxkode.setText("");
        jtxtotal.setText("");
        jtxjumlah.setText("");
        jtxharga.setText("");
        cmbminuman.setSelectedItem(null);
        jtxbayar.setText("");
        jtxkembalian.setText("");
       
        
    }
        private void Tampilkan_Data() {
            DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Transaksi");
            model.addColumn("Nama Minuman");
            model.addColumn("Harga Minuman");
            model.addColumn("Jumlah Minuman");
            model.addColumn("Total Belanja");
            model.addColumn("Pembayaran");
            model.addColumn("Kembalian");
           
            
            try {
                sql="SELECT * FROM `transaksi_minuman`";
                java.sql.Connection conn=(Connection) koneksi.configDB();
                java.sql.Statement stm=conn.createStatement();
                java.sql.ResultSet res=stm.executeQuery(sql);
                while (res.next()){
                    model.addRow(new Object[]{
                        res.getString(1), 
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                     
                        });
                }
                tblminum.setModel(model);
            } catch (SQLException e) {
                System.out.println("Error : " + e.getMessage());
            
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxnama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxkode = new javax.swing.JTextField();
        cmbminuman = new javax.swing.JComboBox<>();
        jtxharga = new javax.swing.JTextField();
        jtxjumlah = new javax.swing.JTextField();
        jtxcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblminum = new javax.swing.JTable();
        btncari = new javax.swing.JButton();
        jtxtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxbayar = new javax.swing.JTextField();
        jtxkembalian = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        btnkembalian = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Minuman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kode Transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jtxnama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxnama.setText("Nama Minuman");
        getContentPane().add(jtxnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Harga Minuman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah Minuman");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));
        getContentPane().add(jtxkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, -1));

        cmbminuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan", "Es Teh", "Es Teler", "Sop Buah", "Jus Alpukat", "Jus Jeruk", "Jus Naga", "Es Campur", "Jus Mangga" }));
        cmbminuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbminumanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbminuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));
        getContentPane().add(jtxharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 170, -1));
        getContentPane().add(jtxjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, -1));

        jtxcari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxcariActionPerformed(evt);
            }
        });
        getContentPane().add(jtxcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 30));

        tblminum.setBackground(new java.awt.Color(255, 204, 102));
        tblminum.setModel(new javax.swing.table.DefaultTableModel(
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
        tblminum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblminumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblminum);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 210));

        btncari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon cari.jpg"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 90, 50));
        getContentPane().add(jtxtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Belanja");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Bayar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Kembalian");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 20));
        getContentPane().add(jtxbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, -1));
        getContentPane().add(jtxkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 150, -1));

        btnhitung.setText("Hitung Total Transaksi");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, 20));

        btnkembalian.setText("Hitung Jumlah Kembalian");
        btnkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalianActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, 20));

        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/simpan.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, 40));

        btnbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon silang2.jpg"))); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, 40));

        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.jpg"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 110, 40));

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.jpg"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background login_1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbminumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbminumanActionPerformed
         int harga_minuman;
        pilihan = (String) cmbminuman.getSelectedItem();
      if(pilihan=="Es Teh"){
          harga_minuman=5000; 
         jtxharga.setText(""+Integer.toString(harga_minuman));
      }
       if(pilihan=="Es Teler"){
           harga_minuman=12000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if(pilihan=="Sop Buah"){
           harga_minuman=10000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if(pilihan=="Jus Alpukat "){
           harga_minuman=12000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if(pilihan=="Jus Jeruk") {
           harga_minuman=10000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if(pilihan=="Jus Naga") {
           harga_minuman=10000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if (pilihan=="Es Campur") {
           harga_minuman=12000;
       jtxharga.setText(""+Integer.toString(harga_minuman));
       }
       if (pilihan=="Jus Mangga") {
           harga_minuman=10000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
        }
       if(pilihan=="Jus Apel") {
           harga_minuman=10000;
           jtxharga.setText(""+Integer.toString(harga_minuman));
       }
      
    }//GEN-LAST:event_cmbminumanActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
          harga=Integer.parseInt(jtxharga.getText());
    beli=Integer.parseInt(jtxjumlah.getText());
    bayar=harga*beli;
    DecimalFormat angka= new DecimalFormat("###,###");
    jtxtotal.setText(""+Integer.toString(bayar));
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalianActionPerformed
      int kembali = Integer.parseInt(jtxbayar.getText());
     int total = kembali-bayar;
     jtxkembalian.setText("Rp "+Integer.toString(total));
     JOptionPane.showMessageDialog(this, "transaksi selesai");
     
    }//GEN-LAST:event_btnkembalianActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
      try {
        sql = "INSERT INTO `transaksi_minuman` VALUES ('"+jtxkode.getText()+"','"+cmbminuman.getSelectedItem()+"','"+jtxharga.getText()+"','"+jtxjumlah.getText()+"','"+jtxtotal.getText()+"','"+jtxbayar.getText()+"','"+jtxkembalian.getText()+"')";
        java.sql.Connection conn=(Connection) koneksi.configDB();
        java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "proses simpan berhasil");
        Tampilkan_Data();
        Kosongkan_Form();
        Kosongkan_Form();
        
    }catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
    Kosongkan_Form();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
         try {
        sql="DELETE FROM `transaksi_minuman` WHERE kode_transaksi='"+jtxkode.getText()+"'";
        java.sql.Connection conn=(Connection) koneksi.configDB();
        java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        Tampilkan_Data();
    Kosongkan_Form();
    Kosongkan_Form();
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
     dispose();
     new pilihan_kasir().setVisible(true);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tblminumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblminumMouseClicked
        int jTable1 = tblminum.getSelectedRow();
        String a = tblminum.getValueAt(jTable1, 0).toString();
        String b = tblminum.getValueAt(jTable1, 1).toString();
        String c = tblminum.getValueAt(jTable1, 2).toString();
        String d = tblminum.getValueAt(jTable1, 3).toString();
        String e = tblminum.getValueAt(jTable1, 4).toString();
        String f = tblminum.getValueAt(jTable1, 5).toString();
        String g = tblminum.getValueAt(jTable1, 6).toString();
        
        jtxkode.setText(a);
        cmbminuman.setSelectedItem(b);
        jtxharga.setText(c);
        jtxjumlah.setText(d);
        jtxtotal.setText(e);
        jtxbayar.setText(f);
        jtxkembalian.setText(g);
    }//GEN-LAST:event_tblminumMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
         try {
        DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Transaksi");
            model.addColumn("Nama Minuman");
            model.addColumn("Harga Minuman");
            model.addColumn("Jumlah Minuman");
            model.addColumn("Total Belanja");
            model.addColumn("Pembayaran");
            model.addColumn("Kembalian");
            
        sql="SELECT * FROM `transaksi_minuman` WHERE `kode_transaksi` like '%"+jtxcari.getText()+"%'"
                +"or `nama_minuman`like '%"+jtxcari.getText()+"%'";
                java.sql.Connection conn=(Connection) koneksi.configDB();
                java.sql.Statement stm=conn.createStatement();
                java.sql.ResultSet res=stm.executeQuery(sql);
           while (res.next()){
                    model.addRow(new Object[]{
                        res.getString(1), 
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                        });
                }
                tblminum.setModel(model);
    }catch (HeadlessException | SQLException e) {
    }
    }//GEN-LAST:event_btncariActionPerformed

    private void jtxcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxcariActionPerformed

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
            java.util.logging.Logger.getLogger(minum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(minum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(minum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(minum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkembalian;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbminuman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxbayar;
    private javax.swing.JTextField jtxcari;
    private javax.swing.JTextField jtxharga;
    private javax.swing.JTextField jtxjumlah;
    private javax.swing.JTextField jtxkembalian;
    private javax.swing.JTextField jtxkode;
    private javax.swing.JLabel jtxnama;
    private javax.swing.JTextField jtxtotal;
    private javax.swing.JTable tblminum;
    // End of variables declaration//GEN-END:variables
}
