import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Kayit {
	String id, parola;
	public static int kontrol = 0;
	Scanner inp = new Scanner(System.in);

	public Kayit(String id, String parola) {
		this.id = id;
		this.parola = parola;
	}

	public void kayitIslemi() throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kullanici?user=root&password=123");
		String q = "INSERT INTO kullanicibilgileri (id,parola) VALUES (?,?)";
		PreparedStatement pt = c.prepareStatement(q);
		pt.setString(1, this.id);
		pt.setString(2, this.parola);
		pt.executeUpdate();
		pt.close();
		kontrol++;
	}

}