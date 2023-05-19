package pokemone;

import org.junit.Assert;

import org.junit.Test;


class PokemonTest {

	@Test
	void testSubirNivel() {
		Pokemon pikachu=new Pokemon();
		
		pikachu.setExperiencia(100);
		
		pikachu.setNivel(1);
		
		pikachu.subirNivel();
		
		Assert.assertEquals(2, pikachu.getNivel());
		
		Assert.assertTrue(pikachu.getVitalidad()>0);
		Assert.assertTrue(pikachu.getAtaque()>0);
		Assert.assertTrue(pikachu.getDefensa()>0);
		Assert.assertTrue(pikachu.getAtEsp()>0);
		Assert.assertTrue(pikachu.getDefEsp()>0);
		Assert.assertTrue(pikachu.getVelocidad()>0);
	}

}
