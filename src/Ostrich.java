public class Ostrich {
	// Attributes
	public String species;
	public String genus;
	public String biome;
	public int lifespan;
	public float wingspan;
	public float height;

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
	public void wings() {
		System.out.println("Ostriches have a " + wingspan + " m wingspan.");
	}
	public void neck_length() {
		System.out.println("Ostriches have a " + (height / 2.f) + " m long neck.");
	}
}
