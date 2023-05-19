package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import pokemone.Pokemon;

public class PokedexCrud {
	public static LinkedList<Pokemon> mostrarPokedex() {

        LinkedList<Pokemon> coleccionPokedex = new LinkedList<Pokemon>();

        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/pokemon ";
        String login = "root";
        String password = "";

        String query = "SELECT num_pokedex, nombre_pokemon, tipo1, tipo2 FROM pokedex ORDER BY NUM_POKEDEX;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setNumPokedex(rs.getInt("num_pokedex"));
                pokemon.setNombre(rs.getString("nombre_pokemon"));
                pokemon.setTipo1(rs.getString("tipo1"));
                pokemon.setTipo2(rs.getString("tipo2"));

                coleccionPokedex.add(pokemon);

            }

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
        return coleccionPokedex;

    }

}

