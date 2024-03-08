import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECFieldF2m;
import java.sql.SQLException;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int kontrol = 0;
		JFrame f = new JFrame("Furtagram Giris");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l1 = new JLabel("Kullanıcı Adı ");
		l1.setBounds(150, 100, 90, 30);

		JTextField tf1 = new JTextField();
		tf1.setBounds(235, 105, 200, 25);

		JLabel l2 = new JLabel("Şifre ");
		l2.setBounds(150, 150, 90, 30);

		JPasswordField tf2 = new JPasswordField();
		tf2.setBounds(235, 155, 200, 25);

		JLabel l3 = new JLabel();
		l3.setBounds(253, 350, 250, 50);

		JButton btn1 = new JButton("Giriş Yap");
		btn1.setBounds(235, 245, 200, 30);

		JLabel l4 = new JLabel();
		l4.setBounds(235, 185, 90, 30);

		DogrulamaKodu dKod = new DogrulamaKodu();
		String kod = dKod.kod();
		l4.setText(kod);

		JTextField tf3 = new JTextField();
		tf3.setBounds(290, 190, 145, 25);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String parola = new String(tf2.getText());
				Giris g = new Giris();
				try {
					g.girisIslemi(tf1.getText(), parola);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (g.kontrol >= 1) {
					if (kod.equals(tf3.getText()))
						l3.setText("***GİRİŞ YAPILDI***");
					else{
						JOptionPane.showMessageDialog(btn1, "Doğrulama Kod Hatası","Hata",2);
						l3.setText("!!! Doğrulama Kodu Yanlış !!!");
					}	
				} else if (g.kontrol == 0) {
					l3.setText("!!! Kullanıcı Adı veya Şifre Hatalı !!!");
				}
				g.kontrol = 0;

			}
		});

		JButton btn2 = new JButton("Yeni Hesap Oluştur");
		btn2.setBounds(265, 305, 150, 30);

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame f2 = new JFrame("Furtagram Kayıt");
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JLabel l1 = new JLabel("Kullanıcı Adı ");
				l1.setBounds(150, 70, 90, 30);

				JTextField tf1 = new JTextField();
				tf1.setBounds(235, 75, 200, 25);

				JLabel l2 = new JLabel("Şifre ");
				l2.setBounds(150, 120, 90, 30);

				JLabel l3 = new JLabel();
				l3.setBounds(250, 380, 300, 50);

				JPasswordField tf2 = new JPasswordField();
				tf2.setBounds(235, 125, 200, 25);

				JLabel l4 = new JLabel();
				l4.setBounds(235, 180, 250, 50);

				DogrulamaKodu k2 = new DogrulamaKodu();
				String kod2 = k2.kod();
				l4.setText(kod2);

				JTextField tf3 = new JTextField();
				tf3.setBounds(290, 193, 145, 25);
				
				JRadioButton radio1=new JRadioButton("Erkek");
				radio1.setBounds(230,155,80,30);
				
				JRadioButton radio2=new JRadioButton("Kadın");
				radio2.setBounds(310,155,80,30);
				
				JRadioButton radio3=new JRadioButton("Belitrmek İstemiyorum",true);
				radio3.setBounds(390,155,200,30);
				
				ButtonGroup bt=new ButtonGroup();
				bt.add(radio1);
				bt.add(radio2);
				bt.add(radio3);

				JCheckBox cb = new JCheckBox("Furtagram Verilerimi Kullanabilir");
				cb.setBounds(235, 220, 250, 30);

				JButton btn1 = new JButton("Kaydol");
				btn1.setBounds(235, 255, 200, 30);
				
				
				
				btn1.addActionListener(new ActionListener() {
					int s = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						Boolean kodKontrol = kod2.equals(tf3.getText());
						Boolean cbKontrol = cb.isSelected();
						System.out.println(kodKontrol);
						System.out.println(cbKontrol);
						if (cbKontrol == true && kodKontrol == true) {
							String parola = new String(tf2.getText());
							Kayit k = new Kayit(tf1.getText(), parola);
							f2.remove(btn1);
							try {
								k.kayitIslemi();

							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							if (Kayit.kontrol >= 1)
								l3.setText("***Kayıt Başarıyla Oluşturuldu***");

						} else if (cbKontrol == true && kodKontrol == false) {
							l3.setText("!!! Doğrulama Kodu Yanlış !!!");
						} else if (cbKontrol == false && kodKontrol == true) {
							JOptionPane.showMessageDialog(btn2, "Veri İzni Hatasi","Hata",2);
							l3.setText("!!! Veri İzni Verilmeli !!!");
						} else if (cbKontrol == false && kodKontrol == false)
							JOptionPane.showMessageDialog(btn2, "Veri İzni ve Doğrulama Kod Hatasi","Hata",2);
							l3.setText("!!! Veri İzni Verilmeli ve Doğrulama Kodu Doğru Girilmeli !!!");

					}
				});

				JButton btn2 = new JButton("Giriş Ekranına Dön");
				btn2.setBounds(265, 325, 150, 30);

				btn2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						f2.setVisible(false);
						f.setVisible(true);

					}
				});

				f2.add(l1);
				f2.add(tf1);
				f2.add(l2);
				f2.add(l3);
				f2.add(tf2);
				f2.add(tf3);
				f2.add(btn1);
				f2.add(btn2);
				f2.add(cb);
				f2.add(l4);
				f2.add(radio1);
				f2.add(radio2);
				f2.add(radio3);
				f2.setSize(700, 500);
				f2.setLayout(null);
				f2.setVisible(true);

				f.setVisible(false);

			}
		});

		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(tf3);
		f.add(btn1);
		f.add(btn2);
		f.add(l3);
		f.add(l4);
		f.setSize(700, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
