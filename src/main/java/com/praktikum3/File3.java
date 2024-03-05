/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.praktikum3;

/**
 *
 * @author farhandwihartanto
 */
public class File3 extends javax.swing.JFrame {

    /**
     * Creates new form File3
     */
    public File3() {
        initComponents();
        image.setIcon(new javax.swing.ImageIcon("./assets/Logo.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbMakanan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMinuman = new javax.swing.JComboBox<>();
        btnPesan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        cmbSayuran = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        drinkImage = new javax.swing.JLabel();
        menuImage = new javax.swing.JLabel();
        foodImage = new javax.swing.JLabel();
        vegetImage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Piranha Presto", "Ular Panggang", "Tikus Goreng", "Sup Kelelawar", "Sate Buaya" }));
        cmbMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMakananActionPerformed(evt);
            }
        });

        jLabel1.setText("Makanan :");

        jLabel2.setText("Minuman :");

        cmbMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Bisa Cobra Gembira", "Darah Tiramisu", "Air Paret Americano", "Kopi Basi + Kecoak", "Teh Tarik Tornado" }));
        cmbMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMinumanActionPerformed(evt);
            }
        });

        btnPesan.setText("Pesan");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Ente Arep Eat Opo Dino Iki?");

        cmbSayuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sayur Bening Ilalang", "Sayur Santan Rumput Liar", "Sayur Oseng Ganja", "Sayur Kecubung", "Sayur Kaktus" }));
        cmbSayuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSayuranActionPerformed(evt);
            }
        });

        jLabel4.setText("Makanan");

        jLabel6.setText("Sayuran :");

        jLabel7.setText("Sayuran");

        jLabel8.setText("Minuman");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Detail Pesanan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(170, 170, 170))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel1))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbSayuran, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnPesan)))
                                .addComponent(menuImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(vegetImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(drinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSayuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(menuImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPesan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vegetImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMakananActionPerformed
        strMakanan = cmbMakanan.getSelectedItem().toString().toLowerCase();
        switch (strMakanan) {
            case " ":
                menuImage.setIcon(new javax.swing.ImageIcon(""));
                selectedFood = strMakanan;
                break;
            case "piranha presto":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMakanan + ".jpg"));
                selectedFood = strMakanan;
                break;
            case "ular panggang":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMakanan + ".jpg"));
                selectedFood = strMakanan;
                break;
            case "tikus goreng":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMakanan + ".jpg"));
                selectedFood = strMakanan;
                break;
            case "sup kelelawar":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMakanan + ".jpg"));
                selectedFood = strMakanan;
                break;
            case "sate buaya":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMakanan + ".jpg"));
                selectedFood = strMakanan;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmbMakananActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        strMakanan = (String) cmbMakanan.getSelectedItem();
        strMinuman = (String) cmbMinuman.getSelectedItem();
        strSayuran = (String) cmbSayuran.getSelectedItem();

//        show results
        txtHasil.setText("Your Pesanan : (" + strMakanan + ", " + strSayuran + ", " + strMinuman + ")");
        foodImage.setIcon(new javax.swing.ImageIcon("./assets/" + selectedFood + ".jpg"));
        drinkImage.setIcon(new javax.swing.ImageIcon("./assets/" + selectedDrink + ".jpg"));
        vegetImage.setIcon(new javax.swing.ImageIcon("./assets/" + selectedVeget + ".jpg"));
    }//GEN-LAST:event_btnPesanActionPerformed

    private void cmbMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMinumanActionPerformed
        strMinuman = cmbMinuman.getSelectedItem().toString().toLowerCase();
        switch (strMinuman) {
            case " ":
                menuImage.setIcon(new javax.swing.ImageIcon(""));
                selectedDrink = strMinuman;
                break;
            case "bisa cobra gembira":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMinuman + ".jpg"));
                selectedDrink = strMinuman;
                break;
            case "darah tiramisu":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMinuman + ".jpg"));
                selectedDrink = strMinuman;
                break;
            case "air paret americano":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMinuman + ".jpg"));
                selectedDrink = strMinuman;
                break;
            case "kopi basi + kecoak":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strMinuman + ".jpg"));
                selectedDrink = strMinuman;
                break;
            case "teh tarik tornado":
                menuImage.setIcon(new javax.swing.ImageIcon(""));
                selectedDrink = strMinuman;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmbMinumanActionPerformed

    private void cmbSayuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSayuranActionPerformed
        strSayuran = cmbSayuran.getSelectedItem().toString().toLowerCase();
        switch (strSayuran) {
            case " ":
                menuImage.setIcon(new javax.swing.ImageIcon(""));
                selectedVeget = strSayuran;
                break;
            case "sayur bening ilalang":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strSayuran + ".jpg"));
                selectedVeget = strSayuran;
                break;
            case "sayur santan rumput liar":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strSayuran + ".jpg"));
                selectedVeget = strSayuran;
                break;
            case "sayur oseng ganja":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strSayuran + ".jpg"));
                selectedVeget = strSayuran;
                break;
            case "sayur kecubung":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strSayuran + ".jpg"));
                selectedVeget = strSayuran;
                break;
            case "sayur kaktus":
                menuImage.setIcon(new javax.swing.ImageIcon("./assets/" + strSayuran + ".jpg"));
                selectedVeget = strSayuran;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmbSayuranActionPerformed

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
            java.util.logging.Logger.getLogger(File3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(File3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(File3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(File3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new File3().setVisible(true);
            }
        });
    }

    private String strMakanan;
    private String selectedFood;
    private String strMinuman;
    private String selectedDrink;
    private String strSayuran;
    private String selectedVeget;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesan;
    private javax.swing.JComboBox<String> cmbMakanan;
    private javax.swing.JComboBox<String> cmbMinuman;
    private javax.swing.JComboBox<String> cmbSayuran;
    private javax.swing.JLabel drinkImage;
    private javax.swing.JLabel foodImage;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel menuImage;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JLabel vegetImage;
    // End of variables declaration//GEN-END:variables
}