import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame f=new JFrame("ComboBox Örneği");
		
		String arr[]= {"C","C++","C#","JAVA"};
		
		JComboBox cb=new JComboBox(arr);
		cb.setBounds(100,150,90,20);
		
		JButton btn=new JButton("Seç");
		btn.setBounds(100,200,70,20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text="Seçilen Programlarama Dili: "+cb.getSelectedItem();
				System.out.println(text);
			}
		});
		
		f.add(btn);
		f.add(cb);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);

	}

}
