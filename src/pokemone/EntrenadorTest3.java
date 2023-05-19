package pokemone;

import org.junit.Assert;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import java.io.InputStream;

class EntrenadorTest3 {

	@Test
	void testMoverACaja() {
		
		Entrenador ash=new Entrenador();
		
		ash.setSeleccionarPokemon(true);
		
		String input="SI";
		InputStream in=new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ash.moverACaja();
		
		Assert.assertEquals(1, ash.getPokemonEnCaja());
		
		Assert.assertEquals(-1, ash.getPokemonEnPrincipal());
		
		input="NO";
		in=new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ash.moverACaja();
		
		Assert.assertEquals(1, ash.getPokemonEnCaja());
		
		Assert.assertEquals(-1, ash.getPokemonEnPrincipal());
		
	}

}
