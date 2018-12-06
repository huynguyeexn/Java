import javax.swing.*;
//import javax.awt.*;
//import javax.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Rectangle;

public class PTbac2 extends JFrame implements ActionListener{
    JLabel tieude=new JLabel();
    JLabel hsa=new JLabel();
    JLabel hsb=new JLabel();
    JLabel hsc=new JLabel();
	JTextField khunga=new JTextField();
	JTextField khungb=new JTextField();
	JTextField khungc=new JTextField();
	 JLabel kq=new JLabel();
	JTextField khungkq=new JTextField();
	
	
	JButton btthuchien=new JButton();
	JButton btxoa=new JButton();
	JButton btthoat=new JButton();
    
    public PTbac2(){
		this.getContentPane().setLayout(null);
		tieude.setBackground(Color.CYAN);
		tieude.setOpaque(true);
		tieude.setBounds(new Rectangle(130,40,210,30));
		tieude.setText(" Chuong trinh giai phuong trinh bac 2");
		this.getContentPane().add(tieude);
		
		
		hsa.setBounds(new Rectangle(60,100,50,30));
		hsa.setText("He so A");
		this.getContentPane().add(hsa);
		khunga.setOpaque(true);
		khunga.setBounds(new Rectangle(110,100,50,30));
		this.getContentPane().add(khunga);
		
		hsb.setBounds(new Rectangle(170,100,50,30));
		hsb.setText("He so B");
		this.getContentPane().add(hsb);
		khungb.setOpaque(true);
		khungb.setBounds(new Rectangle(220,100,50,30));
		this.getContentPane().add(khungb);
		
		hsc.setBounds(new Rectangle(280,100,50,30));
		hsc.setText("He so C");
		this.getContentPane().add(hsc);
		khungc.setOpaque(true);
		khungc.setBounds(new Rectangle(330,100,50,30));
		this.getContentPane().add(khungc);
		
		kq.setBounds(new Rectangle(60,150,50,30));
		kq.setText("Ket qua");
		this.getContentPane().add(kq);
		khungkq.setOpaque(true);
		khungkq.setBounds(new Rectangle(110,150,270,30));
		this.getContentPane().add(khungkq);
		
		btthuchien.setBackground(Color.yellow);
		btthuchien.setOpaque(true);
		btthuchien.setBounds(new Rectangle(60,200,100,30));
		btthuchien.setText("Thuc Hien");
		this.getContentPane().add(btthuchien);
		btthuchien.addActionListener(this);
		
		btxoa.setBackground(Color.yellow);
		btxoa.setOpaque(true);
		btxoa.setBounds(new Rectangle(180,200,100,30));
		btxoa.setText("Xoa");
		this.getContentPane().add(btxoa);
		btxoa.addActionListener(this);
		
		btthoat.setBackground(Color.yellow);
		btthoat.setOpaque(true);
		btthoat.setBounds(new Rectangle(300,200,100,30));
		btthoat.setText("Thoat");
		this.getContentPane().add(btthoat);
		btthoat.addActionListener(this);
    }
    double a,b,c,x1,x2,delta;
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==btthuchien){
    		String s1= khunga.getText();
    		a=Double.valueOf(s1);
    		String s2= khungb.getText();
    		b=Double.valueOf(s2);
    		String s3= khungc.getText();
    		c=Double.valueOf(s3);
    		if(a==0){
    			if(b==0){
    				if(c==0){
    					khungkq.setText("Phuong trinh co vo so nghiem");
    				}
    				else{
    					khungkq.setText("Phuong trinh vo nghiem");
    				}
    			}
    			else{
    				x1=-b/c;
    				khungkq.setText("Phuong trinh co 1 nghiem x1= "+x1);
    			}
    		}
    		else{
    			delta=a*b-4*a*c;
    			if(delta<0)
    				khungkq.setText("Phuong trinh vo nghiem");
    			if(delta==0){
    				x1=-b/(2*a);
    				khungkq.setText("Phuong trinh co nghiem kep x1= "+x1);
    			}
    			if(delta>0){
    				x1=(-b+Math.sqrt(delta))/(2*a);
    				x2=(-b-Math.sqrt(delta))/(2*a);
    				khungkq.setText("Phuong trinh co 2 nghiem phan biet"+x1+" "+x2);
    			}
    		}
    	}
    	else if(e.getSource()==btxoa)
		
			{
			
				khungkq.setText("");
				khunga.setText("");
				khungb.setText("");
				khungc.setText("");
				
			
			}
		else
		
			{
			
				System.exit(0);
				
				this.dispose();
			
			}
    }
    
    public static void main(String[] args) {
    	PTbac2 f=new PTbac2();
		f.setSize(500, 350);
		f.show();
    }
}
