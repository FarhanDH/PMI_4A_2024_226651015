/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.praktikum5;

/**
 *
 * @author farhandwihartanto
 */
public class scroll extends javax.swing.JFrame {

    /**
     * Creates new form scroll
     */
    public scroll() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jl_olahraga = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_minuman = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_makanan = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxt_area = new javax.swing.JTextArea();
        jb_proses = new javax.swing.JButton();
        jb_bersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_olahraga.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Renang", "Badminton", "Sepak Bola", "Tenis", "Silat ", "Wushu", "Catur", "Volley Ball" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jl_olahraga);

        jl_minuman.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Es Teh", "Kopi", "Susu Soda", "Susu Murni", "Sprite", "Fanta", "Es Juice", "Es Jeruk" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jl_minuman);

        jl_makanan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Rujak", "Soto", "Pecel Lele", "Tempe Penyet", "Rendang", "Rawon", "Sate", "Ayam Panggang" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jl_makanan);

        jLabel1.setText("Makanan");

        jLabel2.setText("Minuman");

        jLabel3.setText("Olahraga");

        jtxt_area.setColumns(20);
        jtxt_area.setRows(5);
        jScrollPane4.setViewportView(jtxt_area);

        jb_proses.setText("Proses");
        jb_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_prosesActionPerformed(evt);
            }
        });

        jb_bersih.setText("Bersih");
        jb_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_proses)
                            .addComponent(jb_bersih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_proses)
                        .addGap(32, 32, 32)
                        .addComponent(jb_bersih)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_prosesActionPerformed
        //deklarasi variable
        int indexMakanan = jl_makanan.getSelectedIndex();
        int indexMinMinuman = jl_minuman.getMinSelectionIndex();
        int indexMaxMinuman = jl_minuman.getMaxSelectionIndex();
        // Mengambil indeks awal dan indeks akhir dari interval yang ingin dipilih pada ListOlahRaga
        int IndexAwalOlahRaga = jl_olahraga.getMinSelectionIndex();
        int IndexAkhirOlahRaga = jl_olahraga.getMaxSelectionIndex();

        String strKalimat = "";

        //ambil data dari selection mode single
        strKalimat = "Daftar Makanan yang di pilih : \n";
        strKalimat = strKalimat + jl_makanan.getModel().getElementAt(indexMakanan).toString() + "\n";

        //ambil data dari selection mode single interval
        strKalimat = strKalimat + "Daftar Minuman yang di pilih : \n";
        for (int i = indexMinMinuman; i <= indexMaxMinuman; i++) {
            strKalimat = strKalimat + jl_minuman.getModel().getElementAt(i).toString() + "\n";
        }
        strKalimat = strKalimat + "Daftar Olah Raga yang dipilih : \n";
        for (int i = IndexAwalOlahRaga; i <= IndexAkhirOlahRaga; i++) {
            strKalimat = strKalimat + jl_olahraga.getModel().getElementAt(i).toString() + "\n";
        }
        jtxt_area.setText(strKalimat);
    }//GEN-LAST:event_jb_prosesActionPerformed

    private void jb_bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bersihActionPerformed
        jtxt_area.setText("");
    }//GEN-LAST:event_jb_bersihActionPerformed

    /**
     * @param argommand line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus looks the c and feel */
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
            java.util.logging.Logger.getLogger(scroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_bersih;
    private javax.swing.JButton jb_proses;
    private javax.swing.JList<String> jl_makanan;
    private javax.swing.JList<String> jl_minuman;
    private javax.swing.JList<String> jl_olahraga;
    private javax.swing.JTextArea jtxt_area;
    // End of variables declaration//GEN-END:variables
}
