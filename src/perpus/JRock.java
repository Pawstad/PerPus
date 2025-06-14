/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpus;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jati
 */
public class JRock extends javax.swing.JFrame {

    private service.MysqlBukuService bukuService = new service.MysqlBukuService();
    
    /**
     * Creates new form JRock
     */
    public JRock() {
        initComponents();
        loadDataToTable(); 
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jButton_Add = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jTextField_Judul = new javax.swing.JTextField();
        jTextField_Status = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Penulis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Fiksi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Peminjam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_Peminjam = new javax.swing.JButton();
        jButton_Kembalikan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Admin = new javax.swing.JLabel();
        jButton_NewVisitor = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Buku", "Judul Buku", "Penulis", "Ketersediaan", "Peminjam"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBuku);

        jButton_Add.setText("Tambah");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Remove.setText("Hapus");
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        jButton_Edit.setText("Edit");

        jLabel1.setText("Judul Buku :");

        jLabel2.setText("Status        :");

        jTextField_Penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PenulisActionPerformed(evt);
            }
        });

        jLabel3.setText("Penulis     :");

        jComboBox_Fiksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiksi", "Non-Fiksi" }));

        jLabel4.setText("Nadip    :");

        jLabel5.setText("Peminjam :");

        jButton_Peminjam.setText("Pinjamkan");

        jButton_Kembalikan.setText("Kembalikan");

        jLabel6.setText("Nama Admin :");

        jLabel_Admin.setText("Helmi Love Balls");

        jButton_NewVisitor.setText("Visitor Baru");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Admin))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Add)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton_Remove)
                                        .addGap(48, 48, 48)
                                        .addComponent(jButton_Edit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Penulis)
                                    .addComponent(jComboBox_Fiksi, 0, 110, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_NewVisitor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Peminjam)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Kembalikan)))))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton_Peminjam)
                    .addComponent(jButton_Kembalikan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Fiksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton_NewVisitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add)
                    .addComponent(jButton_Remove)
                    .addComponent(jButton_Edit))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_Admin))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PenulisActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        try {
            String judul = jTextField_Judul.getText();
            String penulis = jTextField_Penulis.getText();
            String selectedFiksi = jComboBox_Fiksi.getSelectedItem().toString();

            if ((judul.isEmpty() || judul.equals("Nama Buku")) &&
                (penulis.isEmpty() || penulis.equals("Penulis"))) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Judul dan Penulis tidak boleh kosong!", 
                    "error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            model.Buku bukuBaru = bukuService.createBuku();
            bukuBaru.setJudul(judul);
            bukuBaru.setPenulis(penulis);
            bukuBaru.setIsFiksi(selectedFiksi.equals("Fiksi"));
            bukuService.addBuku(bukuBaru);

            loadDataToTable();
            clearForm();
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Buku berhasil ditambahkan!", 
                "Success", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Error menambahkan buku: " + e.getMessage(), 
            "Error", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton_AddActionPerformed

    private void clearForm() {
        jTextField_Judul.setText("Nama Buku");
        jTextField_Penulis.setText("Penulis");
        jTextField_Status.setText("Status");
        jTextField_Peminjam.setText("Peminjam");
        jComboBox_Fiksi.setSelectedIndex(0);
    }
    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:
            try {
        // Cek apakah ada baris yang dipilih
        int selectedRow = jTableBuku.getSelectedRow();
        
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Pilih buku yang akan dihapus terlebih dahulu!", 
                "Peringatan", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Ambil data dari baris yang dipilih
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        int idBuku = (Integer) model.getValueAt(selectedRow, 0);
        String judulBuku = (String) model.getValueAt(selectedRow, 1);
        String ketersediaan = (String) model.getValueAt(selectedRow, 3);
        
        // Cek apakah buku sedang dipinjam
        if ("Dipinjam".equals(ketersediaan)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Buku sedang dipinjam dan tidak dapat dihapus!", 
                "Peringatan", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Konfirmasi penghapusan
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus buku:\n\"" + judulBuku + "\"?", 
            "Konfirmasi Hapus", 
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE);
        
        if (confirm != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }
        
        // Buat objek Buku untuk dihapus
        model.Buku bukuToDelete = bukuService.createBuku();
        bukuToDelete.setId_buku(idBuku);
        
        // Hapus dari database
        bukuService.deleteBuku(bukuToDelete);
        
        // Refresh tabel
        loadDataToTable();
        
        // Reset form
        clearForm();
        
        // Tampilkan pesan sukses
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Buku \"" + judulBuku + "\" berhasil dihapus!", 
            "Success", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Error menghapus buku: " + e.getMessage(), 
            "Error", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    

    }//GEN-LAST:event_jButton_RemoveActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(JRock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRock().setVisible(true);
            }
        });
    }

        // Tambahkan method untuk load data ke tabel
    private void loadDataToTable() {
        try {
            // Ambil DefaultTableModel dari database menggunakan service
            DefaultTableModel model = bukuService.getBukuTableModel();
            
            // Set model ke jTableBuku
            jTableBuku.setModel(model);
            
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error loading data: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Kembalikan;
    private javax.swing.JButton jButton_NewVisitor;
    private javax.swing.JButton jButton_Peminjam;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JComboBox<String> jComboBox_Fiksi;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextField_Judul;
    private javax.swing.JTextField jTextField_Peminjam;
    private javax.swing.JTextField jTextField_Penulis;
    private javax.swing.JTextField jTextField_Status;
    // End of variables declaration//GEN-END:variables
}
