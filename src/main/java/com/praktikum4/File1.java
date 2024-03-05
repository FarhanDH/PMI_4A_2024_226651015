/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum4;

import javax.swing.*;

/**
 *
 * @author farhandwihartanto
 */
public class File1 {

    public static void main(String[] args) {
        Object[] memberships = {"BUKAN MEMBERSHIP", "GOLD", "SILVER", "BRONZE"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "PLEASE SELECT MEMBERSHIP TYPE:\n",
                "MEMBERSHIP OPTIONS",
                JOptionPane.PLAIN_MESSAGE,
                null,
                memberships,
                "ham");

        if (s.equals("GOLD")) {
            JOptionPane.showMessageDialog(null, "Terima kasih atas input anda sebagai member");
            JOptionPane.showMessageDialog(null, "Karena membership anda adalah GOLD, anda mendapatkan poin voucher sebesar 50 ribu rupiah");
        } else if (s.equals("SILVER")) {
            JOptionPane.showMessageDialog(null, "Terima kasih atas input anda sebagai member");
            JOptionPane.showMessageDialog(null, "Karena membership anda adalah SILVER, anda mendapatkan poin voucher sebesar 30 ribu rupiah");
        } else if (s.equals("BRONZE")) {
            JOptionPane.showMessageDialog(null, "Terima kasih atas input anda sebagai member");
            JOptionPane.showMessageDialog(null, "Karena membership anda adalah BRONZE, anda mendapatkan poin voucher sebesar 10 ribu rupiah");
        } else {
            JOptionPane.showMessageDialog(null, "Terima kasih atas input anda sebagai konsumen");
            JOptionPane.showMessageDialog(null, "Meskipun andan bukan member, anda berhak mendapat potongan sebesar 5000 rupiah dari total belanja");
        }

//If you're here, the return value was null/empty.
//        setLabel("Come on, finish the sentence!");
    }
}
