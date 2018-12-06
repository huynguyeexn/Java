package radio;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 


public class Radio extends JFrame{

JLabel tieude=new JLabel(); 
JLabel gioithieu=new JLabel(); 
JLabel lso1=new JLabel();
JLabel lso2=new JLabel(); JLabel lketqua=new JLabel();
JTextField so1=new JTextField();
JTextField so2=new JTextField();
JTextField ketqua=new JTextField();
JRadioButton cong=new JRadioButton("Cong");
JRadioButton tru=new JRadioButton("Tru");
JRadioButton nhan=new JRadioButton("Nhan");
JRadioButton chia=new JRadioButton("Chia");

JButton thoat=new JButton();
JButton thuchien=new JButton();
JButton tieptuc=new JButton();

ButtonGroup group1=new ButtonGroup();
Font font = new Font("Tahoma", Font.BOLD, 24);

public Radio()
{
    this.getContentPane().setLayout(null); 
    tieude.setBounds(new Rectangle(50,20,350,30)); 
    tieude.setText("Radio Phep Tinh Co Ban"); 
    tieude.setFont(font); 
    this.getContentPane().add(tieude); 

    gioithieu.setBounds(new Rectangle(150,50,140,30)); 
    gioithieu.setText("Nguyễn Ngọc Huy"); 
    this.getContentPane().add(gioithieu); 

    //---- Nhap so thu nhat ----- lvc 
    lso1.setBounds(new Rectangle(60,80,100,30)); 
    lso1.setText("Nhap so 1 :"); this.getContentPane().add(lso1); 
    so1.setBounds(new Rectangle(140,80,100,25)); 
    this.getContentPane().add(so1);

    //---- Nhap so thu hai ----- lvc 
    lso2.setBounds(new Rectangle(60,120,100,30)); 
    lso2.setText("Nhap so 2 :"); 
    this.getContentPane().add(lso2);
    so2.setBounds(new Rectangle(140,120,100,25)); 
    this.getContentPane().add(so2);

    //---- Ket qua ----- lvc 
    lketqua.setBounds(new Rectangle(60,160,100,30)); 
    lketqua.setText("Ket qua :"); 
    this.getContentPane().add(lketqua);
    ketqua.setBounds(new Rectangle(140,160,100,25)); 
    this.getContentPane().add(ketqua);

    //---- Button ----- lvc 
    thuchien.setBounds(new Rectangle(40,200,90,30)); 
    thuchien.setText("Thuc Hien"); 
    this.getContentPane().add(thuchien);

    tieptuc.setBounds(new Rectangle(145,200,90,30)); 
    tieptuc.setText("Tiep Tuc"); 
    this.getContentPane().add(tieptuc);

    thoat.setBounds(new Rectangle(250,200,80,30)); 
    thoat.setText("Thoat"); 
    this.getContentPane().add(thoat);

    //---- Phep toan ----- lvc 
    cong.setBounds(new Rectangle(270,70,100,30)); 
    this.getContentPane().add(cong);
    
    tru.setBounds(new Rectangle(270,100,100,30)); 
    this.getContentPane().add(tru);
    
    nhan.setBounds(new Rectangle(270,130,100,30)); 
    this.getContentPane().add(nhan);
    
    chia.setBounds(new Rectangle(270,160,100,30)); 
    this.getContentPane().add(chia);

    //---- Set mac dinh chon 1 trong 4 -----

    group1.add(cong);
    group1.add(tru);
    group1.add(nhan);
    group1.add(chia);

    //	---- Phan mac dinh Radio 
    phanradio k =new phanradio(); 
    cong.addItemListener(k); 
    tru.addItemListener(k); 
    nhan.addItemListener(k); 
    chia.addItemListener(k); 

    //	---- Phan mac dinh Button 
    phanbutton j=new phanbutton(); 
    thoat.addActionListener(j); 
    thuchien.addActionListener(j); 
    tieptuc.addActionListener(j);

}
int tam =0;
public class phanradio implements ItemListener
{
    public void itemStateChanged(ItemEvent e)
    {
       
        if(e.getItem()==cong){
            tam =1;
        }
        else if(e.getItem()==tru){
            tam = 2;
        }
        else if(e.getItem()==nhan){
            tam = 3;
        }
        else if(e.getItem()==chia){
            tam = 4;
        }
    }
}

public class phanbutton implements ActionListener
{ 
    public void actionPerformed(ActionEvent h) 
    {
        if(h.getSource()==thuchien){ 
            double a,b;
                    if(so1.getText().isEmpty()){
                         JOptionPane.showMessageDialog(null,"Hãy nhập số thứ 1." );
                    }
                        else if(so2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Hãy nhập số thứ 2." );
                    }
                        else 
                    {
                                String s1= so1.getText();
                                a=Integer.valueOf(s1);
                                String s2= so2.getText();
                                b=Integer.valueOf(s2);
                           if (tam == 1){
                               ketqua.setText(String.valueOf(a+b));
                            }
                           else if(tam == 2){
                               ketqua.setText(String.valueOf(a-b));
                            }
                            else if(tam == 3){
                               ketqua.setText(String.valueOf(a*b));
                            }
                            else if(tam == 4){ 
                               ketqua.setText(String.valueOf(a/b));
                            }
                            else{
                            JOptionPane.showMessageDialog(null,"Hãy chọn nút cần tính." );
                            }
                    }
        }
        else if(h.getSource()==tieptuc){
            so1.setText("");
            so2.setText("");
            ketqua.setText("");
            group1.clearSelection(); 
            tam = 0;
        }
        else {
             System.exit(0);
        }
    }
}

    public static void main(String[] args) {
        Radio f=new Radio(); 
        f.setSize(400,300);
        f.show();

    }
    
}
