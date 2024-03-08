import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame("JTable Örneği");
		
		String [][]veri= {{"1","Mat","85"},{"2","Fen","29"},{"3","Sos","85"}};
		String []baslik= {"ID","DERS","NOT"};
		
		JTable jt=new JTable(veri, baslik);
		jt.setBounds(30,40,200,300);
		
		JScrollPane sp=new JScrollPane(jt);

		f.add(sp);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
