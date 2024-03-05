package com.praktikum1;

import javax.swing.*;

public class VisualLuasPersegiPanjang {

    public static void main(String[] args) {
        byte panjang = Byte.parseByte(JOptionPane.showInputDialog(null, "panjang"));
        byte lebar = Byte.parseByte(JOptionPane.showInputDialog(null, "lebar"));

        short result = (short) (panjang * lebar);
        JOptionPane.showMessageDialog(null, "luas = panjang x lebar =" + panjang + " x " + lebar + " = " + result);
    }
}
