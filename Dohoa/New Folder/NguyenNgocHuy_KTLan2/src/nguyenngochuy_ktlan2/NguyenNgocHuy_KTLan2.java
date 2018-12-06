/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenngochuy_ktlan2;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 *@author 
 *@author                                                                                 Nguyen
 *@author                                                                                                                                                     Ngoc 
 * @author                                                                                                                                                                                                                             Huy 
 * @author                                                                                                                                                                                                                                                                            CNT16C1
 */
public abstract class NguyenNgocHuy_KTLan2  extends JFrame implements ActionListener{
    
        JLabel tieude=new JLabel();
        JLabel s1=new JLabel();
        JLabel s2=new JLabel();
        JLabel kq=new JLabel();
        JTextField khung1=new JTextField();
        JTextField khung2=new JTextField();
        JTextField khungkq=new JTextField();

        JButton btcong=new JButton();
        JButton bttru=new JButton();
        JButton btnhan=new JButton();
        JButton btchia= new JButton();
        JButton btxoa=new JButton();
        JButton btthoat=new JButton();
        
        public NguyenNgocHuy_KTLan2(){
                this.getContentPane().setLayout(null);
                tieude.setBackground(Color.CYAN);
                tieude.setOpaque(true);
                tieude.setBounds(new Rectangle(170,20,130,30));
                tieude.setText(" Các phép tính cơ bản");
                this.getContentPane().add(tieude);
                
                s1.setBounds(new Rectangle(120,80,100,30));
                s1.setText("Nhập số thứ nhất");
                this.getContentPane().add(s1);
                khung1.setOpaque(true);
                khung1.setBounds(new Rectangle(220,80,100,30));
                this.getContentPane().add(khung1);
                
                s2.setBounds(new Rectangle(120,130,100,30));
                s2.setText("Nhập số thứ hai");
                this.getContentPane().add(s2);
                khung2.setOpaque(true);
                khung2.setBounds(new Rectangle(220,130,100,30));
                this.getContentPane().add(khung2);
                
                kq.setBounds(new Rectangle(120,180,100,30));
                kq.setText("Kết quả = ");
                this.getContentPane().add(kq);
                khungkq.setOpaque(true);
                khungkq.setBounds(new Rectangle(180,180,140,30));
                this.getContentPane().add(khungkq);
                
                btcong.setBackground(Color.yellow);
                btcong.setOpaque(true);
                btcong.setBounds(new Rectangle(30,230,100,30));
                btcong.setText("Cộng");
                this.getContentPane().add(btcong);
                btcong.addActionListener(this);
                
                bttru.setBackground(Color.yellow);
                bttru.setOpaque(true);
                bttru.setBounds(new Rectangle(140,230,100,30));
                bttru.setText("Trừ");
                this.getContentPane().add(bttru);
                bttru.addActionListener(this);
                
                btnhan.setBackground(Color.yellow);
                btnhan.setOpaque(true);
                btnhan.setBounds(new Rectangle(250,230,100,30));
                btnhan.setText("Nhân");
                this.getContentPane().add(btnhan);
                btnhan.addActionListener(this);
                
                btchia.setBackground(Color.yellow);
                btchia.setOpaque(true);
                btchia.setBounds(new Rectangle(360,230,100,30));
                btchia.setText("Chia");
                this.getContentPane().add(btchia);
                btchia.addActionListener(this);
                
                btxoa.setBackground(Color.yellow);
                btxoa.setOpaque(true);
                btxoa.setBounds(new Rectangle(140,280,100,30));
                btxoa.setText("Xóa");
                this.getContentPane().add(btxoa);
                btxoa.addActionListener(this);
                
                btthoat.setBackground(Color.yellow);
                btthoat.setOpaque(true);
                btthoat.setBounds(new Rectangle(250,280,100,30));
                btthoat.setText("Thoát");
                this.getContentPane().add(btthoat);
                btthoat.addActionListener(this);
                

}

    /**
     * @param args the command line arguments
     */
        Integer a,b,s;
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btcong){
            String so1= khung1.getText();
            a=Integer.valueOf(so1);
            String so2= khung2.getText();
            b=Integer.valueOf(so2);
            s=a+b;
            String so3= String.valueOf(s);
            khungkq.setText(so3);
        }
        else if (e.getSource()==bttru){
            String so1= khung1.getText();
            a=Integer.valueOf(so1);
            String so2= khung2.getText();
            b=Integer.valueOf(so2);
            s=a-b;
            String so3= String.valueOf(s);
            khungkq.setText(so3);
            
        }
        else if (e.getSource()==btnhan){
             String so1= khung1.getText();
            a=Integer.valueOf(so1);
            String so2= khung2.getText();
            b=Integer.valueOf(so2);
            s=a*b;
            String so3= String.valueOf(s);
            khungkq.setText(so3);
            
        }
        else if (e.getSource()==btchia){
            String so1= khung1.getText();
            a=Integer.valueOf(so1);
            String so2= khung2.getText();
            b=Integer.valueOf(so2);
            s=a/b;
            String so3= String.valueOf(s);
            khungkq.setText(so3);
            
        }
        else if (e.getSource()==btxoa){
            khung1.setText("");
            khung2.setText("");
            khungkq.setText("");
        }
        else{
                  System.exit(0);
	this.dispose();
        }
    
    }
    
    public static void main(String[] args) {
        NguyenNgocHuy_KTLan2 f=new NguyenNgocHuy_KTLan2() {};
	f.setSize(500, 400);
	f.show();
    }
    
}
