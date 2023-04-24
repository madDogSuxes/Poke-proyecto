package pokemone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/Banco ";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("Conexión establecida");
			//Acceso a datos utilizando el objeto de conexión
		} catch (SQLException sqle) {
			Throwable e = null;
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}