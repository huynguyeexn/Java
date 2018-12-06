/*
 * 
 *    @author NGUYÊN NGỌC HUY
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor huy.
 */
package timmaxmin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author NGUYÊN NGỌC HUY
 */
public abstract class TimMaxMin extends JFrame implements ActionListener{
        JLabel tieude=new JLabel();
        JLabel NhapA=new JLabel();
        JLabel NhapB=new JLabel();
        JLabel NhapC=new JLabel();
        JLabel NhapD=new JLabel();
        JLabel lbMax=new JLabel();
        JLabel lbMin=new JLabel();
        JLabel loi=new JLabel();
        
        JTextField inA=new JTextField();
        JTextField inB=new JTextField();
        JTextField inC=new JTextField();
        JTextField inD=new JTextField();
        JTextField inMax=new JTextField();
        JTextField inMin=new JTextField();
        
        JButton btthuchien=new JButton();
        JButton bttieptuc=new JButton();
        JButton btthoat=new JButton();
        
        public TimMaxMin(){
                  this.getContentPane().setLayout(null);
                  tieude.setBackground(Color.CYAN);
                  tieude.setOpaque(true);
                  tieude.setBounds(new Rectangle(150,15,200,30));
                  tieude.setText("  CHƯƠNG TRÌNH TÌM MAX VÀ MIN");
                  this.getContentPane().add(tieude);
                  
                  
                  NhapA.setBounds(new Rectangle(30,60,100,30));
                  NhapA.setText("Nhập A ");
                  this.getContentPane().add(NhapA);
                  NhapA.setOpaque(true);
                  inA.setBounds(new Rectangle(75,60,40,30));
                  this.getContentPane().add(inA);
                  
                  NhapB.setBounds(new Rectangle(140,60,100,30));
                  NhapB.setText("Nhập B");
                  this.getContentPane().add(NhapB);
                  NhapB.setOpaque(true);
                  inB.setBounds(new Rectangle(185,60,40,30));
                  this.getContentPane().add(inB);
                  
                  NhapC.setBounds(new Rectangle(250,60,100,30));
                  NhapC.setText("Nhập C ");
                  this.getContentPane().add(NhapC);
                  NhapC.setOpaque(true);
                  inC.setBounds(new Rectangle(295,60,40,30));
                  this.getContentPane().add(inC);
                  
                  NhapD.setBounds(new Rectangle(360,60,100,30));
                  NhapD.setText("Nhập D ");
                  this.getContentPane().add(NhapD);
                  NhapD.setOpaque(true);
                  inD.setBounds(new Rectangle(405,60,40,30));
                  this.getContentPane().add(inD);
                  
                  lbMax.setBounds(new Rectangle(150,120,100,30));
                  lbMax.setText("Max");
                  this.getContentPane().add(lbMax);
                  lbMax.setOpaque(true);
                  inMax.setBounds(new Rectangle(185,120,40,30));
                  this.getContentPane().add(inMax);
                  
                  lbMin.setBounds(new Rectangle(260,120,100,30));
                  lbMin.setText("Min");
                  this.getContentPane().add(lbMin);
                  lbMin.setOpaque(true);
                  inMin.setBounds(new Rectangle(295,120,40,30));
                  this.getContentPane().add(inMin);
                  
                  //
                   btthuchien.setBackground(Color.yellow);
                    btthuchien.setOpaque(true);
                    btthuchien.setBounds(new Rectangle(60,180,100,30));
                    btthuchien.setText("Thực hiện");
                    this.getContentPane().add(btthuchien);
                    btthuchien.addActionListener(this);
                    
                    
                     bttieptuc.setBackground(Color.yellow);
                    bttieptuc.setOpaque(true);
                    bttieptuc.setBounds(new Rectangle(190,180,100,30));
                    bttieptuc.setText("Tiếp tục");
                    this.getContentPane().add(bttieptuc);
                    bttieptuc.addActionListener(this);
                    
                    btthoat.setBackground(Color.yellow);
                    btthoat.setOpaque(true);
                    btthoat.setBounds(new Rectangle(320,180,100,30));
                    btthoat.setText("Thoát");
                    this.getContentPane().add(btthoat);
                    btthoat.addActionListener(this);
        }
        
        
        
        
         int max,min,i=0;
         int[] arr;

        public void actionPerformed(ActionEvent e){
             if(e.getSource()==btthuchien){
                   arr = new int[4];
                  String s1= inA.getText();
                   arr[0]=Integer.valueOf(s1);
                 
                  String s2= inB.getText();
                  arr[1]=Integer.valueOf(s2);
                  
                  String s3= inC.getText();
                  arr[2]=Integer.valueOf(s3);
                  
                  String s4= inD.getText();
                  arr[3]=Integer.valueOf(s4);
                  
                  
                  max = arr[0];
                  for(i=0;i<4;i++){
                        if(max<arr[i]) {
                               max=arr[i];
                           }
                  }
                  min = arr[0];
                  for(i=0;i<3;i++){
                        if(min>arr[i]) {
                               min=arr[i];
                           }
                  }
                  
                  inMax.setText(String.valueOf(max));
                  inMin.setText(String.valueOf(min));       
             }
             else if (e.getSource()==bttieptuc){
                 inA.setText("");
                 inB.setText("");
                 inC.setText("");
                 inD.setText("");
                 inMax.setText("");
                 inMin.setText("");
                  arr = new int[0];
             
             }
             else{
                  System.exit(0);
                    this.dispose();
             }
        }
    public static void main(String[] args) {
          TimMaxMin f=new TimMaxMin() {};
	f.setSize(500, 300);
	f.show();
    }
    
}





















/**
 *
 * @author NGUYÊN NGỌC HUY
 */