package phiHuynhMinhQuan_21080711;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SoNguyenTo extends JFrame implements ActionListener {
	private JTextField nhap;
	private JButton generate;
	private JTextArea ketqua;
	public SoNguyenTo() {
		setTitle("Primes");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		creategui();
	}
	private void creategui() {
		JPanel pn1= new JPanel();
//		add(pn1,BorderLayout.)
		add(nhap=new JTextField());
		nhap.setBounds(50, 30, 200, 30);
		nhap.setToolTipText("Nhập số nguyên tố cần hiển thị");
		add(generate =new JButton("Generate"));
		generate.setBounds(250, 30, 100, 30);
		JScrollPane scroll;
		add(scroll =new JScrollPane(ketqua=new JTextArea()));
		scroll.setBounds(50,70,300,170);
		ketqua.setToolTipText("Danh sách số nguyên tố");
		ketqua.setEditable(false);
		nhap.addKeyListener(new CustomKeyListener());
		generate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ketqua.setText("");
				try {
					int n=Integer.parseInt(nhap.getText());
					if(n>0) {
						for(int i=2;i<Integer.MAX_VALUE;i++) {
							if(isPrime(i)) {
								n--;
								ketqua.append(i+"\n");
							}
							if(n==0) {
								break;
							}
						}
					}else {
						JOptionPane.showMessageDialog(null, "Nhap so nguyen duong");
					}
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Nhap lai du lieu");
				}
				focus();
			}
		});
	}
	private void focus() {
		nhap.selectAll();
		nhap.requestFocus();
		return;
	}
	private boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		new SoNguyenTo().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	class CustomKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
        }
 
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
    			ketqua.setText("");
				try {
					int n=Integer.parseInt(nhap.getText());
					if(n>0) {
						for(int i=2;i<Integer.MAX_VALUE;i++) {
							if(isPrime(i)) {
								n--;
								ketqua.append(i+"\n");
							}
							if(n==0) {
								break;
							}
						}
					}else {
						JOptionPane.showMessageDialog(null, "Nhap so nguyen duong");
					}
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Nhap lai du lieu");
					}
				focus();}
    			
    			
           else if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
            	System.exit(0);
            }
        }
 
        public void keyReleased(KeyEvent e) {
        }
    }
	
}
