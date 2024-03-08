
import java.security.PublicKey;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Giris {
	public static int kontrol = 0, kontrol2 = 0;

	public Giris() {

	}

	public void girisIslemi(String id, String parola) throws SQLException {

		int sayac = 0;
		ArrayList<String> ids = new ArrayList<>();
		ArrayList<String> parolas = new ArrayList<>();
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kullanici?user=root&password=123");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM kullanicibilgileri");
		while (rs.next()) {
			int i = 0;
			ids.add(i, rs.getString("id"));
			parolas.add(i, rs.getString("parola"));

			i++;
			sayac++;
		}

		while (true) {

			String ii = id;
			String pp = parola;
			int ka = (sayac - 1);
			for (int d = 0; d < sayac; d++) {
				if (ii.equals(ids.get(d)) && pp.equals(parolas.get(d))) {
					ka++;
					kontrol++;
					break;

				} else if (ka == d) {
					System.out.println("*");
					kontrol2++;
					break;

				}

			}
			if (ka >= sayac)
				break;
			if (kontrol2 != 0)
				break;
			kontrol2 = 0;
		}

	}

}
