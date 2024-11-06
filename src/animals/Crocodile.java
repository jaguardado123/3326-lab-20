package animals;
public class Crocodile {
	// Attributes
	public String species;
	public String genus;
	public String biome;
	public int lifespan;
	public float bite_force;
	public float swim_speed;

	// Methods
	public void show_taxonomy() {
		System.out.println("Species: " + species + ", Genus: " + genus);
	}
	public void show_habitat() {
		System.out.println("Lives in " + biome + " regions.");
	}
	public void lifespan() {
		System.out.println("Can live up to " + lifespan + " years.");
	}
	public void bite() {
		System.out.println("Crocodiles have a " + bite_force + " PSI biteforce.");
	}
	public void swim() {
		System.out.println("Crocodiles can swim up to "+ swim_speed + " mph.");
	}
}
