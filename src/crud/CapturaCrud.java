package crud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pokemone.Pokemon;

/**
 * Esta clase Crud nos ayuda a construir los métodos buscarPokemon y capturarPokemon
 * @author Miguel y Jesús
 * 
 */

public class CapturaCrud {

	public static int numPokedex;

	public static Pokemon buscarPokemon() {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		Pokemon p = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "SELECT num_pokedex, nombre_pokemon, img_frente FROM pokedex ORDER BY RAND() LIMIT 1;";

			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				String sprite = rs.getString("img_frente");
				p = new Pokemon();

				p.setImgDeFrente(sprite);
			}

			System.out.println("¡Has encontrado un pokemon! Captura ahora.");

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
		return p;
	}

	/**
	 * 
	 * @param idEntrenador
	 * @param numPokedex
	 * @param mote
	 * @param sexo
	 * @param nivel
	 * @param vitalidad
	 * @param ataque
	 * @param defensa
	 * @param atEsp
	 * @param defEsp
	 * @param velocidad
	 * @param estamina
	 * @param fertilidad
	 * @param equipo
	 * @return p
	 */
	
	public static Pokemon capturarPokemon(int idEntrenador, int numPokedex, String mote, String sexo, int nivel, 
										  int vitalidad, int ataque, int defensa, int atEsp, int defEsp,
										  int velocidad, int estamina, int fertilidad, int equipo) {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";

		Pokemon p = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String sql = "INSERT INTO pokemon (id_entrenador, num_pokedex, mote, sexo, nivel, vitalidad, ataque, defensa, ata_especial, def_especial, velocidad, estamina, fertilidad, equipo)"
					+ " VALUES (" + idEntrenador + ", " + numPokedex + ", '" + mote + "', '" + sexo + "', " + nivel
					+ ", " + vitalidad + ", " + ataque + ", " + defensa + ", " + atEsp + ", "
					+ defEsp + ", " + velocidad + ", " + estamina + ", " + fertilidad + ", " + equipo+ ")";
			statement.executeUpdate(sql);

			System.out.println("Pokémon capturado y guardado en la caja.");

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
		return p;
	}

}
