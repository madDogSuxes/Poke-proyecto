package pokemone;

import org.junit.Test;

import org.junit.Assert;

class PokemonTest {

	@Test
	public void testSubirNivel() {
		Pokemon experiencia=new Pokemon();
		
		experiencia.setExperiencia(100);
		experiencia.setNivel(1);
		
		experiencia.subirNivel();
		
		Assert.assertEquals(2, experiencia.getNivel());
		
		Assert.assertTrue(experiencia.getVitalidad()>0);
		Assert.assertTrue(experiencia.getAtaque()>0);
		Assert.assertTrue(experiencia.getDefensa()>0);
		Assert.assertTrue(experiencia.getAtEsp()>0);
		Assert.assertTrue(experiencia.getDefEsp()>0);
		Assert.assertTrue(experiencia.getVelocidad()>0);
	}

}
