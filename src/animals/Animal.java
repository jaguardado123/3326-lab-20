package animals;
public class Animal {
	// Attributes
	public String species;
	public String genus;
	public String biome;
	public int lifespan;

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
}