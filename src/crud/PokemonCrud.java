package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import pokemone.Pokemon;

/**
 * Esta clase Crud ayuda a hacer las conexiones a la tabla Pokemon dentro de la bbdd Pokemon
 * @author Miguel y Jesús
 *
 */

public class PokemonCrud {

    static LinkedList<Pokemon> coleccion = new LinkedList<Pokemon>();
    static LinkedList<Pokemon> coleccionEquipo = new LinkedList<Pokemon>();

    public static LinkedList<Pokemon> getTodoPokemon() {
    	
        LinkedList<Pokemon> coleccion = new LinkedList<Pokemon>();

        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/pokemon";
        String login = "root";
        String password = "";

        String query = "SELECT p.nombre_pokemon,p.tipo1,p.tipo2,c.nivel,c.mote,c.sexo,c.vitalidad,c.ataque,c.defensa,c.ata_especial,c.def_especial,c.velocidad,c.fertilidad FROM pokedex p, pokemon c WHERE p.num_pokedex = c.id_pokemon AND c.equipo=2;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Pokemon pokemon = new Pokemon();

                pokemon.setNombre(rs.getString("p.nombre_pokemon"));
                pokemon.setNivel(rs.getInt("c.nivel"));
                pokemon.setMote(rs.getString("c.mote"));
                pokemon.setTipo1(rs.getString("p.tipo1"));
                pokemon.setTipo2(rs.getString("p.tipo2"));
                pokemon.setSexo(rs.getString("c.sexo"));
                pokemon.setVitalidad(rs.getInt("c.vitalidad"));
                pokemon.setAtaque(rs.getInt("c.ataque"));
                pokemon.setDefensa(rs.getInt("c.defensa"));
                pokemon.setAtEsp(rs.getInt("c.ata_especial"));
                pokemon.setDefEsp(rs.getInt("c.def_especial"));
                pokemon.setVelocidad(rs.getInt("c.velocidad"));
                pokemon.setFertilidad(rs.getInt("c.fertilidad"));

                System.out.println(pokemon);

                coleccion.add(pokemon);
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
        return coleccion;
    }
    
    /**
     * Métodos que añade Pokemons a la colección
     * @return coleccion
     */
    
    public static LinkedList<Pokemon> getColeccion() {
        return coleccion;
    }

    public static void setColeccion(LinkedList<Pokemon> coleccion) {
        PokemonCrud.coleccion = coleccion;
    }

    /**
     * Método que coge todo sobre el pokemon para meterlo en la tabla 
     * @return coleccionEquipo
     */
    
    public static LinkedList<Pokemon> getTodoPokemonEquipo() {
        LinkedList<Pokemon> coleccionEquipo = new LinkedList<Pokemon>();

        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/pokemon";
        String login = "root";
        String password = "";

        String query = "SELECT p.tipo1,p.tipo2,c.nivel,c.mote,c.sexo,c.vitalidad,c.ataque,c.defensa,c.ata_especial,c.def_especial,c.velocidad,c.fertilidad FROM pokedex p, pokemon c WHERE p.num_pokedex = c.id_pokemon AND c.equipo=1;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Pokemon pokemon = new Pokemon();

                pokemon.setNombre(rs.getString("p.nombre_pokemon"));
                pokemon.setNivel(rs.getInt("c.nivel"));
                pokemon.setMote(rs.getString("c.mote"));
                pokemon.setTipo1(rs.getString("p.tipo1"));
                pokemon.setTipo2(rs.getString("p.tipo2"));
                pokemon.setSexo(rs.getString("c.sexo"));
                pokemon.setVitalidad(rs.getInt("c.vitalidad"));
                pokemon.setAtaque(rs.getInt("c.ataque"));
                pokemon.setDefensa(rs.getInt("c.defensa"));
                pokemon.setAtEsp(rs.getInt("c.ata_especial"));
                pokemon.setDefEsp(rs.getInt("c.def_especial"));
                pokemon.setVelocidad(rs.getInt("c.velocidad"));
                pokemon.setFertilidad(rs.getInt("c.fertilidad"));

                System.out.println(pokemon);

                coleccionEquipo.add(pokemon);
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
        return coleccionEquipo;
    }

    public static LinkedList<Pokemon> getColeccionEquipo() {
        return coleccionEquipo;
    }

    public static void setColeccionEquipo(LinkedList<Pokemon> coleccionEquipo) {
        PokemonCrud.coleccionEquipo = coleccionEquipo;
    }
    
    /**
     * Método para transferir Pokemon a equipo
     * @param idPokemon
     * @return
     */
    
    public static Pokemon transferirPokemonEquipo(int idPokemon) {
		Pokemon pokemon = new Pokemon();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "UPDATE pokemon SET equipo=1 WHERE id_pokemon =" + idPokemon + ";";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			int rowsAffected = statement.executeUpdate(query);

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
		return pokemon;

	}
    
    /**
     * Método para transferir Pokemon a caja
     * @param idPokemon
     * @return
     */
    
    public static Pokemon transferirPokemonCaja(int idPokemon) {
		Pokemon pokemon = new Pokemon();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "UPDATE pokemon SET equipo=2 WHERE id_pokemon =" + idPokemon + ";";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			int rowsAffected = statement.executeUpdate(query);

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
		return pokemon;
	}
}
