import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Program {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Buton Örneği");
		
		
		JButton btn=new JButton("Gönder");
		btn.setBounds(102,30,100,30); //btn.setBounds(x,y,width,height) Bounds=sınır
		
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona Tiklandi");
				
			}

		});
		
		
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
