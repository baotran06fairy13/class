package phiHuynhMinhQuan_21080711;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class PTB2 extends JFrame implements ActionListener{
	private JButton buttonGiai;
	private JButton buttonXoa;
	private JButton buttonThoat;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	public PTB2() {
		setTitle("^-^");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		createGUI();
	}
	
	private void createGUI() {
		JPanel pn1=new JPanel();
		this.add(pn1,BorderLayout.NORTH);
		pn1.setBackground(Color.cyan);
		JLabel a;
		pn1.add( a=new JLabel("GIẢI PHƯƠNG TRÌNH BẬC HAI"));
		a.setFont(new Font("Ariah", Font.BOLD, 20));
		JPanel pn2=new JPanel();
		this.add(pn2,BorderLayout.CENTER);
		pn2.setLayout(null);
		JLabel lbla ,lblb,lblc,lblkq;
		pn2.add(lbla=new JLabel("Nhập a:"));
		int x=20,y=40,width=100,height=30;
		lbla.setBounds(x,y,width,height);
		pn2.add(lblb=new JLabel("Nhập b:"));
		y+=50;
		lblb.setBounds(x,y,width,height);
		pn2.add(lblc=new JLabel("Nhập c:"));
		y+=50;
		lblc.setBounds(x,y,width,height);
		pn2.add(lblkq=new JLabel("Kết Quả:"));
		y+=50;
		lblkq.setBounds(x,y,width,height);
		x+=100;y=40;width=300;
		pn2.add(txtA=new JTextField());
		txtA.setBounds(x, y, width, height);
		pn2.add(txtB=new JTextField());
		y+=50;
		txtB.setBounds(x, y, width, height);
		pn2.add(txtC=new JTextField());
		y+=50;
		txtC.setBounds(x, y, width, height);
		pn2.add(txtKQ=new JTextField());
		y+=50;
		txtKQ.setBounds(x, y, width, height);
		JPanel pn3=new JPanel();
		this.add(pn3,BorderLayout.SOUTH);
		pn3.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pn3.add(buttonGiai=new JButton("Giải"));
		pn3.add(buttonXoa=new JButton("Xóa rỗng"));
		pn3.add(buttonThoat=new JButton("Thoát"));
		buttonGiai.addActionListener(this);
		buttonThoat.addActionListener(this);
		buttonXoa.addActionListener(this);
		txtKQ.setEditable(false);
		txtA.addKeyListener(new CustomKeyListener());
		txtB.addKeyListener(new CustomKeyListener());
		txtC.addKeyListener(new CustomKeyListener());
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(buttonThoat)) {
			System.exit(0);
		}else if(o.equals(buttonXoa)){
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtA.requestFocus();
		}else if (o.equals(buttonGiai)) {
			if(!isInt(txtA)) {
				focus(txtA);
			}else if(!isInt(txtB)) {
				focus(txtB);
			}else if(!isInt(txtC)) {
				focus(txtC);
			}else {
				int a =Integer.parseInt(txtA.getText());
				int b =Integer.parseInt(txtB.getText());
				int c =Integer.parseInt(txtC.getText());
				if(a==0) {
					if(b!=0) {
						txtKQ.setText("Nghiệm x="+(-c/(float)b));
					}else if(c==0) {
						txtKQ.setText("Vô số nghiệm");
					}else {
						txtKQ.setText("Vô Nghiệm");
					}
				}
				else{
					float delta=b*b-4*a*c;
					if(delta < 0){
						txtKQ.setText("Vô nghiệm");
					}
					else if(delta==0) 
					{
						txtKQ.setText("Nghiệm kép x1=x2= "+ (-b/2*a));

					}else 
					{
						txtKQ.setText("Có hai nghiệm là: x1 = "+(-b+Math.sqrt(delta))/(2*a)+", x2 ="+(-b-Math.sqrt(delta)));
					}
				}
			}
		}
		
	}

	class CustomKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
        }
 
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
    			if(!isInt(txtA)) {
    				focus(txtA);
    			}else if(!isInt(txtB)) {
    				focus(txtB);
    			}else if(!isInt(txtC)) {
    				focus(txtC);
    			}else {
    				int a =Integer.parseInt(txtA.getText());
    				int b =Integer.parseInt(txtB.getText());
    				int c =Integer.parseInt(txtC.getText());
    				if(a==0) {
    					if(b!=0) {
    						txtKQ.setText("Nghiệm x="+(-c/(float)b));
    					}else if(c==0) {
    						txtKQ.setText("Vô số nghiệm");
    					}else {
    						txtKQ.setText("Vô Nghiệm");
    					}
    				}
    				else{
    					float delta=b*b-4*a*c;
    					if(delta < 0){
    						txtKQ.setText("Vô nghiệm");
    					}
    					else if(delta==0) 
    					{
    						txtKQ.setText("Nghiệm kép x1=x2= "+ (-b/2*a));

    					}else 
    					{
    						txtKQ.setText("Có hai nghiệm là: x1 = "+(-b+Math.sqrt(delta))/(2*a)+", x2 ="+(-b-Math.sqrt(delta)));
    					}
    				}
    			}
    			}
            else if(e.getKeyCode()==KeyEvent.VK_F5) {
            	txtA.setText("");
    			txtB.setText("");
    			txtC.setText("");
    			txtA.requestFocus();
            }else if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
            	System.exit(0);
            }
        }
 
        public void keyReleased(KeyEvent e) {
        }
    }

	public static void main(String[] args) {
		new PTB2().setVisible(true);
	}
	private void focus(JTextField txt) {
		JOptionPane.showMessageDialog(null, "Lỗi Dữ liệu");
		txt.setText("");
		txt.requestFocus();
	}
	private boolean isInt(JTextField txt) {
		boolean result=true;
		try {
			Integer.parseInt(txt.getText());
		}catch(NumberFormatException ex) {
			result=false;
		}
		return result;
	}
}