package phiHuynhMinhQuan_21080711;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class nhanchiacongtru extends JFrame implements ActionListener{
	private JButton buttongiai;
	private JButton buttonxoa;
	private JButton buttonthoat;
	private JTextField txta;
	private JTextField txtb;
	private JRadioButton rdc;
	private JRadioButton rdt;
	private JRadioButton rdn;
	private JRadioButton rdchia;
	private JTextField txtkq;
	private JButton btndoimau;
	private JPanel pn4;
	public nhanchiacongtru() {
		setTitle("MAY TINH");
		setSize(520,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		creategui();
		
	}
	private void creategui() {
		JPanel pn1=new JPanel();
		add(pn1,BorderLayout.NORTH);
		JLabel lbltieude = new JLabel("Cộng Trừ Nhân Chia");
		pn1.add(lbltieude);
		lbltieude.setFont(new Font("ariah",Font.BOLD,25));
		lbltieude.setForeground(Color.blue);
		JPanel pn2=new JPanel();
		add(pn2,BorderLayout.WEST);
		pn2.setBorder(BorderFactory.createTitledBorder("Chọn Tác vụ"));
		pn2.setLayout(null);
		pn2.setPreferredSize(new Dimension(100,100));
		pn2.setBackground(Color.LIGHT_GRAY);
		buttongiai=new JButton("Giải");
		buttongiai.setBounds(10, 20, 80, 32);
		buttonxoa=new JButton("Xóa");
		buttonxoa.setBounds(10, 60, 80, 32);
		buttonthoat=new JButton("Thoát");
		buttonthoat.setBounds(10, 100, 80, 32);
		pn2.add(buttongiai);
		pn2.add(buttonxoa);
		pn2.add(buttonthoat);
		JPanel pn3=new JPanel();
		add(pn3,BorderLayout.CENTER);
		pn3.setLayout(null);
		pn3.setBorder(BorderFactory.createTitledBorder("Tính toán"));
		JLabel lbla = new JLabel("Nhập a:");
		JLabel lblb= new JLabel("Nhập b:");
		lbla.setBounds(50, 20, 100, 30);
		lblb.setBounds(50, 60, 100, 30);
		pn3.add(lbla);
		pn3.add(lblb);
		pn3.add(txta=new JTextField());
		pn3.add(txtb=new JTextField());
		txta.setBounds(102, 20, 260, 30);
		txtb.setBounds(102, 60, 260, 30);
		JPanel pntoan = new JPanel();
		pn3.add(pntoan);
		pntoan.setLayout(null);
		pntoan.setBounds(102, 100, 260, 95);
		pntoan.setBorder(BorderFactory.createTitledBorder("Phép toán"));
		rdc = new JRadioButton("Cộng");
		rdt = new JRadioButton("Trừ");
		rdn=new JRadioButton("Nhân");
		rdchia=new JRadioButton("Chia");
		pntoan.add(rdc);
		rdc.setBounds(5, 20, 90, 30);
		pntoan.add(rdn);
		rdn.setBounds(5, 55, 90, 30);
		pntoan.add(rdt);
		rdt.setBounds(130, 20, 90, 30);
		pntoan.add(rdchia);
		rdchia.setBounds(130, 55, 90, 30);
		ButtonGroup groupbtn = new ButtonGroup();
		groupbtn.add(rdc);
		groupbtn.add(rdt);
		groupbtn.add(rdn);
		groupbtn.add(rdchia);
		JLabel lblkq=new JLabel("Kết quả:");
		pn3.add(lblkq);
		lblkq.setBounds(50, 215, 100, 30);
		pn3.add(txtkq=new JTextField());
		txtkq.setBounds(102, 215, 260, 30);
		txtkq.setEditable(false);
		pn4=new JPanel();
		add(pn4,BorderLayout.SOUTH);
		pn4.setLayout(null);
		pn4.setPreferredSize(new Dimension(20,50));
		pn4.setBackground(Color.pink);
		JPanel pnxanh=new JPanel();
		pn4.add(pnxanh);
		pnxanh.setLayout(null);
		pnxanh.setBounds(210, 5, 27, 27);
		pnxanh.setBackground(Color.blue);
		JPanel pndo=new JPanel();
		pn4.add(pndo);
		pndo.setLayout(null);
		pndo.setBounds(248, 5, 27, 27);
		pndo.setBackground(Color.red);
		JPanel pnvang=new JPanel();
		pn4.add(pnvang);
		pnvang.setLayout(null);
		pnvang.setBounds(286, 5, 27, 27);
		pnvang.setBackground(Color.yellow);
		
		//tao su kien cho phep tinhs
		rdc.addActionListener(this);
		rdt.addActionListener(this);
		rdn.addActionListener(this);
		rdchia.addActionListener(this);

		
		//tao su kien nut button giai xoa thoat
		buttongiai.addActionListener(this);
		buttonxoa.addActionListener(this);
		buttonthoat.addActionListener(this);
	}
	public static void main(String[] args) {
		new nhanchiacongtru().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(buttonthoat)) {
			System.exit(0);
		}else if(o.equals(buttonxoa)) {
			txta.setText("");
			txtb.setText("");
			txta.requestFocus();
		}else if(o.equals(buttongiai)) {
			if(!isInt(txta)) {
				focus(txta);
			}else if(!isInt(txtb)) {
				focus(txtb);
			}else {
				double a = Double.parseDouble(txta.getText());
				double b = Double.parseDouble(txtb.getText());
				if(rdc.isSelected()) {
					txtkq.setText(""+(a+b));
				}else if(rdt.isSelected()) {
					txtkq.setText(""+ (a-b));
				}else if(rdn.isSelected()) {
					txtkq.setText(""+ (a*b));
				}else if(rdchia.isSelected()) {
					txtkq.setText(""+ (a/b));
				}
			}
		}
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
