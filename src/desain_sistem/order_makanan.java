
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

public class order_makanan extends javax.swing.JFrame {
String sql;
String pilihan="";
int harga_makanan;
int jml_harga;
int bayar,beli,harga;
    public order_makanan() {
        initComponents();
     Tampilkan_Data();
       
    }
    private void Kosongkan_Form(){
        jtxkode.setText("");
        jtxtotaal.setText("");
        jtxjumlah.setText("");
        jtxharga.setText("");
        cmbnama.setSelectedItem(null);
        jtxbayar.setText("");
        jtxkembalian.setText("");
       
        
    }
        private void Tampilkan_Data() {
            DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Transaksi");
            model.addColumn("Nama Makanan");
            model.addColumn("Harga Makanan");
            model.addColumn("Jumlah Makanan");
            model.addColumn("Total Belanja");
            model.addColumn("Pembayaran");
            model.addColumn("Kembalian");
           
            
            try {
                sql="SELECT * FROM `transaksi_makanan`";
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
                tabtransaksi.setModel(model);
            } catch (SQLException e) {
                System.out.println("Error : " + e.getMessage());
            
        }
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxkode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxjumlah = new javax.swing.JTextField();
        jtxtotal = new javax.swing.JLabel();
        jtxtotaal = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxbayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxkembalian = new javax.swing.JTextField();
        btnkembalian = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabtransaksi = new javax.swing.JTable();
        btncari = new javax.swing.JButton();
        jtxcari = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        cmbnama = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtxharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Makanan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kode Transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jtxkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxkodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Makanan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah Makanan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));
        getContentPane().add(jtxjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jtxtotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtotal.setText("Total Belanja");
        getContentPane().add(jtxtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 20));

        jtxtotaal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtotaalActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtotaal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 130, -1));

        btnhitung.setBackground(new java.awt.Color(255, 255, 204));
        btnhitung.setText("Hitung Total Transaksi");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Bayar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 70, 20));

        jtxbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxbayarActionPerformed(evt);
            }
        });
        getContentPane().add(jtxbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kembalian");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 20));
        getContentPane().add(jtxkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, -1));

        btnkembalian.setBackground(new java.awt.Color(255, 255, 204));
        btnkembalian.setText("Hitung Jumlah Kembalian");
        btnkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalianActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 143, 180, 30));

        tabtransaksi.setBackground(new java.awt.Color(255, 204, 102));
        tabtransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabtransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabtransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabtransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 590, 220));

        btncari.setBackground(new java.awt.Color(255, 255, 204));
        btncari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon cari.jpg"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, 30));
        getContentPane().add(jtxcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 150, 30));

        btnsimpan.setBackground(new java.awt.Color(255, 255, 204));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/simpan.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 110, 40));

        btnhapus.setBackground(new java.awt.Color(255, 255, 204));
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.jpg"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 110, 40));

        btnbatal.setBackground(new java.awt.Color(255, 255, 204));
        btnbatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon silang2.jpg"))); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 110, 40));

        btnkeluar.setBackground(new java.awt.Color(255, 255, 204));
        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.jpg"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 110, 40));

        cmbnama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu Pilihan", "Rendang", "Dendeng Balado", "Dendeng Batokok", "Gulai Itiak", "Kalo Daging", "Cancang", "Lamang Tapai", "Sate Danguang" }));
        cmbnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnamaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Harga Makanan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));
        getContentPane().add(jtxharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background login_1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxkodeActionPerformed

    private void cmbnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnamaActionPerformed
      int harga_makanan;
        pilihan = (String) cmbnama.getSelectedItem();
      if(pilihan=="Rendang"){
          harga_makanan=20000; 
         jtxharga.setText(""+Integer.toString(harga_makanan));
      }
       if(pilihan=="Dendeng Balado"){
           harga_makanan=18000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
       if(pilihan=="Dendeng Batokok"){
           harga_makanan=18000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
       if(pilihan=="Gulai Itiak "){
           harga_makanan=22000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
       if(pilihan=="Kalo Daging") {
           harga_makanan=20000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
        if(pilihan=="Gulai Tauco") {
           harga_makanan=17000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
         if(pilihan=="Cancang") {
           harga_makanan=23000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
          if(pilihan=="Lamang Tapai") {
           harga_makanan=10000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
           if(pilihan=="Sate Danguang") {
           harga_makanan=15000;
           jtxharga.setText(""+Integer.toString(harga_makanan));
       }
//      switch (pilihan){
//          case "Rendang":
//              harga_makanan=20000;
//              break;
//          case "Dendeng Balado":
//              harga_makanan=18000;
//              break;
//          case"Dendeng Batokok":
//              harga_makanan=18000;
//              break;
//          case"Gulai Itiak":
//              harga_makanan=15000;
//              break;
//        }
  
    }//GEN-LAST:event_cmbnamaActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
    
        harga=Integer.parseInt(jtxharga.getText());
    beli=Integer.parseInt(jtxjumlah.getText());
    bayar=harga*beli;
    DecimalFormat angka= new DecimalFormat("###,###");
    jtxtotaal.setText(""+Integer.toString(bayar));
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalianActionPerformed
     int kembali = Integer.parseInt(jtxbayar.getText());
     int total = kembali-bayar;
     jtxkembalian.setText("Rp "+Integer.toString(total));
     JOptionPane.showMessageDialog(this, "transaksi selesai");
     
    }//GEN-LAST:event_btnkembalianActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        try {
        sql = "INSERT INTO `transaksi_makanan` VALUES ('"+jtxkode.getText()+"','"+cmbnama.getSelectedItem()+"','"+jtxharga.getText()+"','"+jtxjumlah.getText()+"','"+jtxtotaal.getText()+"','"+jtxbayar.getText()+"','"+jtxkembalian.getText()+"')";
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

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    try {
        sql="DELETE FROM `transaksi_makanan` WHERE kode_transaksi='"+jtxkode.getText()+"'";
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

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
    Kosongkan_Form();
   
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
     try {
        DefaultTableModel model= new DefaultTableModel();
            model.addColumn("Kode Transaksi");
            model.addColumn("Nama Makanan");
            model.addColumn("Harga Makanan");
            model.addColumn("Jumlah Makanan");
            model.addColumn("Total Belanja");
            model.addColumn("Pembayaran");
            model.addColumn("Kembalian");
            
             String sql="SELECT * FROM `transaksi_makanan` WHERE `kode_transaksi` like '%"+jtxcari.getText()+"%'"
                +"or `nama_makanan`like '%"+jtxcari.getText()+"%'";
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
                tabtransaksi.setModel(model);
    }catch (HeadlessException | SQLException e) {
        
    }
    }//GEN-LAST:event_btncariActionPerformed

    private void tabtransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtransaksiMouseClicked
    int jTable1 = tabtransaksi.getSelectedRow();
        String a = tabtransaksi.getValueAt(jTable1, 0).toString();
        String b = tabtransaksi.getValueAt(jTable1, 1).toString();
        String c = tabtransaksi.getValueAt(jTable1, 2).toString();
        String d = tabtransaksi.getValueAt(jTable1, 3).toString();
        String e = tabtransaksi.getValueAt(jTable1, 4).toString();
        String f = tabtransaksi.getValueAt(jTable1, 5).toString();
        String g = tabtransaksi.getValueAt(jTable1, 6).toString();
        
        jtxkode.setText(a);
        cmbnama.setSelectedItem(b);
        jtxharga.setText(c);
        jtxjumlah.setText(d);
        jtxtotaal.setText(e);
        jtxbayar.setText(f);
        jtxkembalian.setText(g);
        
       
    }//GEN-LAST:event_tabtransaksiMouseClicked

    private void jtxbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxbayarActionPerformed
      harga=Integer.parseInt(jtxharga.getText());
    beli=Integer.parseInt(jtxjumlah.getText());
    bayar=harga*beli;
    DecimalFormat angka= new DecimalFormat("###,###");
    jtxtotal.setText(""+Integer.toString(bayar));
    }//GEN-LAST:event_jtxbayarActionPerformed

    private void jtxtotaalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtotaalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtotaalActionPerformed

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
            java.util.logging.Logger.getLogger(order_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_makanan().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbnama;
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
    private javax.swing.JTextField jtxtotaal;
    private javax.swing.JLabel jtxtotal;
    private javax.swing.JTable tabtransaksi;
    // End of variables declaration//GEN-END:variables
}
