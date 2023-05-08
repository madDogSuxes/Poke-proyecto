package pokemone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//public class Main {
//	protected static String url = "jdbc:mysql://localhost:3306/pokemon";
//	protected static String login = "root";
//	protected static String password = "";
//
//	public static void main(String[] args) {
//
//	}
//
//	public void connection() {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection(url, login, password);
//			System.out.println("Conexion establecida");
//
//			// Acceso a datos utilizando el objeto de conexión
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (connection != null) {
//				try {
//					connection.close();
//					System.out.println("Conexion cerrada");
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//
//	public static void insertarDatos(String nombre, String contraseña) {
//		Connection connection = null;
//		Statement statement = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(url, login, password);
//			statement = connection.createStatement();
//
//			String sql = "INSERT INTO usuario (nombre_usuario, contraseña_usuario)" + " VALUES ('" + nombre + "', '"
//					+ contraseña + "')";
//			statement.executeUpdate(sql);
//
//			System.out.println("Datos insertados correctamente.");
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (statement != null) {
//				try {
//					statement.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
