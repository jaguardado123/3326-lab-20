import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalsTest {
	
	@Test
	public void testing_crocodile() {
		Class parent = Animal.class;
		Class child = Crocodile.class;
		assertTrue( parent.isAssignableFrom(child) );
	}

	@Test
	public void testing_lion() {
		Class parent = Animal.class;
		Class child = Lion.class;
		assertTrue( parent.isAssignableFrom(child) );
	}

	@Test
	public void testing_ostrich() {
		Class parent = Animal.class;
		Class child = Ostrich.class;
		assertTrue( parent.isAssignableFrom(child) );
	}

	@Test
	public void testing_zebra() {
		Class parent = Animal.class;
		Class child = Zebra.class;
		assertTrue( parent.isAssignableFrom(child) );
	}

	@Test
	public void testing_saltwater_crocodile() {
		Class parent = Animal.class;
		Class child = SaltwaterCrocodile.class;
		assertTrue( parent.isAssignableFrom(child) );
	}

	@Test
	public void testing_saltwater_crocodile2() {
		Class parent = Crocodile.class;
		Class child = SaltwaterCrocodile.class;
		assertTrue( parent.isAssignableFrom(child) );
	}
}