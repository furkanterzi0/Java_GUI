import java.awt.*;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame("Layout");
		
		JButton jb1 =new JButton("b1");
		JButton jb2 =new JButton("b2");
		JButton jb3 =new JButton("b3");
		JButton jb4 =new JButton("b4");
		JButton jb5 =new JButton("b5");
		
		/*
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout()); //new FlowLayout soldan saga sırala
		p.add(jb1,BorderLayout.NORTH);
		p.add(jb2,BorderLayout.SOUTH);
		p.add(jb3,BorderLayout.WEST);
		p.add(jb4,BorderLayout.EAST);
		p.add(jb5,BorderLayout.CENTER);
		*/
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2));
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		
		
		f.add(p);
		//f.pack(); // ici ne kadarsa boyut o kadar
		f.setSize(400,400);
		f.setVisible(true);

	}

}
