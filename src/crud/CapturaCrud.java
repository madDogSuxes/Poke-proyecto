package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pokemone.Pokemon;

public class CapturaCrud {
	
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
	
	public static Pokemon capturarPokemon() {
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

			String sql = "INSERT INTO pokemon (num_pokedex, mote, sexo, nivel, vitalidad, ataque, defensa, ata_especial, def_especial, velocidad, estamina, fertilidad, equipo, nombre_pok) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, p.numPokedex());
			preparedStatement.setString(2, p.getMote());
			preparedStatement.setString(3, p.getSexo());
			preparedStatement.setInt(4, p.getNivel());
			preparedStatement.setInt(5, p.getVitalidad());
			preparedStatement.setInt(6, p.getAtaque());
			preparedStatement.setInt(7, p.getDefensa());
			preparedStatement.setInt(8, p.getAtEsp());
			preparedStatement.setInt(9, p.getDefEsp());
			preparedStatement.setInt(10, p.getVelocidad());
			preparedStatement.setInt(11, p.getEstamina());
			preparedStatement.setInt(12, p.getFertilidad());
			preparedStatement.setString(13, p.getNombre());

			preparedStatement.executeUpdate();

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
