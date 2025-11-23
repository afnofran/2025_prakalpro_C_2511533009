package pekan8_2511533009;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class tugasAlproPekan8_2511533009 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasAlproPekan8_2511533009 frame = new tugasAlproPekan8_2511533009();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tugasAlproPekan8_2511533009() {		
		setTitle("Operator Relasional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR RELASIONAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 10, 216, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 41, 124, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BIlangan 2");
		lblNewLabel_2.setBounds(10, 70, 93, 12);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(10, 98, 59, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(10, 138, 93, 12);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(71, 38, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(71, 67, 96, 18);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(71, 135, 96, 18);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {">", "<", ">=", "<=", "==", "!="}));
		cbOperator.setBounds(71, 94, 52, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Bandingkan");
		btnNewButton.addActionListener(new ActionListener() {
			boolean hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
//					pesanPeringatan("Bilangan 1 harus diisi");int a= Integer.valueOf(txtBil1.getText());
				} else if(txtBil2.getText().trim().isEmpty()) {
//					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						int a= Integer.valueOf(txtBil1.getText());
						int b= Integer.valueOf(txtBil2.getText());
						int c= cbOperator.getSelectedIndex();
						if(c==0) {
							hasil=a>b;
						}
						if(c==1) {
							hasil = a<b;
						}
						if (c==2) {
							hasil = a>=b;
						}
						if (c==3) {
							hasil = a<=b;
						}
						if (c==4) {
							hasil = a==b;
						}
						if (c==5) {
							hasil = a!=b;
						}
						txtHasil.setText(String.valueOf(hasil));
					}catch(NumberFormatException ex) {
						//PesanEror("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
			}
		});
		btnNewButton.setBounds(181, 94, 110, 20);
		contentPane.add(btnNewButton);
	}

}
