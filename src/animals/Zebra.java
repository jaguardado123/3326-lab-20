package animals;
public class Zebra {
	// Attributes
	public String species;
	public String genus;
	public String biome;
	public int lifespan;
	public float hoof_size;
	public float mph;

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
	public void hooves() {
		System.out.println("Zebras have " + hoof_size + " mm hoves.");
	}
	public void speed() {
		System.out.println("Zebras can run up to " + mph + " mph.");
	}
}
