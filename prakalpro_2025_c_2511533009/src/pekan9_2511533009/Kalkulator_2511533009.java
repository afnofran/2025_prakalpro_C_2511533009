package pekan9_2511533009;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Kalkulator_2511533009 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tampilan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511533009 frame = new Kalkulator_2511533009();
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
	String tampilanAngka = "";
	String lastOperator = "";
	double angka = 0;
	double tempAngka = 0;
	
	public void gabungkanAngka(int num) {
		tampilanAngka += String.valueOf(num);
		tampilan.setText(tampilanAngka);
	}
	
	public void bersihkanTampilan() {
		tampilanAngka = "";
		angka = 0;
		tampilan.setText(tampilanAngka);
	}
	
	public Kalkulator_2511533009() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tampilan = new JTextField();
		tampilan.setBounds(10, 10, 312, 111);
		contentPane.add(tampilan);
		tampilan.setColumns(10);
		
		JButton tombol = new JButton("<-");
		tombol.setBounds(10, 131, 75, 75);
		contentPane.add(tombol);
		tombol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tampilanAngka.length()>=2) {
					tampilanAngka = tampilanAngka.substring(0, tampilanAngka.length()-1);
					angka = Double.valueOf(tampilanAngka);	
					tampilan.setText(tampilanAngka);
				}else {
					bersihkanTampilan();
				}
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.setBounds(87, 131, 75, 75);
		contentPane.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tampilanAngka = "";
				angka = 0;
				tempAngka = 0;
				lastOperator = "";
				tampilan.setText(tampilanAngka);
			}
		});
		
		JButton tombol_2 = new JButton("00");
		tombol_2.setBounds(165, 131, 75, 75);
		contentPane.add(tombol_2);
		tombol_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(0);
				gabungkanAngka(0);
			}
		});
		
		JButton tombol_3 = new JButton("+");
		tombol_3.setBounds(242, 131, 75, 75);
		contentPane.add(tombol_3);
		tombol_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastOperator = "plus";
				angka = Double.valueOf(tampilanAngka);
				tempAngka += angka;
				bersihkanTampilan();
				
			}
		});
		
		JButton tombol_3_1 = new JButton("-");
		tombol_3_1.setBounds(242, 209, 75, 75);
		contentPane.add(tombol_3_1);
		tombol_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastOperator = "minus";
				angka = Double.valueOf(tampilanAngka);
				tempAngka = angka - tempAngka;
				bersihkanTampilan();
			}
		});
		
		JButton tombol_2_1 = new JButton("9");
		tombol_2_1.setBounds(165, 209, 75, 75);
		contentPane.add(tombol_2_1);
		tombol_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(9);
			}
		});
		
		JButton tombol_1_1 = new JButton("8");
		tombol_1_1.setBounds(87, 209, 75, 75);
		contentPane.add(tombol_1_1);
		tombol_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(8);
			}
		});
		
		JButton tombol_4 = new JButton("7");
		tombol_4.setBounds(10, 209, 75, 75);
		contentPane.add(tombol_4);
		tombol_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(7);
			}
		});
		
		JButton tombol_3_2 = new JButton("*");
		tombol_3_2.setBounds(242, 289, 75, 75);
		contentPane.add(tombol_3_2);
		tombol_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastOperator = "kali";
				angka = Double.valueOf(tampilanAngka);
				tempAngka = angka;
				bersihkanTampilan();
			}
		});
		
		JButton tombol_2_2 = new JButton("6");
		tombol_2_2.setBounds(165, 289, 75, 75);
		contentPane.add(tombol_2_2);
		tombol_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(6);
			}
		});
		
		JButton tombol_1_2 = new JButton("5");
		tombol_1_2.setBounds(87, 289, 75, 75);
		contentPane.add(tombol_1_2);
		tombol_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(5);
			}
		});
		
		JButton tombol_5 = new JButton("4");
		tombol_5.setBounds(10, 289, 75, 75);
		contentPane.add(tombol_5);
		tombol_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(4);
			}
		});
		
		JButton tombol_3_3 = new JButton("/");
		tombol_3_3.setBounds(242, 369, 75, 75);
		contentPane.add(tombol_3_3);
		tombol_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				lastOperator = "bagi";
				angka = Double.valueOf(tampilanAngka);
				tempAngka = angka;
				bersihkanTampilan();
			}
		});
		
		JButton tombol_2_3 = new JButton("3");
		tombol_2_3.setBounds(165, 369, 75, 75);
		contentPane.add(tombol_2_3);
		tombol_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(3);
			}
		});
		
		JButton tombol_1_3 = new JButton("2");
		tombol_1_3.setBounds(87, 369, 75, 75);
		contentPane.add(tombol_1_3);
		tombol_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(2);
			}
		});
		
		JButton tombol_6 = new JButton("1");
		tombol_6.setBounds(10, 369, 75, 75);
		contentPane.add(tombol_6);
		tombol_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(1);
			}
		});
		
		JButton tombol_6_1 = new JButton("0");
		tombol_6_1.setBounds(10, 448, 75, 75);
		contentPane.add(tombol_6_1);
		tombol_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gabungkanAngka(0);
			}
		});
		
		JButton tombol_1_3_1 = new JButton(".");
		tombol_1_3_1.setBounds(87, 448, 75, 75);
		contentPane.add(tombol_1_3_1);
		tombol_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tampilanAngka.contains(".")) {
					tampilanAngka += ".";
					tampilan.setText(tampilanAngka);
					angka = Double.valueOf(tampilanAngka);
				}
			}
		});
		
		JButton tombol_2_3_1 = new JButton("=");
		tombol_2_3_1.setBounds(165, 448, 75, 75);
		contentPane.add(tombol_2_3_1);
		tombol_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				angka = Double.valueOf(tampilanAngka);
				if(lastOperator == "plus") {
					angka += tempAngka;
					tampilan.setText(String.valueOf(angka));
					tempAngka=angka;
					angka = 0;
				}else if (lastOperator == "minus") {
					angka = tempAngka - angka;
					tampilan.setText(String.valueOf(angka));
					tempAngka=angka;
					angka = 0;
				}else if (lastOperator == "kali") {
					angka = tempAngka * angka;
					tampilan.setText(String.valueOf(angka));
					tempAngka = angka;
					angka = 0;
				}else if (lastOperator == "bagi") {
					angka = tempAngka / angka;
					tampilan.setText(String.valueOf(angka));
					tempAngka = angka;
					angka = 0;
				}else if (lastOperator == "sisabagi") {
					angka = tempAngka % angka;
					tampilan.setText(String.valueOf(angka));
					tempAngka = angka;
					angka = 0;
				}
			}
		});
		
		JButton tombol_3_3_1 = new JButton("%");
		tombol_3_3_1.setBounds(242, 448, 75, 75);
		contentPane.add(tombol_3_3_1);
		tombol_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastOperator = "sisabagi";
				angka = Double.valueOf(tampilanAngka);
				tempAngka = angka;
				bersihkanTampilan();
			}
		});

	}

}
