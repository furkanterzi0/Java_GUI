import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame("OptionPane Örneği");
		
		JOptionPane.showMessageDialog(f, "estarabim");
		JOptionPane.showMessageDialog(f, "hata", "hata", 2);
		String str= JOptionPane.showInputDialog(f,"Adınız");
		System.out.println(str);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
