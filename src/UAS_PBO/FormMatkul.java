/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS_PBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KYC
 */
public class FormMatkul extends javax.swing.JFrame {

    /**
     * Creates new form FormMatkul
     */
    public FormMatkul() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSKS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        rdbPeminatan = new javax.swing.JRadioButton();
        rdbWajib = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Form Mata Kuliah");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SKS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kelas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("W/P");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Semester");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kode");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));
        jPanel1.add(txtSKS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 220, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 220, -1));
        jPanel1.add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 220, -1));

        txtKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelasActionPerformed(evt);
            }
        });
        jPanel1.add(txtKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, -1));
        jPanel1.add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 220, -1));

        buttonGroup1.add(rdbPeminatan);
        rdbPeminatan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbPeminatan.setText("Peminatan");
        rdbPeminatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPeminatanActionPerformed(evt);
            }
        });
        jPanel1.add(rdbPeminatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        buttonGroup1.add(rdbWajib);
        rdbWajib.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbWajib.setText("Wajib");
        rdbWajib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbWajibActionPerformed(evt);
            }
        });
        jPanel1.add(rdbWajib, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        btnTambah.setBackground(new java.awt.Color(204, 204, 204));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/confirm.png"))); // NOI18N
        btnTambah.setText("Submit");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/confirm.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/360_F_240635575_EJifwRAbKsVTDnA3QE0bCsWG5TLhUNEZ.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbPeminatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPeminatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbPeminatanActionPerformed

    private void rdbWajibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbWajibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbWajibActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String kelas = txtKelas.getText();
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        String pilihan = "";
        if (rdbWajib.isSelected()) {
            pilihan = "W";
        } else if (rdbPeminatan.isSelected()) {
            pilihan = "P";
        }
        String semester = txtSemester.getText();
        String sks = txtSKS.getText();

        if (nama.isEmpty() || kelas.isEmpty() || kode.isEmpty() || semester.isEmpty() || sks.isEmpty() || pilihan.isEmpty()){
            JOptionPane.showMessageDialog(this,"Form Belum Terisi Semua", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int sksInt = Integer.parseInt(sks);
                int semesterInt = Integer.parseInt(semester);
                try (Connection conn = koneksi.getConnection();
                     PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tbl_matkul WHERE nama = ?");
                     PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM tbl_matkul WHERE kode = ?");
                     PreparedStatement stmt3 = conn.prepareStatement("INSERT INTO tbl_matkul (kelas, kode, nama, wp, semester, sks) VALUES (?, ?, ?, ?, ?, ?)")) {
                    stmt.setString(1, nama);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Nama Mata Kuliah Sudah Ada");
                    } else {
                        stmt2.setString(1, kode);
                        ResultSet res = stmt2.executeQuery();
                        if (res.next()) {
                            JOptionPane.showMessageDialog(this, "Kode Mata Kuliah Sudah Ada");
                        } else {
                            stmt3.setString(1, kelas);
                            stmt3.setString(2, kode);
                            stmt3.setString(3, nama);
                            stmt3.setString(4, pilihan);
                            stmt3.setInt(5, semesterInt);
                            stmt3.setInt(6, sksInt);
                            stmt3.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Penambahan Berhasil!");
                            ManajemenMatkul matkul = new ManajemenMatkul();
                            matkul.setVisible(true);
                            matkul.tampilData();
                            this.dispose();
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Semester dan SKS harus berupa angka.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Registration failed.");
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String ID = id.getInstance().getID();
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE tbl_matkul SET kelas=?, kode=?, nama=?, wp=?, semester=?, sks=? WHERE id_matkul=?");
            ps.setString(1, txtKelas.getText());
            ps.setString(2, txtKode.getText());
            ps.setString(3, txtNama.getText());
            String pilihan = "";
            if (rdbWajib.isSelected()) {
                pilihan = "W";
            } else if (rdbPeminatan.isSelected()) {
                pilihan = "P";
            }
            ps.setString(4, pilihan);
            ps.setString(5, txtSemester.getText());
            ps.setString(6, txtSKS.getText());
            ps.setString(7, ID);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate.");
                ManajemenMatkul matkul = new ManajemenMatkul();
                matkul.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data.");
            ManajemenMatkul matkul = new ManajemenMatkul();
            matkul.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(FormMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMatkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbPeminatan;
    private javax.swing.JRadioButton rdbWajib;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSKS;
    private javax.swing.JTextField txtSemester;
    // End of variables declaration//GEN-END:variables
    
    public void setBtnTambahVisibility(boolean visible) {
        btnTambah.setVisible(visible);
    }
    public void setBtnUpdateVisibility(boolean visible) {
        btnUpdate.setVisible(visible);
    }
    public void masukData(){
        String ID = id.getInstance().getID();
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tbl_matkul WHERE id_matkul = ?");
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtKelas.setText(rs.getString("kelas"));
                txtKode.setText(rs.getString("kode"));
                txtNama.setText(rs.getString("nama"));
                String pilihan = rs.getString("wp");
                if (pilihan.equals("W")){
                    rdbWajib.setSelected(true);
                } else {
                    rdbPeminatan.setSelected(true);
                }                      
                txtSemester.setText(rs.getString("semester"));
                txtSKS.setText(rs.getString("sks"));
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Data Gagal Diperoleh.");
        }
    }
    
    void clear(){
        txtKelas.setText("");
        txtKode.setText("");
        txtNama.setText("");
        txtSemester.setText("");
        rdbWajib.setSelected(false);
        rdbPeminatan.setSelected(false);
        txtSKS.setText("");
    }
}
