import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f =new JFrame("RadioButton Örneği");
		
		JRadioButton r1=new JRadioButton("Erkek");
		r1.setBounds(100,150,250,50);
		r1.setActionCommand("e");
		
		JRadioButton r2=new JRadioButton("Kadın",true);
		r2.setBounds(100,200,250,50);
		r2.setActionCommand("k");
		
		JRadioButton r3=new JRadioButton("Belirtmek İstemiyorum");
		r3.setBounds(100,250,250,50);
		r3.setActionCommand("n");
		
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		
		JButton btn = new JButton("Gönder");
		btn.setBounds(100,300,140,50);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bg.getSelection().getActionCommand());
				
			}
		});
		
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(btn);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}

}
