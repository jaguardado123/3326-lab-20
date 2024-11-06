
import static org.junit.Assert.*;

import org.junit.Test;

import animals.*;

public class AnimalsTest {
	
	@Test
	public void testing_crocodile() {
		Animal parent = new Animal();
		Crocodile child = new Crocodile();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_lion() {
		Animal parent = new Animal();
		Lion child = new Lion();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_ostrich() {
		Animal parent = new Animal();
		Ostrich child = new Ostrich();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_zebra() {
		Animal parent = new Animal();
		Zebra child = new Zebra();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_saltwater_crocodile() {
		Animal parent = new Animal();
		SaltwaterCrocodile child = new SaltwaterCrocodile();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_saltwater_crocodile2() {
		Crocodile parent = new Crocodile();
		SaltwaterCrocodile child = new SaltwaterCrocodile();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}
}