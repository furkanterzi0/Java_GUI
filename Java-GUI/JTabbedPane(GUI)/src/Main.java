import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame("JTabbedPane Örneği");
		
		
		JLabel lb1=new JLabel("İlk alan");
		JPanel p1=new JPanel();
		p1.add(lb1);
		
		
		JLabel lb2=new JLabel("İkinci alan");
		JPanel p2=new JPanel();
		p2.add(lb2);
		
		
		JLabel lb3=new JLabel("Üçüncu alan");
		JPanel p3=new JPanel();
		p3.add(lb3);
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(50,50, 200, 200);
		tp.add("İlk",p1);
		tp.add("İkinci",p2);
		tp.add("Üçüncü",p3);
		
		
		f.add(tp);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
