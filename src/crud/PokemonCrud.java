package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import pokemone.Entrenador;
import pokemone.Estado;
import pokemone.Movimiento;
import pokemone.Pokemon;
import pokemone.Tipo;

public class PokemonCrud {
	
	/**
	 * 
	 * @param c
	 * @param e
	 * @param equipo valor 1 = equipo, valor 2 = caja
	 * @return
	 */
	
	public static LinkedList<Pokemon> listaPokemon(Connection c, Entrenador e, int lista){
		LinkedList<Pokemon> liston = new LinkedList<Pokemon>();
		String consulta = "SELECT\r\n" + "PK.ID_POKEMON\r\n" + "PK.NUM_POKEDEX\r\n" + "PK.NOM_POKEMON\r\n" 	
						  + "PK.IMG\r\n" + "PK.SONIDO\r\n" + "PK.MOTE\r\n" + "PK.ATAQUE\r\n" + 
						  "PK.ATAQUE_ESPECIAL" + "PK.DEFENSA" + "PK.DEFENSA_ESPECIAL" + "PK.ESTAMINA" +
						  "PK.FERTILIDAD\r\n" + "PK.SEXO\r\n" + "PK.TIPO1\r\n" + "PK.TIPO2\r\n" + "PK.NIVEL" + 
						  "PK.EXPERIENCIA" + "PK.ID_OBJETO" + "FROM POKEMON PK" + "INNER JOIN POKEDEX PK" 
						  + "ON PX.NUM_POLEDEX = P.NUM_POKEDEX" + "WHERE PK.ID_ENTRENADOR ="+e.getIdEntrenador();
				
		if (equipo == 1) {
			consulta += " AND EQUIPO = 1";
		}else {
			consulta += " AND EQUIPO = 2";
		}		
		
		PreparedStatement ps = null;
		try {
			ps = conexionSQL.getConnection().prepareStatement(consulta);
			ResultSet rs = ps.executeQuery(consulta);
			
			Pokemon p;
			while(rs.next()) {
				p = new Pokemon();
				p.setIdPokemon(rs.getInt("ID_POKEMON"));
				
			}
		}
	}
}
