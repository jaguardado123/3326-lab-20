
import static org.junit.Assert.*;

import org.junit.Test;

import animals.*;

public class AnimalsTest {
	
	@Test
	public void testing_crocodile() {
		// Testing for inheritance
		Animal parent = new Animal();
		Crocodile child = new Crocodile();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );

		// Testing for encapsulation
		child.set_biteForce(2.5f);
		assertEquals(true, child.get_biteForce() == 2.5f);
	}

	@Test
	public void testing_lion() {
		// Testing for inheritance
		Animal parent = new Animal();
		Lion child = new Lion();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );

		// Testing for encapsulation
		child.set_clawSize(2.5f);
		assertEquals(true, child.get_clawSize() == 2.5f);
	}

	@Test
	public void testing_ostrich() {
		// Testing for inheritance
		Animal parent = new Animal();
		Ostrich child = new Ostrich();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );

		// Testing for encapsulation
		child.set_wingspan(2.5f);
		assertEquals(true, child.get_wingspan() == 2.5f);
	}

	@Test
	public void testing_zebra() {
		// Testing for inheritance
		Animal parent = new Animal();
		Zebra child = new Zebra();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );

		// Testing for encapsulation
		child.set_hoofSize(2.5f);
		assertEquals(true, child.get_hoofSize() == 2.5f);
	}

	@Test
	public void testing_saltwater_crocodile() {
		// Testing for inheritance from
		Animal parent1 = new Animal();
		Crocodile parent2 = new Crocodile();
		SaltwaterCrocodile child = new SaltwaterCrocodile();
		assertEquals(true, parent1.getClass().isAssignableFrom(child.getClass()) );
		assertEquals(true, parent2.getClass().isAssignableFrom(child.getClass()) );

		// Testing for encapsulation
		child.set_size(2.5f);
		assertEquals(true, child.get_size() == 2.5f);
	}
}
