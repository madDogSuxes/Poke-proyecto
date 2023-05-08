package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioCrud {

	private static boolean cambioDeVentana;
	
	public static void insertarDatos(String nombre, String contraseña) {

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String sql = "INSERT INTO usuario (nombre_usuario, contraseña_usuario)" + " VALUES ('" + nombre + "', '"
					+ contraseña + "')";
			statement.executeUpdate(sql);

			System.out.println("Datos insertados correctamente.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void comprobarDatos(String nombre, String contraseña) {
		Connection connection = null;
		PreparedStatement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);

			String sql = "SELECT nombre_usuario, contraseña_usuario FROM usuario WHERE nombre_usuario = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, nombre);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String contraseñaAlmacenada = resultSet.getString("contraseña_usuario");
				
				if (contraseña.equals(contraseñaAlmacenada)) {
					System.out.println("Datos comprobados correctamente.");
					// Realizar el cambio de ventana aquí
					cambioDeVentana = true;
					
				} else {
					System.out.println("La contraseña es incorrecta.");
					cambioDeVentana = false;
					// Mostrar un mensaje de error
				}
				
			} else {
				System.out.println("El usuario no existe.");
				cambioDeVentana = false;
				// Mostrar un mensaje de error
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static boolean obtenerCambioDeVentana() {
		return cambioDeVentana;
	}
	
	public static void valorCambioDeVentana() {
		cambioDeVentana = true;
	}

}
