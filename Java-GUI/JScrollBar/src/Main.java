import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("ScrollBar Örneği");
		JLabel lbl=new JLabel();
		lbl.setBounds(100,50,300,30);
		JScrollBar s=new JScrollBar(JScrollBar.VERTICAL);
		s.setMinimum(0);
		s.setMaximum(100);
		s.setBounds(100,100,15,100);
		
		s.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lbl.setText("ScrollBar değeri: "+s.getValue());
				
			}
		});
		
		f.add(lbl);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
