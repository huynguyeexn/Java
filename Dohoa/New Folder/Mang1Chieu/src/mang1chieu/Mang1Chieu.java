/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang1chieu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Nguyễn Ngọc Huy
 */
public abstract class Mang1Chieu extends JFrame implements ActionListener {

    JLabel tieude = new JLabel();
    JLabel tenlop = new JLabel();
    JLabel nhapspt = new JLabel();
    JLabel nhappt = new JLabel();
    JLabel inmang = new JLabel();
    JLabel tongdc = new JLabel();
    JLabel daysnt = new JLabel();
    JLabel loi = new JLabel();

    JTextField knhapspt = new JTextField();
    JTextField knhappt = new JTextField();
    JTextField kinmang = new JTextField();
    JTextField ktongdc = new JTextField();
    JTextField kdaysnt = new JTextField();

    JButton btnhap = new JButton();
    JButton btthuchien = new JButton();
    JButton btxoa = new JButton();
    JButton btthoat = new JButton();

    public Mang1Chieu() {

        loi.setBounds(new Rectangle(30, 50, 200, 30));

        loi.setForeground(Color.red);
        loi.setFont(new Font("Serif", Font.BOLD, 15));
        this.getContentPane().add(loi);

        this.getContentPane().setLayout(null);
        tieude.setBackground(Color.CYAN);
        tieude.setOpaque(true);
        tieude.setBounds(new Rectangle(125, 20, 230, 30));
        tieude.setText(" Chương trình tổng quan mảng 1 chiều");
        this.getContentPane().add(tieude);

        tenlop.setBounds(new Rectangle(210, 50, 70, 30));
        tenlop.setText("CNT16C1");
        this.getContentPane().add(tenlop);

        nhapspt.setBounds(new Rectangle(30, 90, 100, 30));
        nhapspt.setText("Nhập số pt mảng");
        this.getContentPane().add(nhapspt);
        knhapspt.setOpaque(true);
        knhapspt.setBounds(new Rectangle(140, 90, 60, 30));
        this.getContentPane().add(knhapspt);

        nhappt.setBounds(new Rectangle(210, 90, 100, 30));
        nhappt.setText("Nhập mảng");
        this.getContentPane().add(nhappt);
        knhappt.setOpaque(true);
        knhappt.setBounds(new Rectangle(280, 90, 60, 30));
        this.getContentPane().add(knhappt);

        inmang.setBounds(new Rectangle(30, 130, 100, 30));
        inmang.setText("Mảng đã nhập");
        this.getContentPane().add(inmang);
        kinmang.setOpaque(true);
        kinmang.setBounds(new Rectangle(140, 130, 200, 30));
        this.getContentPane().add(kinmang);

        tongdc.setBounds(new Rectangle(30, 170, 150, 30));
        tongdc.setText("Tổng dương chẳn");
        this.getContentPane().add(tongdc);
        ktongdc.setOpaque(true);
        ktongdc.setBounds(new Rectangle(140, 170, 200, 30));
        this.getContentPane().add(ktongdc);

        daysnt.setBounds(new Rectangle(30, 210, 150, 30));
        daysnt.setText("Dãy SNT");
        this.getContentPane().add(daysnt);
        kdaysnt.setOpaque(true);
        kdaysnt.setBounds(new Rectangle(140, 210, 200, 30));
        this.getContentPane().add(kdaysnt);

        btnhap.setBackground(Color.yellow);
        btnhap.setOpaque(true);
        btnhap.setBounds(new Rectangle(350, 90, 100, 30));
        btnhap.setText("Nhập");
        this.getContentPane().add(btnhap);
        btnhap.addActionListener(this);

        btthuchien.setBackground(Color.yellow);
        btthuchien.setOpaque(true);
        btthuchien.setBounds(new Rectangle(350, 130, 100, 30));
        btthuchien.setText("Thực hiện");
        this.getContentPane().add(btthuchien);
        btthuchien.addActionListener(this);

        btxoa.setBackground(Color.yellow);
        btxoa.setOpaque(true);
        btxoa.setBounds(new Rectangle(350, 170, 100, 30));
        btxoa.setText("Xóa");
        this.getContentPane().add(btxoa);
        btxoa.addActionListener(this);

        btthoat.setBackground(Color.yellow);
        btthoat.setOpaque(true);
        btthoat.setBounds(new Rectangle(350, 210, 100, 30));
        btthoat.setText("Thoát");
        this.getContentPane().add(btthoat);
        btthoat.addActionListener(this);

    }

    public static boolean snt(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int a, b, i = 0;
    int[] arr;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnhap) {

            if (knhapspt.getText().isEmpty()) {
                loi.setText("Hãy nhập số phần tử của mảng");
            } else if (i >= Integer.valueOf(knhapspt.getText())) {
                loi.setText("Bạn đã nhập đủ số phần tử");
            } else if (knhappt.getText().isEmpty()) {
                loi.setText("Hãy nhập phần tử");
            } else {
                String s1 = knhapspt.getText();
                a = Integer.valueOf(s1);

                String s2 = knhappt.getText();
                b = Integer.valueOf(s2);
                if (i == 0) {
                    arr = new int[a];
                }
                arr[i] = b;

                String s3 = String.valueOf(b);
                kinmang.setText(kinmang.getText() + " " + s3);

                knhappt.setText("");
                i = i + 1;
                knhappt.requestFocus();
            }
        } else if (e.getSource() == btthuchien) {
            int s = 0;
            for (int j = 0; j < a; j++) {
                if (snt(arr[j]) == true) {
                    kdaysnt.setText(kdaysnt.getText() + " " + String.valueOf(arr[j]));
                }
                if (arr[j] % 2 == 0 && arr[j] > 0) {
                    s = s + arr[j];
                }
            }
            ktongdc.setText(String.valueOf(s));
        } else if (e.getSource() == btxoa) {
            kdaysnt.setText("");
            kinmang.setText("");
            knhappt.setText("");
            knhapspt.setText("");
            ktongdc.setText("");
            a = 0;
            b = 0;
            i = 0;
            arr = new int[0];
        } else {
            System.exit(0);
            this.dispose();

        }

    }

    public static void main(String[] args) {
        Mang1Chieu f = new Mang1Chieu() {
        };
        f.setSize(500, 320);
        f.show();
    }

}
