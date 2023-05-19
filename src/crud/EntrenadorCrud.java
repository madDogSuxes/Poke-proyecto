package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase crud que ayuda a iniciar sesión y a completar el registro
 * @author Miguel y Jesus
 */

public class EntrenadorCrud {

	private int pokeDollar;

	private static boolean cambioDeVentana;
	
	/**
	 * @param nombre
	 * @param contraseña
	 * @param pokeDollar
	 */

	public static void insertarDatos(String nombre, String contraseña, int pokeDollar) {

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String sql = "INSERT INTO entrenador (nombre_entrenador, contraseña_entrenador, pokedollar)" + " VALUES"
					+ " ('" + nombre + "', '" + contraseña + "', '" + pokeDollar + "')";
			statement.executeUpdate(sql);

			System.out.println("Usuario creado correctamente.");

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

	/**
	 * Método que comprueba los datos para hacer el log-in
	 * @param nombre
	 * @param contraseña
	 */
	
	public static void comprobarDatos(String nombre, String contraseña) {
		Connection connection = null;
		PreparedStatement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);

			String sql = "SELECT nombre_entrenador, contraseña_entrenador FROM entrenador WHERE nombre_entrenador = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, nombre);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String contraseñaAlmacenada = resultSet.getString("contraseña_entrenador");

				if (contraseña.equals(contraseñaAlmacenada)) {
					System.out.println("El usuario y la contraseña son correctos");
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
	
	/**
	 * Métodos que ayudan a obtener el cambio de ventana una vez comprobado el registro y a actualizar Pokedollars
	 * @return pokeDollar & cambioDeVentana
	 */

	public static boolean obtenerCambioDeVentana() {
		return cambioDeVentana;
	}

	public static void valorCambioDeVentana() {
		cambioDeVentana = true;
	}

	public static int actualizarPokeDollars(int pokeDollar) {
		return pokeDollar;
	}
}
