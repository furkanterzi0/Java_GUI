import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Label Örneği");
		JLabel l1=new JLabel();
		l1.setText("Yazı kismi");
		
		l1.setBounds(100,50,300,30);
		
		JButton btn=new JButton("Bas");
		btn.setBounds(200,150,100,30);
		btn.addActionListener(new ActionListener() {
			int j=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("butona "+j+" kere tiklandi");
				j++;
				
			}
		});
		
		f.add(btn);
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}


}
