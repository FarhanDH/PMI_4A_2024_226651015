package com.praktikum1;

import javax.swing.*;

public class HitungLuasPersegiPanjang {
    public static void main(String[] args) {
        byte panjang = 15;
        byte lebar = 30;

        short result = (short) (panjang * lebar);
        JOptionPane.showMessageDialog(null, result);
    }
}
