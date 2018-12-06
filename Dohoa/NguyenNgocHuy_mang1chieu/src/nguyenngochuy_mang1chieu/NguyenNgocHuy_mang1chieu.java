/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenngochuy_mang1chieu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Huy
 */
public abstract class NguyenNgocHuy_mang1chieu extends JFrame implements ActionListener {

    JLabel tieude = new JLabel();
    JLabel lop = new JLabel();
    JLabel lbnhappt = new JLabel();
    JLabel lbnhapgt = new JLabel();
    JLabel lbmang = new JLabel();
    JLabel lbsxmang = new JLabel();
    JLabel lbtong = new JLabel();
    JLabel lbtim = new JLabel();
    JLabel lbvttim = new JLabel();
    JLabel lbthem = new JLabel();
    JLabel lbsauthem = new JLabel();
    JLabel loi = new JLabel();

    JTextField knhapspt = new JTextField();
    JTextField knhapgt = new JTextField();
    JTextField kinmang = new JTextField();
    JTextField ksxmang = new JTextField();
    JTextField ktong = new JTextField();
    JTextField knhaptim = new JTextField();
    JTextField kvttim = new JTextField();
    JTextField kgtthem = new JTextField();
    JTextField ksauthem = new JTextField();

    JButton btnhap = new JButton();
    JButton btthuchien = new JButton();
    JButton btxoa = new JButton();
    JButton btthoat = new JButton();

    Font fonttieude = new Font("Tahoma", Font.BOLD, 25);
    Font fontlop = new Font("Tahoma", Font.BOLD, 18);
    Font font = new Font("Tahoma", Font.BOLD, 15);

    public NguyenNgocHuy_mang1chieu() {
        loi.setBounds(new Rectangle(200, 500, 500, 30));
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
        lbnhappt.setForeground(Color.red);
        this.getContentPane().add(lbnhappt);
        knhapspt.setOpaque(true);
        knhapspt.setBounds(new Rectangle(150, 100, 100, 30));
        knhapspt.setFont(font);
        this.getContentPane().add(knhapspt);

        lbnhapgt.setBounds(new Rectangle(275, 100, 500, 30));
        lbnhapgt.setText("Nhập giá trị pt :");
        lbnhapgt.setFont(font);
        lbnhapgt.setForeground(Color.red);
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
        lbtong.setText("Tổng các số hoàn hảo : ");
        lbtong.setFont(font);
        this.getContentPane().add(lbtong);
        ktong.setOpaque(true);
        ktong.setBounds(new Rectangle(250, 250, 250, 30));
        ktong.setFont(font);
        this.getContentPane().add(ktong);

        lbtim.setBounds(new Rectangle(50, 300, 500, 30));
        lbtim.setText("Nhập giá trị cần tìm : ");
        lbtim.setFont(font);
        lbtim.setForeground(Color.red);
        this.getContentPane().add(lbtim);
        knhaptim.setOpaque(true);
        knhaptim.setForeground(Color.red);
        knhaptim.setBounds(new Rectangle(250, 300, 250, 30));
        knhaptim.setFont(font);
        this.getContentPane().add(knhaptim);

        lbvttim.setBounds(new Rectangle(50, 350, 500, 30));
        lbvttim.setText("Vị trí của giá trị cần tìm: ");
        lbvttim.setFont(font);
        this.getContentPane().add(lbvttim);
        kvttim.setOpaque(true);
        kvttim.setBounds(new Rectangle(250, 350, 250, 30));
        kvttim.setFont(font);
        this.getContentPane().add(kvttim);

        lbthem.setBounds(new Rectangle(50, 400, 500, 30));
        lbthem.setText("Nhập giá trị cần thêm : ");
        lbthem.setFont(font);
        lbthem.setForeground(Color.red);
        this.getContentPane().add(lbthem);
        kgtthem.setOpaque(true);
        kgtthem.setBounds(new Rectangle(250, 400, 250, 30));
        kgtthem.setFont(font);
        this.getContentPane().add(kgtthem);

        lbsauthem.setBounds(new Rectangle(50, 450, 500, 30));
        lbsauthem.setText("Mảng sau khi thêm : ");
        lbsauthem.setFont(font);
        this.getContentPane().add(lbsauthem);
        ksauthem.setOpaque(true);
        ksauthem.setBounds(new Rectangle(250, 450, 250, 30));
        ksauthem.setFont(font);
        this.getContentPane().add(ksauthem);

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

    public static boolean shh(int n) {

        int tong = 0;
        int temp = n;
        for ( int i = 1; i < temp ; i ++){
            if( temp % i == 0 ){
                tong = tong + i;
            }
        }
        if ( tong == temp) {
            return true;
        }else{
            return false;
        }
        
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
        } 
        else if (e.getSource() == btthuchien) {
            
                 
            int s = 0, s1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (shh(arr[j]) == true) {
                    s = s + arr[j];
                }
            }
            ktong.setText(String.valueOf(s));
            sapxep(arr);
            ksxmang.setText("");
            for (int j = 0; j < arr.length; j++) {
                ksxmang.setText(ksxmang.getText() + " " + arr[j]);
            }
            kvttim.setText("");
            
            if (knhaptim.getText().isEmpty()) {
            } else {
                for (int j = 0; j < a; j++) {
                    if (arr[j] == Integer.valueOf(knhaptim.getText())) {
                        int h = j + 1;
                        kvttim.setText(kvttim.getText() + " " + h);
                    }
                }
            }
            if(kgtthem.getText().isEmpty()){
                
            }else{
                i= arr.length;
                i++;
               int[]  mtam = new int[i];
                for (int j = 0; j < i; j++) {
                    if(j<arr.length){
                        mtam[j]=arr[j];
                    }else{
                        int  d = Integer.valueOf(kgtthem.getText());
                        mtam[j]=  d;
                    }
                }
                ksauthem.setText("");
                sapxep(mtam);
                for (int j = 0; j < mtam.length; j ++) {
                ksauthem.setText(ksauthem.getText() + " " + mtam[j]);
                 }
            }
           
        } else if (e.getSource() == btxoa) {
            kinmang.setText("");
            knhapgt.setText("");
            knhapspt.setText("");
            kgtthem.setText("");
            knhaptim.setText("");
            ksxmang.setText("");
            ksauthem.setText("");
            ktong.setText("");
            kvttim.setText("");
            a = 0;
            b = 0;
            i = 0;
            tam = 0;
            arr = new int[0];
        } else if(e.getSource() == btthoat) {
            System.exit(0);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        NguyenNgocHuy_mang1chieu f = new NguyenNgocHuy_mang1chieu() {
        };
        f.setSize(700, 600);
        f.show();
    }

}
