import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame f=new JFrame("JList Örneği");
		
		DefaultListModel<String> l=new DefaultListModel<>();
		l.addElement("C++");
		l.addElement("C");
		l.addElement("Java");
		l.addElement("php");
		
		JList<String> list=new JList<>(l);
		list.setBounds(100,100,75,75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION); //tek bir tane secme

		DefaultListModel<String> l2=new DefaultListModel<>();
		l2.addElement("Swing");
		l2.addElement("Laravel");
		l2.addElement("VueJs");
		l2.addElement("Bootstrap");
		
		JList<String> list2=new JList<>(l2);
		list2.setBounds(100,200,75,75);
		
		JButton btn=new JButton("Göster");
		btn.setBounds(200,150,80,30);
		
		btn.addActionListener(new ActionListener() {
			String txt="";
			@Override
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex()!=-1){
					txt="Secilen Programlama Dili: "+list.getSelectedValue();
					System.out.println(txt);	
					
				}
				if(list.getSelectedIndex()!=-1) {
					txt+=", secilen Framework: ";
					for(Object item :list2.getSelectedValuesList()) {
						txt+=item+" ";
						
					}
					
				}
				System.out.println(txt);
			}
		});
		
		
		
		f.add(list);
		f.add(list2);
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
