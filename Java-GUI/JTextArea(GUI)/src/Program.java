import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

import javax.swing.*;
import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

public class Program {

	public static void main(String[] args) {

		JFrame f = new JFrame("TextArea Örneği");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setBackground(Color.red);
		JTextArea t = new JTextArea();
		t.setBounds(0, 0, 250, 200);

		JLabel l = new JLabel();
		l.setBounds(200, 150, 200, 50);
		JLabel l2 = new JLabel();
		l2.setBounds(200, 190, 200, 50);
		JButton btn = new JButton("kelime ve karakter ölçer");
		btn.setBounds(100, 250, 250, 50);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String metin = t.getText();
				String words[] = metin.split("\\s");
				l.setText("kelime sayisi : " + words.length);
				l2.setText("karakter: "+metin.length());

			}
		});

		f.add(l);
		f.add(l2);
		f.add(btn);
		f.add(t);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
