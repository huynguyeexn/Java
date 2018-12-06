/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqmang1chieu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author NGUYỄN NGỌC HUY
 */
public abstract class TQMang1Chieu extends JFrame implements ActionListener {

    JLabel tieude = new JLabel();
    JLabel lop = new JLabel();
    JLabel lbnhappt = new JLabel();
    JLabel lbnhapgt = new JLabel();
    JLabel lbmang = new JLabel();
    JLabel lbsxmang = new JLabel();
    JLabel lbtong = new JLabel();
    JLabel lbtongscp = new JLabel();
    JLabel lbnhapxoa = new JLabel();
    JLabel lbsauxoa = new JLabel();
    JLabel loi = new JLabel();

    JTextField knhapspt = new JTextField();
    JTextField knhapgt = new JTextField();
    JTextField kinmang = new JTextField();
    JTextField ksxmang = new JTextField();
    JTextField ktongsnt = new JTextField();
    JTextField ktongscp = new JTextField();
    JTextField ksocanxoa = new JTextField();
    JTextField ksaukhixoa = new JTextField();

    JButton btnhap = new JButton();
    JButton btthuchien = new JButton();
    JButton btxoa = new JButton();
    JButton btthoat = new JButton();

    Font fonttieude = new Font("Tahoma", Font.BOLD, 25);
    Font fontlop = new Font("Tahoma", Font.BOLD, 18);
    Font font = new Font("Tahoma", Font.BOLD, 15);

    public TQMang1Chieu() {

        loi.setBounds(new Rectangle(200, 430, 500, 30));
        loi.setText("");
        loi.setForeground(Color.red);
        loi.setFont(fontlop);

        this.getContentPane().add(loi);

        this.getContentPane().setLayout(null);
        tieude.setOpaque(true);
        tieude.setBounds(new Rectangle(100, 15, 500, 30));
        tieude.setText("Chương trình tổng quan mảng 1 chiều");
        tieude.setFont(fonttieude);
        tieude.setForeground(Color.red);
        this.getContentPane().add(tieude);

        this.getContentPane().setLayout(null);
        lop.setOpaque(true);
        lop.setBounds(new Rectangle(200, 50, 500, 30));
        lop.setText("NGUYỄN NGỌC HUY - CNT16C1");
        lop.setFont(fontlop);
        this.getContentPane().add(lop);

        lbnhappt.setBounds(new Rectangle(50, 100, 500, 30));
        lbnhappt.setText("Nhập số pt :");
        lbnhappt.setFont(font);
        this.getContentPane().add(lbnhappt);
        knhapspt.setOpaque(true);
        knhapspt.setBounds(new Rectangle(150, 100, 100, 30));
        knhapspt.setFont(font);
        this.getContentPane().add(knhapspt);

        lbnhapgt.setBounds(new Rectangle(300, 100, 500, 30));
        lbnhapgt.setText("Nhập số pt :");
        lbnhapgt.setFont(font);
        this.getContentPane().add(lbnhapgt);
        knhapgt.setOpaque(true);
        knhapgt.setBounds(new Rectangle(400, 100, 100, 30));
        knhapgt.setFont(font);
        this.getContentPane().add(knhapgt);

        lbmang.setBounds(new Rectangle(50, 150, 500, 30));
        lbmang.setText("Mảng đã nhập : ");
        lbmang.setFont(font);
        this.getContentPane().add(lbmang);
        kinmang.setOpaque(true);
        kinmang.setBounds(new Rectangle(250, 150, 250, 30));
        kinmang.setFont(font);
        this.getContentPane().add(kinmang);

        lbsxmang.setBounds(new Rectangle(50, 200, 500, 30));
        lbsxmang.setText("Sắp xếp mảng giảm dần : ");
        lbsxmang.setFont(font);
        this.getContentPane().add(lbsxmang);
        ksxmang.setOpaque(true);
        ksxmang.setBounds(new Rectangle(250, 200, 250, 30));
        ksxmang.setFont(font);
        this.getContentPane().add(ksxmang);

        lbtong.setBounds(new Rectangle(50, 250, 500, 30));
        lbtong.setText("Tổng các số nguyên tố : ");
        lbtong.setFont(font);
        this.getContentPane().add(lbtong);
        ktongsnt.setOpaque(true);
        ktongsnt.setBounds(new Rectangle(250, 250, 250, 30));
        ktongsnt.setFont(font);
        this.getContentPane().add(ktongsnt);

        lbtongscp.setBounds(new Rectangle(50, 300, 500, 30));
        lbtongscp.setText("Tổng các số chính phương : ");
        lbtongscp.setFont(font);
        this.getContentPane().add(lbtongscp);
        ktongscp.setOpaque(true);
        ktongscp.setBounds(new Rectangle(250, 300, 250, 30));
        ktongscp.setFont(font);
        this.getContentPane().add(ktongscp);

        lbnhapxoa.setBounds(new Rectangle(50, 350, 500, 30));
        lbnhapxoa.setText("Nhập giá trị cần xóa: ");
        lbnhapxoa.setFont(font);
        this.getContentPane().add(lbnhapxoa);
        ksocanxoa.setOpaque(true);
        ksocanxoa.setBounds(new Rectangle(250, 350, 250, 30));
        ksocanxoa.setFont(font);
        this.getContentPane().add(ksocanxoa);

        lbsauxoa.setBounds(new Rectangle(50, 400, 500, 30));
        lbsauxoa.setText("Mảng sau khi xóa ");
        lbsauxoa.setFont(font);
        this.getContentPane().add(lbsauxoa);
        ksaukhixoa.setOpaque(true);
        ksaukhixoa.setBounds(new Rectangle(250, 400, 250, 30));
        ksaukhixoa.setFont(font);
        this.getContentPane().add(ksaukhixoa);

        btnhap.setBackground(Color.yellow);
        btnhap.setOpaque(true);
        btnhap.setBounds(new Rectangle(550, 150, 100, 30));
        btnhap.setText("Nhập");
        this.getContentPane().add(btnhap);
        btnhap.addActionListener(this);

        btthuchien.setBackground(Color.yellow);
        btthuchien.setOpaque(true);
        btthuchien.setBounds(new Rectangle(550, 200, 100, 30));
        btthuchien.setText("Thực hiện");
        this.getContentPane().add(btthuchien);
        btthuchien.addActionListener(this);

        btxoa.setBackground(Color.yellow);
        btxoa.setOpaque(true);
        btxoa.setBounds(new Rectangle(550, 250, 100, 30));
        btxoa.setText("Xóa");
        this.getContentPane().add(btxoa);
        btxoa.addActionListener(this);

        btthoat.setBackground(Color.yellow);
        btthoat.setOpaque(true);
        btthoat.setBounds(new Rectangle(550, 300, 100, 30));
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

    public static void sapxep(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static boolean socp(int n) {

        int temp = (int) Math.sqrt(n);
        if (temp * temp == n) {
            return true;
        } else {
            return false;
        }
    }

    int a, b, i = 0, tam;
    int[] arr;

    public void actionPerformed(ActionEvent e) {
        loi.setText("");
        if (e.getSource() == btnhap) {

            if (knhapspt.getText().isEmpty()) {
                loi.setText("Hãy nhập số phần tử của mảng");
            } else if (i >= Integer.valueOf(knhapspt.getText())) {
                loi.setText("Bạn đã nhập đủ số phần tử");
            } else if (knhapgt.getText().isEmpty()) {
                loi.setText("Hãy nhập phần tử");
            } else {
                String s1 = knhapspt.getText();
                a = Integer.valueOf(s1);

                String s2 = knhapgt.getText();
                b = Integer.valueOf(s2);
                if (i == 0) {
                    arr = new int[a];
                }
                arr[i] = b;

                String s3 = String.valueOf(b);
                kinmang.setText(kinmang.getText() + " " + s3);

                knhapgt.setText("");
                i = i + 1;
                knhapgt.requestFocus();
            }
        } else if (e.getSource() == btthuchien) {
           
            int s = 0, s1 = 0;
            for (int j = 0; j < a; j++) {
                if (snt(arr[j]) == true) {
                    s = s + arr[j];
                }
            }
            ktongsnt.setText(String.valueOf(s));
            sapxep(arr);
            ksxmang.setText("");
           for (int i = 0; i < arr.length; i++) {
                ksxmang.setText(ksxmang.getText() + " " + arr[i]);
            }
           
           
            for (int j = 0; j < a; j++) {
                if (socp(arr[j]) == true) {
                    s1 = s1 + arr[j];
                }
            }
            ktongscp.setText(String.valueOf(s1));
            
            
            if (ksocanxoa.getText().isEmpty()) {

            } else {
                for (int j = 0; j < a; j++) {
                    if (arr[j] == Integer.valueOf(ksocanxoa.getText())) {
                         for (int h = j+1; h < arr.length;h++) {
                            arr[j] = arr[h];
                         }
                    }
                }
                ksaukhixoa.setText("");
                for (int i = 0; i < arr.length-1; i++) {
                         sapxep(arr);
                        ksaukhixoa.setText(ksaukhixoa.getText() + " " + arr[i]);
                    }
            }
        } else if (e.getSource() == btxoa) {
            kinmang.setText("");
            knhapgt.setText("");
            knhapspt.setText("");
            ksaukhixoa.setText("");
            ksocanxoa.setText("");
            ksxmang.setText("");
            ktongscp.setText("");
            ktongsnt.setText("");
            a = 0;
            b = 0;
            i = 0;
            tam = 0;
            arr = new int[0];
        } else {
            System.exit(0);
            this.dispose();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TQMang1Chieu f = new TQMang1Chieu() {
        };
        f.setSize(700, 520);
        f.show();
    }

}
