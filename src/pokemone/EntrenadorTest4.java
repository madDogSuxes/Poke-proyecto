package pokemone;

import org.junit.Assert;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import java.io.InputStream;

class EntrenadorTest4 {

	@Test
	void testMoverAPrincipal() {
		Entrenador ash=new Entrenador();
		
		ash.setSeleccionarPokemon(true);
		
		String input="SI";
		InputStream in=new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ash.moverAPrincipal();
		
		Assert.assertEquals(1, ash.getPokemonEnPrincipal());
		
		Assert.assertEquals(-1, ash.getPokemonEnCaja());
		
		input="NO";
		in=new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ash.moverAPrincipal();
		
		Assert.assertEquals(1, ash.getPokemonEnPrincipal());
		
		Assert.assertEquals(-1, ash.getPokemonEnCaja());
		
	}

}
