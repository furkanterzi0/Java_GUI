import javax.swing.*;

public class Program {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JProgressBar pb=new JProgressBar(0,2000);
		pb.setBounds(40,40,160,30);
		pb.setValue(0);
		pb.setStringPainted(true);
		
	
		
		
		f.add(pb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		
		for(int i=0;i<=2000;i+=20) {
			pb.setValue(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
