package phiHuynhMinhQuan_21080711;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class tuan2 extends JFrame implements ActionListener{
	private JTextField txtmnv;
	private JTextField txtho;
	private JTextField txttuoi;
	private JTextField txttien;
	private JTextField txtten;
	private JRadioButton rdn;
	private DefaultTableModel tb;
	private JTable tb1;
	private JTextField txtma;
	private JButton buttontim;
	private JButton buttonthem;
	private JButton buttonxoat;
	private JButton buttonxoa;
	private JButton buttonluu;
	public tuan2() {
		setTitle("^-^");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,500);
		setLocationRelativeTo(null);
		setResizable(false);
		createGUI();
	}
	private void createGUI() {
		JPanel pn1 = new JPanel();
		add(pn1,BorderLayout.NORTH);
		JLabel lbltieude=new JLabel("THÔNG TIN NHÂN VIÊN");
		pn1.add(lbltieude);
		lbltieude.setFont(new Font("Ariah",Font.BOLD,20));
		JPanel pn2=new JPanel();
		add(pn2,BorderLayout.CENTER);
		JLabel lblmnv=new JLabel("Mã nhân viên:");
		pn2.setLayout(null);
		pn2.add(lblmnv);
		int x=0,y=0,width=85,height=20;
		lblmnv.setBounds(x,y,width,height);
		pn2.add(txtmnv =new JTextField());
		txtmnv.setBounds(85, 0, 600, 20);
		JLabel lblho=new JLabel("Họ:");
		JLabel lbltuoi =new JLabel("Tuổi:");
		JLabel lbltien =new JLabel("Tiền lương:");
		y+=30;
		lblho.setBounds(x, y, width, height);
		pn2.add(lblho);
		y+=30;
		lbltuoi.setBounds(x, y, width, height);
		pn2.add(lbltuoi);
		y+=30;
		lbltien.setBounds(x, y, width, height);
		pn2.add(lbltien);
		pn2.add(txtho=new JTextField());
		txtho.setBounds(85, 30, 260, 20);
		JLabel lblten=new JLabel("Tên nhân viên:");
		lblten.setBounds(345, 30, 90, 20);
		pn2.add(lblten);
		pn2.add(txtten=new JTextField());
		txtten.setBounds(435, 30, 250, 20);
		pn2.add(txttuoi=new JTextField());
		txttuoi.setBounds(85, 60, 480, 20);
		JLabel lblphai=new JLabel("Phái:");
		lblphai.setBounds(565, 60, 85, 20);
		pn2.add(lblphai);
		rdn=new JRadioButton("Nữ");
		rdn.setBounds(640, 60, 50, 20);
		pn2.add(rdn);
		pn2.add(txttien=new JTextField());
		txttien.setBounds(85, 90, 600, 20);	
		String []ob1= {"Mã NV","Họ","Tên","Phái","Tuổi","Tiền lương"};
		tb=new DefaultTableModel();
		tb1=new JTable(tb);
		tb1.setRowHeight(20);
		JScrollPane scroll;
		tb.setColumnIdentifiers(ob1);
		pn2.add(scroll=new JScrollPane(tb1));
		scroll.setBounds(0, 120, 700, 100);	
		String []row= {"1111","Nguyễn","Hoàng","Nam","26","4,500$"};
		tb.addRow(row);
		tb.addRow(new Object[] {"2222","Lê","Thu","Nữ","28","5,000$"});
		tb.addRow(new Object[] {"3333","Hoàng","Lê","Nam","30","5,000$"});
		tb.addRow(new Object[] {"4444","Trần","Lan","Nữ","27","3,500$"});
		JPanel pn3=new JPanel();
		add(pn3,BorderLayout.SOUTH);
		pn3.setLayout(null);
		pn3.setPreferredSize(new Dimension(20,50));
		JPanel pntim=new JPanel();
		pntim.setLayout(null);
		pn3.setBorder(BorderFactory.createTitledBorder(""));
		pn3.add(pntim);
		pntim.setBounds(0, 10, 330, 40);
		pntim.setBorder(BorderFactory.createTitledBorder(""));
		JLabel lblma= new JLabel("Nhập mã số cần tìm:");
		pntim.add(lblma);
		lblma.setBounds(0, 10, 120,20 );
		pntim.add(txtma=new JTextField());
		txtma.setBounds(130, 10, 120, 20);
		pntim.add(buttontim= new JButton("Tìm"));
		buttontim.setBounds(260, 10, 65, 25);
		JPanel pnbt= new JPanel();
//		pnbt.setLayout(null);
		pn3.add(pnbt);
		pnbt.setBounds(335, 10, 370, 40);
		pnbt.setBorder(BorderFactory.createTitledBorder(""));
		pnbt.add(buttonthem=new JButton("Thêm"));
		pnbt.add(buttonxoat=new JButton("Xóa trắng"));
		pnbt.add(buttonxoa=new JButton("Xóa"));
		pnbt.add(buttonluu=new JButton("Lưu"));
		
		
	}
	public static void main(String[] args) {
		new tuan2().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
