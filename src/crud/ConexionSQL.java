package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

	protected static String url = "jdbc:mysql://localhost:3306/pokemon";
	protected static String login = "root";
	protected static String password = "";

	public static Connection getConnection() throws SQLException {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("Conexion establecida");

			// Acceso a datos utilizando el objeto de conexión

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
