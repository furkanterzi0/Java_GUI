import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame frame = new JFrame("PasswordField Örneği");
		
		JPasswordField pf = new JPasswordField();
		pf.setBounds(50, 150, 120, 25);

		JTextField tf=new JTextField();
		tf.setBounds(350, 150, 100, 25);
		
		JButton btn=new JButton("şifreyi göster");
		btn.setBounds(200,150,120,25);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sifre=String.valueOf(pf.getPassword());
				
				tf.setText(sifre);
				
			}
			
		});
		
		frame.add(tf);
		frame.add(btn);
		frame.add(pf);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
