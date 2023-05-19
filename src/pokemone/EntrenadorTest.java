package pokemone;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import java.io.InputStream;

class EntrenadorTest {

	@Test
	void testEntrenar() {
		Entrenador pikachu=new Entrenador();
		
		pikachu.setNivel(5);
		pikachu.setPokeDollars(900);
		
		String input="1";
		InputStream in= new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		pikachu.entrenar();
		
		int pokeDollarsRestantes=1000 -(20*pikachu.getNivel());
		Assert.assertEquals(pokeDollarsRestantes, pikachu.getPokeDollars());
		
		int aumentoEsperado=5;
		int defensaEsperada=pikachu.getDefensa()+aumentoEsperado;
		int defEspEsperada=pikachu.getDefEsp()+aumentoEsperado;
		int vitalidadEsperada=pikachu.getVitalidad()+aumentoEsperado;
		
		Assert.assertEquals(defensaEsperada, pikachu.getDefensa());
		Assert.assertEquals(defEspEsperada, pikachu.getDefEsp());
		Assert.assertEquals(vitalidadEsperada, pikachu.getVitalidad());
		
	}

}
