/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.UTS;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author farhandwihartanto
 */
public class ListrikPolnes extends javax.swing.JFrame {

    /**
     * Creates new form Uts
     */
    public ListrikPolnes() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbGolongan = new javax.swing.JComboBox<>();
        txtPemakaianKwh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblPpj = new javax.swing.JLabel();
        lblGolongan = new javax.swing.JLabel();
        lblTotalTagihan = new javax.swing.JLabel();
        lblPemakaian = new javax.swing.JLabel();
        lblBlokPemakaian = new javax.swing.JLabel();
        lblBiayaBeban = new javax.swing.JLabel();
        lblBiayaTransaksi = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GOLONGAN");

        jLabel2.setText("PEMAKAIAN");

        jLabel3.setText(":");

        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 3, 24)); // NOI18N
        jLabel5.setText("PT POLNES BERDAYA");

        cmbGolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "S-1 450 VA", "S-1 900 VA", "S-1 1300 VA", "S-1 2200 VA" }));

        jLabel6.setText("kwh");

        jLabel7.setText("GOLONGAN");

        jLabel8.setText(":");

        jLabel9.setText("PEMAKAIAN");

        jLabel10.setText(":");

        jLabel11.setText("BIAYA BLOK PEMAKAIAN");

        jLabel12.setText(":");

        jLabel13.setText("BIAYA BEBAN");

        jLabel14.setText(":");

        jLabel15.setText("PAJAK PENERANGAN JALAN");

        jLabel16.setText(":");

        jLabel17.setText("TOTAL TAGIHAN");

        jLabel18.setText(":");

        jLabel19.setText("BIAYA TRANSAKSI");

        jLabel20.setText(":");

        lblPpj.setText("-");

        lblGolongan.setText("-");

        lblTotalTagihan.setText("-");

        lblPemakaian.setText("-");

        lblBlokPemakaian.setText("-");

        lblBiayaBeban.setText("-");

        lblBiayaTransaksi.setText("-");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSubmit)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbGolongan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPemakaianKwh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6)
                            .addGap(35, 35, 35)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGolongan, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(lblPemakaian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBlokPemakaian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBiayaBeban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBiayaTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalTagihan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addComponent(cmbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtPemakaianKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblGolongan)
                        .addGap(18, 18, 18)
                        .addComponent(lblPemakaian)
                        .addGap(18, 18, 18)
                        .addComponent(lblBlokPemakaian)
                        .addGap(18, 18, 18)
                        .addComponent(lblBiayaBeban)
                        .addGap(18, 18, 18)
                        .addComponent(lblPpj)
                        .addGap(18, 18, 18)
                        .addComponent(lblBiayaTransaksi)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalTagihan))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double getTotalBiayaPemakaian(double jumlahKwh, double biayaBlok) {
        return jumlahKwh * biayaBlok;
    }

    double getTotalTagihan(double totalPemakaian, double pajakPeneranganJalan, double biayaTransaksi, double biayaBeban) {
        return totalPemakaian + pajakPeneranganJalan + biayaTransaksi + biayaBeban;
    }

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        double biayaBeban = 0, biayaBlokPemakaian = 0, biayaTransaksi = 2500, pajakPeneranganJalan = 0.1;
        String golongan = cmbGolongan.getSelectedItem().toString().toLowerCase();
        double jumlahKwh = Double.parseDouble(txtPemakaianKwh.getText());
        if (golongan.equals("s-1 450 va")) {
            biayaBeban += 10000;
            if (jumlahKwh > 0 && jumlahKwh <= 30) {
                biayaBlokPemakaian += 123;
            } else if (jumlahKwh >= 31 && jumlahKwh <= 60) {
                biayaBlokPemakaian += 265;
            } else if (jumlahKwh > 60) {
                biayaBlokPemakaian += 360;
            } else {
                biayaBlokPemakaian = 0;
                biayaTransaksi = 0;
                biayaBeban = 0;
                pajakPeneranganJalan = 0;
            }
        } else if (golongan.equals("s-1 900 va")) {
            biayaBeban += 15000;
            if (jumlahKwh > 0 && jumlahKwh <= 30) {
                biayaBlokPemakaian += 200;
            } else if (jumlahKwh >= 31 && jumlahKwh <= 60) {
                biayaBlokPemakaian += 295;
            } else if (jumlahKwh > 60) {
                biayaBlokPemakaian += 360;
            } else {
                biayaBlokPemakaian = 0;
                pajakPeneranganJalan = 0;
                biayaTransaksi = 0;
                biayaBeban = 0;
            }
        } else if (golongan.equals("s-1 1300 va")) {
            if (jumlahKwh <= 0) {
                biayaBlokPemakaian = 0;
                biayaTransaksi = 0;
                pajakPeneranganJalan = 0;
            }
            biayaBlokPemakaian += 708;
            biayaBeban += 0;
        } else if (golongan.equals("s-1 2200 va")) {
            if (jumlahKwh <= 0) {
                biayaBlokPemakaian = 0;
                biayaTransaksi = 0;
                pajakPeneranganJalan = 0;
            }
            biayaBlokPemakaian += 760;
            biayaBeban += 0;
        } else {
            biayaBlokPemakaian = 0;
            pajakPeneranganJalan = 0;
            biayaTransaksi = 0;
            biayaBeban = 0;
        }

        double totalBiayaPemakaian = getTotalBiayaPemakaian(jumlahKwh, biayaBlokPemakaian);
        double totalTagihan = getTotalTagihan(totalBiayaPemakaian, pajakPeneranganJalan * totalBiayaPemakaian, biayaTransaksi, biayaBeban);
        System.out.println(String.valueOf(totalBiayaPemakaian));

//        convert format to rupiah currency
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String rpTotalTagihan = formatRupiah.format(totalTagihan);
        String rpBebanBiaya = formatRupiah.format(biayaBeban);
        String rpbiayaTransaksi = formatRupiah.format(biayaTransaksi);
        String rpbiayaBlok = formatRupiah.format(biayaBlokPemakaian);

        cmbGolongan.setSelectedIndex(0);
        txtPemakaianKwh.setText("");
        lblBiayaBeban.setText(rpBebanBiaya);
        lblBiayaTransaksi.setText(rpbiayaTransaksi);
        lblBlokPemakaian.setText(rpbiayaBlok);
        lblGolongan.setText(golongan);
        lblPemakaian.setText(String.valueOf(jumlahKwh) + " kWh");
        lblPpj.setText(String.valueOf(pajakPeneranganJalan));
        lblTotalTagihan.setText(rpTotalTagihan);
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(ListrikPolnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListrikPolnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListrikPolnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListrikPolnes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListrikPolnes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbGolongan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBiayaBeban;
    private javax.swing.JLabel lblBiayaTransaksi;
    private javax.swing.JLabel lblBlokPemakaian;
    private javax.swing.JLabel lblGolongan;
    private javax.swing.JLabel lblPemakaian;
    private javax.swing.JLabel lblPpj;
    private javax.swing.JLabel lblTotalTagihan;
    private javax.swing.JTextField txtPemakaianKwh;
    // End of variables declaration//GEN-END:variables
}
