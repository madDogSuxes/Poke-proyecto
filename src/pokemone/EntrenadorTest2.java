package pokemone;

import org.junit.Assert;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import java.io.InputStream;

class EntrenadorTest2 {

	@Test
	void testCapturar() {
		
		Entrenador ash=new Entrenador();
		
		ash.setPokeBalls(3);
		
		String input="n";
		
		InputStream in=new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ash.capturar();
		
		Assert.assertTrue(ash.captura);
		
		Assert.assertEquals(2, ash.getPokeBalls());
		
		Assert.assertNull(ash.getMote());
		
		ash.setPokeBalls(0);
		
		ash.capturar();
		
		Assert.assertFalse(ash.captura);
		
		Assert.assertEquals(0, ash.getPokeBalls());
		
	}

}
