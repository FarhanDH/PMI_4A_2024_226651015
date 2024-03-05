/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum4;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author farhandwihartanto
 */
public class JavaApplication1 {

//    Pengaturan dengan BorderLayout
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Contoh Border Layout");
//        BorderLayout layout = new BorderLayout(1, 1);
//        frame.getContentPane().setLayout(layout);
//        JButton btnNorth = new JButton("Posisi NORTH");
//        JButton btnSouth = new JButton("Posisi SOUTH");
//        JButton btnEast = new JButton("Posisi EAST");
//        JButton btnWest = new JButton("Posisi WEST");
//        JButton btnCenter = new JButton("Posisi CENTER");
//
//        frame.getContentPane().add(btnNorth, BorderLayout.NORTH);
//        frame.getContentPane().add(btnSouth, BorderLayout.SOUTH);
//        frame.getContentPane().add(btnEast, BorderLayout.EAST);
//        frame.getContentPane().add(btnWest, BorderLayout.WEST);
//        frame.getContentPane().add(btnCenter, BorderLayout.CENTER);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.show();
//    }
//    Pengaturan dengan BoxLayout
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Box Layout Demo");
//        Box comp = new Box(BoxLayout.Y_AXIS);
//
//        JButton btn1 = new JButton("Button 1");
//        JButton btn2 = new JButton("Button 2");
//        JButton btn3 = new JButton("Button 3");
//        JButton btn4 = new JButton("Long Name Button 1");
//        JButton btn5 = new JButton("Button 1");
//
//        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btn4.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btn5.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        comp.add(btn1);
//        comp.add(btn2);
//        comp.add(btn3);
//        comp.add(btn4);
//        comp.add(btn5);
//
//        frame.getContentPane().add(comp);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.show();
//    }
//    Pengaturan dengan CardLayout
    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Layour");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton btn1 = new JButton("Tombol 1");
        JButton btn2 = new JButton("Tombol 2");
        JTextField text1 = new JTextField(20);
        panel1.add(btn1);
        panel1.add(btn2);
        panel2.add(text1);
        JTabbedPane tab = new JTabbedPane();
        tab.add(panel1, "Tab dengan Button");
        tab.add(panel2, "Tab dengan TextField");
        frame.getContentPane().add(tab, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.show();
    }
}
