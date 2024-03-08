import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.nio.channels.IllegalBlockingModeException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setTitle("Estarabim");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("SimSun-ExtB", Font.PLAIN, 10));
		textField.setToolTipText("bu bir metin kutusu");
		textField.setBounds(113, 69, 113, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setBounds(120, 26, 95, 21);
		contentPane.add(lbl1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(48, 215, 167, 27);
		contentPane.add(chckbxNewCheckBox);
		
		
		JButton btnNewButton = new JButton("Göbder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("estarabim");
			}
		});
		btnNewButton.setBounds(113, 121, 113, 21);
		contentPane.add(btnNewButton);
	}
}
