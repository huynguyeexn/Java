/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dh_cvdt;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Huy
 */
public abstract class DH_CVDT extends JFrame implements ActionListener{
    JLabel tieude=new JLabel();
    JLabel ca=new JLabel();
    JLabel cb=new JLabel();
    JLabel cv=new JLabel();
    JLabel dt=new JLabel();
    JTextField khunga=new JTextField();
    JTextField khungb=new JTextField();
    JTextField khungcv=new JTextField();
    JTextField khungdt=new JTextField();
    
    JButton btthuchien=new JButton();
    JButton bttieptuc=new JButton();
    JButton btthoat=new JButton();

    public  DH_CVDT(){
        this.getContentPane().setLayout(null);
        tieude.setBackground(Color.CYAN);
        tieude.setOpaque(true);
        tieude.setBounds(new Rectangle(130,40,220,30));
        tieude.setText(" Tính chu vi và Diện tích Hình Chữ Nhật");
        this.getContentPane().add(tieude);
        
        ca.setBounds(new Rectangle(130,100,50,30));
        ca.setText("Cạnh B:");
        this.getContentPane().add(ca);
        khunga.setOpaque(true);
        khunga.setBounds(new Rectangle(180,100,100,30));
        this.getContentPane().add(khunga);
        
        cb.setBounds(new Rectangle(130,150,50,30));
        cb.setText("Cạnh B:");
        this.getContentPane().add(cb);
        khungb.setOpaque(true);
        khungb.setBounds(new Rectangle(180,150,100,30));
        this.getContentPane().add(khungb);
        
        cv.setBounds(new Rectangle(100,200,50,30));
        cv.setText("Chu vi:");
        this.getContentPane().add(cv);
        khungcv.setOpaque(true);
        khungcv.setBounds(new Rectangle(150,200,50,30));
        this.getContentPane().add(khungcv);
        
        dt.setBounds(new Rectangle(220,200,70,30));
        dt.setText("Diện tích:");
        this.getContentPane().add(dt);
        khungdt.setOpaque(true);
        khungdt.setBounds(new Rectangle(280,200,50,30));
        this.getContentPane().add(khungdt);
        
        btthuchien.setBackground(Color.yellow);
        btthuchien.setOpaque(true);
        btthuchien.setBounds(new Rectangle(60,250,100,30));
        btthuchien.setText("Thực hiện");
        this.getContentPane().add(btthuchien);
        btthuchien.addActionListener(this);
        
        bttieptuc.setBackground(Color.yellow);
        bttieptuc.setOpaque(true);
        bttieptuc.setBounds(new Rectangle(180,250,100,30));
        bttieptuc.setText("Tiếp tục");
        this.getContentPane().add(bttieptuc);
        bttieptuc.addActionListener(this);
        
        btthoat.setBackground(Color.yellow);
        btthoat.setOpaque(true);
        btthoat.setBounds(new Rectangle(300,250,100,30));
        btthoat.setText("Thoát");
        this.getContentPane().add(btthoat);
        btthoat.addActionListener(this);
    }
   
    /**
     * @param args the command line arguments
     */
    
    Double a,b,chuv,dient;
    
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==btthuchien){
                String s1= khunga.getText();
                a=Double.valueOf(s1);
                String s2= khungb.getText();
                b=Double.valueOf(s2);
                chuv=a+b;
                dient=a*b;
                String s3= String.valueOf(chuv);
                String s4= String.valueOf(dient);
                khungcv.setText(s3);
                khungdt.setText(s4);
            }
            else if(e.getSource()==bttieptuc){
                khunga.setText("");
                khungb.setText("");
                khungcv.setText("");
                khungdt.setText("");
            }
            else{
                System.exit(0);
		this.dispose();
            }
    }
    public static void main(String[] args) {
        DH_CVDT f=new DH_CVDT() {};
	f.setSize(500, 400);
	f.show();
    }
    
}
