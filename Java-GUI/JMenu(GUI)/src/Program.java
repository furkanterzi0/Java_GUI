import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame f=new JFrame("Menu Örneği");
		
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("Ana menü");
		JMenu subMenu= new JMenu("Alt Menü");
		JMenuItem i1=new JMenuItem("Menu 1");
		JMenuItem i2=new JMenuItem("Menu 2");
		JMenuItem i3=new JMenuItem("Menu 3");
		
		
		i1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(i1, "Menü 1'e tıklandı", "Bilgi", 1);
				
			}
		});
		
		JMenuItem a1=new JMenuItem("Menu 1");
		JMenuItem a2=new JMenuItem("Menu 2");
		subMenu.add(a1);
		subMenu.add(a2);
		
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(subMenu);
		
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
