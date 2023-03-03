package phiHuynhMinhQuan_21080711;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class STT19_NguyenTienPhat_CTNC extends JFrame{
	private JButton btnGiai;
	private JButton btnXoa;
	private JButton btnThoat;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	private JRadioButton rdC, rdT, rdN, rdChia;
	
//	public void STT19_NguyenTienPhat_CNTC() {
//		setTitle("^-^");
//		setSize(500, 400);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		createGUI();
//	}

    public void createGUI() {
    	Container con =getContentPane();
    	con.setLayout(new BorderLayout());
    	    	
    	JPanel pnTop=new JPanel();
    	JLabel lbTitle = new  JLabel("CỘNG TRỪ NHÂN CHIA");
    	Font ft= new Font("Arial", Font.BOLD,24);
    	lbTitle.setFont(ft);
    	lbTitle.setForeground(Color.BLUE);
    	pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
    	pnTop.add(lbTitle);
		con.add(pnTop,BorderLayout.NORTH);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BorderLayout());
		
		JPanel pnLeft=new JPanel();
		pnLeft.setLayout(new GridLayout(7,3));
		
		btnGiai= new JButton("Giai");
		btnThoat= new JButton("Thoat");
		btnXoa=new JButton("Xoa");
		
		btnXoa.setPreferredSize(btnThoat.getPreferredSize());
		btnGiai.setPreferredSize(btnThoat.getPreferredSize());
		
		JPanel pn1= new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.add(btnGiai);
		pn1.setBackground(new Color(220,220,220));
		pnLeft.add(pn1);
		JPanel pn2 = new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn2.add(btnThoat);
		pn2.setBackground(new Color(220,220,220));
		pnLeft.add(pn2);
		JPanel pn3 = new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn3.add(btnXoa);
		pn3.setBackground(new Color(220,220,220));
		pnLeft.add(pn3);
		
		TitledBorder borderLeft=new TitledBorder(BorderFactory.createLineBorder(Color.red),"Chon thao tac");
		pnLeft.setBorder(borderLeft);
		pnCenter.add(pnLeft,BorderLayout.WEST);
		
		JPanel pnRight = new JPanel();
		pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));
		
		JPanel pnA=new JPanel();
		pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lbA= new JLabel("Nhap a:");
		txtA=new JTextField(15);
		pnA.add(lbA);
		pnA.add(txtA);
		pnRight.add(pnA);
		
		JPanel pnB=new JPanel();
		pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lbB= new JLabel("Nhap b:");
		txtA=new JTextField(15);
		pnB.add(lbB);
		pnB.add(txtB);
		pnRight.add(pnB);
		
		ButtonGroup group = new ButtonGroup();
		
		JPanel pnGroup = new JPanel();
		pnGroup.setLayout(new BoxLayout(pnGroup,BoxLayout.X_AXIS));
		pnGroup.setSize(new Dimension(100,300));
		JPanel pnHang1= new JPanel();
		pnHang1.setLayout(new FlowLayout(FlowLayout.CENTER));
		rdC=new JRadioButton("Cong");
		rdT=new JRadioButton("Tru");
		rdN=new JRadioButton("Nhan");
		rdChia=new JRadioButton("Chia");
		group.add(rdC);
		group.add(rdT);
		group.add(rdN);
		group.add(rdChia);
		
		pnHang1.add(rdC);
		pnHang1.add(rdT);
		pnGroup.add(pnHang1);
		
		JPanel pnHang2= new JPanel();
		pnHang2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnHang2.add(rdN);
		pnHang2.add(rdChia);
		pnGroup.add(pnHang2);
		TitledBorder borderRight = new TitledBorder(BorderFactory.createLineBorder(Color.red),"Chon phep toan");
		pnRight.add(pnGroup);
		
		JPanel pnKetQua= new JPanel();
		pnKetQua.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lbKetQua= new JLabel("Ket qua:");
		txtKQ=new JTextField(15);
		txtKQ.add(lbKetQua);
		pnRight.add(txtKQ);
		txtKQ.setEditable(false);
		
		TitledBorder border1=new TitledBorder(BorderFactory.createLineBorder(Color.blue),"Nhap a & b");
		pnRight.setBorder(borderRight);
		pnGroup.setBorder(borderRight);
		pnCenter.add(pnRight,BorderLayout.CENTER);
		con.add(pnLeft, BorderLayout.WEST);
		con.add(pnRight, BorderLayout.CENTER);
    }
    private void addEvents() {
    	btnThoat.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
    	btnXoa.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				txtA.setText("");
				txtB.setText("");
				txtKQ.setText("");
			}
		});
    	btnGiai.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				double soA=0, soB=0;
				if(rdC.isSelected()){
					if(txtA.getText().isEmpty()) {
						soA=0;
						if(txtB.getText().isEmpty()) {
							soB=0;
							
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}else {
						soA=Double.parseDouble(txtA.getText());
						if(txtB.getText().isEmpty()) {
							soB=0;
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}
					txtKQ.setText(String.valueOf(soA+soB));
				}
				else if(rdT.isSelected()) {
					if(txtA.getText().isEmpty()) {
						soA=0;
						if(txtB.getText().isEmpty()) {
							soB=0;
							
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}else {
						soA=Double.parseDouble(txtA.getText());
						if(txtB.getText().isEmpty()) {
							soB=0;
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}
					txtKQ.setText(String.valueOf(soA-soB));
				}
				else if(rdN.isSelected()) {
					if(txtA.getText().isEmpty()) {
						soA=0;
						if(txtB.getText().isEmpty()) {
							soB=0;
							
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}else {
						soA=Double.parseDouble(txtA.getText());
						if(txtB.getText().isEmpty()) {
							soB=0;
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}
					txtKQ.setText(String.valueOf(soA*soB));
				}
				else if(rdChia.isSelected()){
					if(txtA.getText().isEmpty()) {
						soA=0;
						if(txtB.getText().isEmpty()) {
							soB=0;
							
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}else {
						soA=Double.parseDouble(txtA.getText());
						if(txtB.getText().isEmpty()) {
							soB=0;
						}else {
							soB=Double.parseDouble(txtB.getText());
						}
					}
					txtKQ.setText(String.valueOf(soA/soB));
				}
				else {
					JOptionPane.showMessageDialog(null, "Chua chon phep tinh");
				}
			}
		});    	
    }
    public STT19_NguyenTienPhat_CTNC() {
    	setTitle("MAY TINH");
		setSize(520,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
    	createGUI();
    	addEvents();
    }	
	public static void main(String[] args) {
//		STT19_NguyenTienPhat_CTNC ui = new STT19_NguyenTienPhat_CTNC();
//		ui.setSize(400, 400);
//		ui.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		ui.setLocationRelativeTo(null);
//		ui.setVisible(true);
		new STT19_NguyenTienPhat_CTNC().setVisible(true);
	}
}
    