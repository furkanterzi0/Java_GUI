import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBox Örneği");
		
		JLabel l1=new JLabel("Seçim Yapın !");
		l1.setBounds(150,50,300,50);

		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(150, 100, 250, 50);

		JCheckBox cb2 = new JCheckBox("Java");
		cb2.setBounds(150, 150, 250, 50);
		
		
		
		cb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				l1.setText("C++ "+(e.getStateChange()==1 ? "şecildi" : "şecilmedi" ));
				
			}
		});
		
		/* buttonla checkbox aksiyon dinleme
		JButton btn = new JButton("Kontrol");
		btn.setBounds(150, 200, 150, 20);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb1.isSelected()) {
					System.out.println(cb1.getText() + " Secildi");
				}
				if (cb2.isSelected()) {
					System.out.println(cb2.getText() + " Secildi");
				}

			}
		});
		*/
		frame.add(l1);
		
		frame.add(cb1);
		frame.add(cb2);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		//frame.add(btn);

	}

}
