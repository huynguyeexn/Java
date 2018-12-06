
package nguyenngochuy_radio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 * @author Nguyen Ngoc Huy
 */


public class NguyenNgocHuy_Radio extends JFrame{
         JLabel tieude=new JLabel();
         JLabel lhsa=new JLabel();
         JLabel lhsb=new JLabel();
         JLabel lhsc=new JLabel();
         JLabel lkq=new JLabel();
        JTextArea kkq = new JTextArea();
         
        JTextField nhapA=new JTextField();
        JTextField nhapB=new JTextField();
        JTextField nhapC=new JTextField();
        
        JRadioButton r1=new JRadioButton("Giải phương trình bậc 1");
        JRadioButton r2=new JRadioButton("Giải phương trình bậc 2");
        
        JButton thoat=new JButton();
        JButton thuchien=new JButton();
        JButton tieptuc=new JButton();
        
        ButtonGroup group1=new ButtonGroup();
        Font font = new Font("Tahoma", Font.BOLD, 18);
    
        public NguyenNgocHuy_Radio(){
               this.getContentPane().setLayout(null); 
               tieude.setBounds(new Rectangle(70,20,500,30)); 
               tieude.setText("GIẢI PHƯƠNG TRÌNH BẬC 1 VÀ 2 "); 
               tieude.setFont(font);
               this.getContentPane().add(tieude); 
               
                lhsa.setBounds(new Rectangle(30,80,100,30));
                lhsa.setText("Nhập hệ số A");
                this.getContentPane().add(lhsa);
                lhsa.setOpaque(true);
                nhapA.setBounds(new Rectangle(110,80,40,30));
                this.getContentPane().add(nhapA);
                
                lhsb.setBounds(new Rectangle(30,140,100,30));
                lhsb.setText("Nhập hệ số B ");
                this.getContentPane().add(lhsb);
                lhsb.setOpaque(true);
                nhapB.setBounds(new Rectangle(110,140,40,30));
                this.getContentPane().add(nhapB);
                
                lhsc.setBounds(new Rectangle(30,200,100,30));
                lhsc.setText("Nhập hệ số C ");
                this.getContentPane().add(lhsc);
                lhsc.setOpaque(true);
                nhapC.setBounds(new Rectangle(110,200,40,30));
                this.getContentPane().add(nhapC);
                
                 lkq.setBounds(new Rectangle(280,70,100,30));
                lkq.setText("Kết quả ");
                this.getContentPane().add(lkq);
                lkq.setOpaque(true);
                
                kkq.setBounds(new Rectangle(200,100,200,130));
                this.getContentPane().add(kkq);
                kkq.setOpaque(true);
                
                
                thuchien.setBounds(new Rectangle(40,300,90,30)); 
                thuchien.setText("Thuc Hien"); 
                this.getContentPane().add(thuchien);

                tieptuc.setBounds(new Rectangle(160,300,90,30)); 
                tieptuc.setText("Tiep Tuc"); 
                this.getContentPane().add(tieptuc);

                thoat.setBounds(new Rectangle(280,300,80,30)); 
                thoat.setText("Thoat"); 
                this.getContentPane().add(thoat);
                
                r1.setBounds(new Rectangle(30,250,180,30)); 
                this.getContentPane().add(r1);

                r2.setBounds(new Rectangle(220,250,180,30)); 
                this.getContentPane().add(r2);
                
                group1.add(r1);
                group1.add(r2);
                phanradio k =new phanradio(); 
                r1.addItemListener(k); 
                r2.addItemListener(k);
                
                    phanbutton j=new phanbutton(); 
                    thoat.addActionListener(j); 
                    thuchien.addActionListener(j); 
                    tieptuc.addActionListener(j);
        }
        int tam =0;
                public class phanradio implements ItemListener{
                        public void itemStateChanged(ItemEvent e)
                        {
                                 if(e.getItem()==r1){
                                        tam =1;
                                    }
                                    else if(e.getItem()==r2){
                                        tam = 2;
                                    }
                                    else{
                                        tam = 0;
                                    }
                        }
                 }
                public class phanbutton implements ActionListener{            
                        public void actionPerformed(ActionEvent h) 
                        {
                            double a,b,c,d,x;
                                 if(h.getSource()==thuchien){
                                     kkq.setText("");
                                      if(nhapA.getText().isEmpty()){
                                                JOptionPane.showMessageDialog(null,"Hãy nhập hệ số A" );
                                           }
                                               else if(nhapB.getText().isEmpty()){
                                               JOptionPane.showMessageDialog(null,"Hãy nhập hệ số B" );
                                           }  
                                           else if(nhapC.getText().isEmpty()){
                                               JOptionPane.showMessageDialog(null,"Hãy nhập hệ số C" );
                                           }else{
                                                        String s1= nhapA.getText();
                                                         a=Integer.valueOf(s1);
                                                         String s2= nhapB.getText();
                                                         b=Integer.valueOf(s2);
                                                         String s3= nhapC.getText();
                                                         c=Integer.valueOf(s3);
                                                         if(tam==1){
                                                                     if(a==0){
                                                                             if(b==0){
                                                                                     kkq.setText("phuong trinh co vo so nghiem");
                                                                             }
                                                                             else{
                                                                                      kkq.setText("phuong trinh vo nghiem");
                                                                             }
                                                                     }
                                                                     else{
                                                                              x=(-b/a);
                                                                              kkq.setText("phuong trinh co nghiem \n x=  "+x);
                                                                     }
                                                         }else if(tam==2){
                                                             double x1,x2;
                                                                        if (a==0)
                                                                        {
                                                                                if (b==0)
                                                                                {
                                                                                        if (c==0) kkq.setText("Phuong trinh vo so nghiem");
                                                                                        else kkq.setText("Phuong trinh vo nghiem");
                                                                                }
                                                                                else
                                                                                {
                                                                                        x1=-b/c;
                                                                                        kkq.setText("Phuong trinh co 1 nghiem "+x1);
                                                                                }
                                                                        }
                                                                        else
                                                                        {
                                                                                
                                                                                d=b*b-4*a*c ;
                                                                                if (d<0) 
                                                                                    kkq.setText("Phuong trinh vo nghiem");
                                                                                if (d==0)
                                                                                {
                                                                                        x1=-b/(2*a);
                                                                                        kkq.setText("Phuong trinh da nghiem kep "+x1);
                                                                                }
                                                                                if (d>0)
                                                                                {
                                                                                        x1=(-b+Math.sqrt(d))/(2*a);
                                                                                        x2=(-b-Math.sqrt(d))/(2*a);
                                                                                        kkq.setText("Phuong trinh co 2 nghiem phan biet \n x1="+x1+"\n x2= "+x2);
                                                                                }
                                                                        }
                                                         }else if(tam == 0){
                                                             JOptionPane.showMessageDialog(null,"Hãy chọn nút phương trình cần tính" );
                                                         }
                                           }
                                      
                                 }else  if(h.getSource()==tieptuc){
                                     nhapA.setText("");
                                     nhapB.setText("");
                                     nhapC.setText("");
                                    kkq.setText("");
                                    group1.clearSelection(); 
                                    tam = 0;
                                 }else{
                                      System.exit(0);
                                 }
                        }
                }
    public static void main(String[] args) {
           NguyenNgocHuy_Radio f=new NguyenNgocHuy_Radio(); 
            f.setSize(450,400);
            f.show();

    }
    
}
