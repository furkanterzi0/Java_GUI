import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class HesapMakinesii extends JFrame {

	private JPanel contentPane;
	private JTextField screen;
	private double number,answer;
	int operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesii frame = new HesapMakinesii();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void calculate() {
		
		switch (operation) {
		case 1:
			answer=number+ Double.parseDouble(screen.getText());
			screen.setText(Double.toString(answer));
			break;
		case 2:
			answer=number- Double.parseDouble(screen.getText());
			screen.setText(Double.toString(answer));
			break;
		case 3:
			answer=number* Double.parseDouble(screen.getText());
			screen.setText(Double.toString(answer));
			break;
		case 4:
			answer=number/ Double.parseDouble(screen.getText());
			screen.setText(Double.toString(answer));
			break;
			
		}
		
		
	}
	
	public void yazdir(ActionEvent e) {
		screen.setText(screen.getText()+e.getActionCommand());
	}

	/**
	 * Create the frame.
	 */
	public HesapMakinesii() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi(FURKİTURKİ)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 216, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(394, 0, 72, 23);
		contentPane.add(label1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 27, 456, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		screen = new JTextField();
		screen.setEditable(false);
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		screen.setBounds(10, 10, 436, 56);
		panel.add(screen);
		screen.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 113, 456, 370);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_11_1 = new JButton("7");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("8");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_2);
		
		JButton btnNewButton_11_3 = new JButton("9");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_3);
		
		JButton btnNewButton_11_4 = new JButton("+");
		btnNewButton_11_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(screen.getText());
				operation=1;
				label1.setText(Double.toString(number)+e.getActionCommand());
				screen.setText("");
				
			}
		});
		btnNewButton_11_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_4);
		
		JButton btnNewButton_11 = new JButton("4");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_11_6 = new JButton("5");
		btnNewButton_11_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_6);
		
		JButton btnNewButton_11_5 = new JButton("6");
		btnNewButton_11_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_5);
		
		JButton btnNewButton_11_9 = new JButton("-");
		btnNewButton_11_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(screen.getText());
				operation=2;
				label1.setText(Double.toString(number)+e.getActionCommand());
				screen.setText("");
			}
		});
		btnNewButton_11_9.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_9);
		
		JButton btnNewButton_11_8 = new JButton("1");
		btnNewButton_11_8.setForeground(new Color(0, 0, 0));
		btnNewButton_11_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_8);
		
		JButton btnNewButton_11_7 = new JButton("2");
		btnNewButton_11_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_7);
		
		JButton btnNewButton_11_10 = new JButton("3");
		btnNewButton_11_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_10.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_10);
		
		JButton btnNewButton_11_12 = new JButton("*");
		btnNewButton_11_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(screen.getText());
				operation=3;
				label1.setText(Double.toString(number)+e.getActionCommand());
				screen.setText("");
			}
		});
		btnNewButton_11_12.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_12);
		
		JButton btnNewButton_11_11 = new JButton("0");
		btnNewButton_11_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yazdir(e);
			}
		});
		btnNewButton_11_11.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_11);
		
		JButton btnNewButton_11_13 = new JButton("=");
		btnNewButton_11_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_11_13.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_13);
		
		JButton btnNewButton_11_14 = new JButton("C");
		btnNewButton_11_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("");
			}
		});
		btnNewButton_11_14.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_14);
		
		JButton btnNewButton_11_15 = new JButton("/");
		btnNewButton_11_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(screen.getText());
				operation=4;
				label1.setText(Double.toString(number)+e.getActionCommand());
				screen.setText("");
			}
		});
		btnNewButton_11_15.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(btnNewButton_11_15);
	}
}
